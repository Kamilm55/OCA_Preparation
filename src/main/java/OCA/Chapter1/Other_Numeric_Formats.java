package OCA.Chapter1;

public class Other_Numeric_Formats {
    public static void main(String[] args) {
        int octal = 017; // 15
        System.out.println(octal);
//    int octal2 = 018; // NOT COMPILE -> octal 0 - 7
        short binary = 0b1;

        long hexAsInt = 0x1A4; // as int
        long hexAsLong = 0x1A4l; //or 0X1A4l as long

        float fl = octal;// 15.0
        System.out.println(fl);
        double db = octal;// 15.0
        System.out.println(db);

        float octAsFloatWithF = 019f;// 19.0
        octAsFloatWithF = 019.3f;// 19.3
        // NOT OCTAL
        System.out.println(octAsFloatWithF);
        double octAsDoubleWithFloatingPoint = 017.45;// 17.45 // NOT OCTAL
        System.out.println(octAsDoubleWithFloatingPoint);

        double dbOctal = 017; // // 15.0
        System.out.println(dbOctal); // 15.0 --> OCTAL
    }

}
