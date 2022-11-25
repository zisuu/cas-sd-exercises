import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HttpServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8881);
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(inputStream);
            PrintWriter writer = new PrintWriter(outputStream);

            String requestLine = scanner.nextLine();
            System.out.println(requestLine);
            String[] tokens = requestLine.split(" ");
            Path filePath = Paths.get("/tmp/", tokens[1]);
            if (Files.exists(filePath)) {
                byte[] content = Files.readAllBytes(filePath);
                writer.println("HTTP/1.8 200 OK");
                writer.println();
                outputStream.write(content);
            } else {
                writer.println("HTTP/1.8 404 Not Found");
            }
            socket.close();
        }
    }
}
