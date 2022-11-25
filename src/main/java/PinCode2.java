public class PinCode2  extends Pair3<String, Integer>  {

    public PinCode2(String name, Integer code) {
        super(name, code);
    }

    public static void main(String[] args) {
        PinCode2 pinCode1 = new PinCode2("Max", 6060);
        PinCode2 pinCode2 = new PinCode2("Ursula", 1234);
        PinCode2 pinCode3 = new PinCode2("Tom", 4321);
        int pincode = pinCode1.getSecondValue();
        System.out.println(pincode);
    }
}
