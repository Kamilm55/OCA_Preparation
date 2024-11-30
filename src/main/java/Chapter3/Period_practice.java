package Chapter3;

import java.time.LocalTime;
import java.time.Period;

public class Period_practice {
    public static void main(String[] args) {
        Period p = Period.ofYears(4).ofWeeks(2);

//        public static Period ofYears(int years) {
//            return create(years, 0, 0);
//        }
//
//      public static Period ofWeeks(int weeks) {
//        return create(0, 0, Math.multiplyExact(weeks, 7));
//      }
        Period p2 = Period.ofYears(4) // -> returns Period with 4 years
                .ofWeeks(2);// ignore previous, returns period with 2 weeks

        // Only the last method is used
        System.out.println(p);// P14D -> 14 day
        System.out.println(p.getYears());
        System.out.println(p.getDays());

        LocalTime time = LocalTime.now();

//        time = time.plus(Period.of())
//        public static Period of(int years, int months, int days) {
//            return create(years, months, days);
//        }
        // Period does not contain time

         time = time.plus(p);// Compile, but UnsupportedTemporalTypeException Unsupported unit: Days

        System.out.println(time);



    }
}
