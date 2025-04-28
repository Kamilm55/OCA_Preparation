package OCA.Chapter4_5;

public class Review_15 {
//    public void print(short num){
//        System.out.println("short primitive");
//    }
    public void print(byte num){
        System.out.println("byte");
    }
    public void print(int num){
        System.out.println("int");
    }
    public void print(Short num){
        System.out.println("Short wrapper");
    }

    public static void main(String[] args) {
        Review_15 t = new Review_15();
        short sh = 123;

        t.print(sh);// int

    }
}
