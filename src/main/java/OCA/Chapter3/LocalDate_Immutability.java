package OCA.Chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class LocalDate_Immutability {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);  // create a period
        performAnimalEnrichment(start, end, period);

        System.out.println();
        System.out.println("Start value after performAnimalEnrichment: " + start);

        System.out.println("-----");
        performAnimalEnrichment2(start, end, period);

        System.out.println();
        System.out.println("Start value after performAnimalEnrichment2: " + start);

        System.out.println("\n---\n");
//        start = start.plus(5)// Not compile
        start.plus(Period.ofMonths(2));// Result of 'LocalDate.plus()' is ignored
        System.out.println("Ignored start value: " + start );
        start = start.plus(Period.ofMonths(2));
        System.out.println("Reassigned start value: " + start );


        //
        System.out.println();
        System.out.println(start.toEpochDay());

        LocalDateTime dateTime = LocalDateTime.now();
    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);     // adds the period
        }}
    private static void performAnimalEnrichment2(LocalDate start, LocalDate end,
                                                Period period) {               // uses the generic period
        while (start.isBefore(end)) {
            System.out.println("give new toy: " + start);
            start = start.plus(period);     // adds the period

//            start - local var is 2015-03-01, but scope is only in method
            // method's args are copy, and considered as local var,
            // there is no effect to original start value before the method
            // because of IMMUTABILITY

            // In immutable obj we should  force to indicate same obj

            // While if it would be mutable, also args are copies
            // but these references indicates same obj (because of Reference type), therefore we can change original var

        }}
}
