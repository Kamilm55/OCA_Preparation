package Chapter1.Practice;

import Chapter1.RollerSkates;

// 45th test
public class RollerSkates_45 {
    static int wheels = 1;
    int tracks = 5;
    public void nonStaticMethod(){
        int feet = 4, tracks = 15; // tracks is 'local' variable in 'method'

        System.out.println(feet + " " + tracks + " " +  this.wheels);// tracks local shadow this.tracks
    }
    public void nonStaticMethod2(){

        System.out.println( tracks + " " +  this.wheels);// this.tracks -> if no local var with the same name
    }

    public static void main(String[] args) {
        RollerSkates_45 s = new RollerSkates_45();
        s.nonStaticMethod();
        s.nonStaticMethod2();

    }
    // Ch2_11
    double d1 = 5f;// 5.0f float to double -> 5.0
    float f1 = 5f;// 5.0 float
//    float f2 = 5.0; // not compile, requires explicit cast

}
