package org.example.Assessment;


// Assessment test no_4 in introduction
public class FeedingSchedule { public static void main(String[] args) {

    StringBuilder sb1 = new StringBuilder();
    sb1.append("Jaa").append(2);


    boolean keepGoing = true;
    int count = 0;
    int x = 3;
    while(count++ < 3) { // If count = 0 (compare as 0<3) -> count++
        int y = (1 + 2 * count) % 3; // count = 1
        switch(y) {
            default:  // There is no "break" it continues whenever it sees break it stops
              case 0: x -= 1; break;
              case 1: x += 5; // There is no break too, but it is end of the statement there is no case after this.
              // therefore  it executes x + 5 then nothing happen -> in this case it works as there is "break" statement
        // but if there is any case after that it runs after this auto
//      case 20: x += 170;
        }
                }
          System.out.println(x);
         }
}
