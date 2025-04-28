package OCA.Chapter2.Practice;

// OCA Practice ch2 test no_27
public class WhileLoopExample {
    public static void main(String[] args) {
        boolean balloonInflated = false;

        /*for: -> compile error for reserved keyword cannot be used as label or var name*/
        FOR: do{
            if(!balloonInflated){
                balloonInflated = true;
                System.out.print("inflate-");
            }
        }
      /*this label give compile error*/  /*INNER:*/
        while (!


                balloonInflated);// valid

        System.out.println("done");
    }
}
