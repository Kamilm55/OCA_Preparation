package OCA.Chapter4_5.pond.swan;
import OCA.Chapter4_5.pond.shore.Bird; // in different package from Bird

class Swan extends Bird {     // subclass of bird

    // Invisible fields from parent
//    protected String text = "floating";          // inherited from parent
//    protected void floatInWater() {               // inherited from parent
//        System.out.println(text);
//    }

   public void swim() {
       // Is it this?
       //
       //Yes, implicitly. The compiler assumes 'this.' if neither this nor super is specified.
       // So floatInWater() and text are accessed on the current Swan instance.
     floatInWater();   // this.floatInWater();   // protected access to superclass
     System.out.println(text);     // package access to superclass
   }
   public void helpOtherSwanSwim() {
     Swan other = new Swan();
     // PROTECTED FIELDS OF BIRD CAN BE ACCESSIBLE IN ITS INSTANCE OF SUBCLASS
     // other instance of -> Swan -> subclass of Bird
     other.floatInWater();          // package access to superclass
     System.out.println(other.text);// package access to superclass
   }

   // protected: Accessible within the same package and in subclasses, even if they are in different packages.
    // Package-private (no modifier): Accessible only within the same package, not outside, even by subclasses.

   // Learn:
   //  We can say `if we are in different class than Bird` (1) and `if it is not the same package with Bird` (2),
   //  and `if we instantiate a obj via Bird reference` (3) --> we cannot access its protected members.
   //   1 (same class)  -> we can access
   //   2 (same package) -> we can access
   //   3 (via subclass reference) -> we can access
    // We cannot access even if Own class reference Bird --> if it is not in the same class

        public void helpOtherBirdSwim() {
       Bird other = new Bird();

       // other -> not instance of Bird's subclass
       // Bird is not subclass of Bird
//       other.floatInWater();               // DOES NOT COMPILE
//       System.out.println(other.text);      // DOES NOT COMPILE
     }
    public void helpOtherBirdSwim2() {
        Bird other = new Swan();

        // other -> not instance of Bird's subclass
        // Bird is not subclass of Bird
//        other.floatInWater();               // DOES NOT COMPILE
//        System.out.println(other.text);      // DOES NOT COMPILE
    }
    public void helpOtherBirdSwim3() {
        Swan other = (Swan) new Bird();

        // other -> not instance of Bird's subclass
        // Bird is not subclass of Bird
        other.floatInWater();               // COMPILE
        System.out.println(other.text);      // COMPILE
    }

    // Learn:
    //  Summary:
    //  Same Class (Bird): The Bird class can access its own protected members without restrictions.
    //  Subclass (Swan): Swan can access protected members of Bird directly on its own instance
    //  and on instances of Swan or other subclasses, but not on instances of Bird directly
    //  if Swan and Bird are in different packages.
}
