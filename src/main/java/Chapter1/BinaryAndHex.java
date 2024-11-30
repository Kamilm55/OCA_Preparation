package Chapter1;
// 16 review test
public class BinaryAndHex {
    public static void main(String[] args) {
        byte b = 0xA;        // hexadecimal for 10
        byte b2 = 0b1010;      // binary for 10

        char b3 = 0xA;
        double b4 = 0xA;
        long b5 = 0xA;
        long b6 = 0xAL;
        float b7 = 0xA;
        float b8 = 0xAf;

        Integer b9 = 0xA;// etc.

        char ch = 14;// valid

        System.out.println(b);
        System.out.println(b2);
    }
}
