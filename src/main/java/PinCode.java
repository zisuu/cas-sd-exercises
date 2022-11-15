public class PinCode extends Pair2<String, Integer> {

    public PinCode(String name, Integer code) {
        super(name, code);
    }

    public static void main(String[] args) {
        PinCode pinCode1 = new PinCode("Max", 6060);
        PinCode pinCode2 = new PinCode("Ursula", 1234);
        PinCode pinCode3 = new PinCode("Tom", 4321);
//        int pincode = (int)pinCode1.getSecondValue();
        int code = pinCode1.getSecondValue();
        System.out.println(code);
    }

}
