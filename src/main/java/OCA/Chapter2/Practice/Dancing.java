package OCA.Chapter2.Practice;

public class Dancing {
    public static void main(String[] args) {
        System.out.println(2/5);// 0 int
        int leaders = 10 * (2 + (1 + 2 / 5));// Pay attention to balanced parentheses
        System.out.println( 2 + leaders < 10 ? "t" : "f");

        // 2 + leaders = 32 < 10
        //  2 + 32 < 10 // + precedes <  relational
    }
}
