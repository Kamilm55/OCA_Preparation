package OCP.Chapter_8;

//@FunctionalInterface // NOT COMPILE
 interface Soar {
    abstract String toString();// void ve ya basqa type yaza bilmirik, cunki implment eden class Objectden bu metodu inherit edib
}
@FunctionalInterface
 interface Dive {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive(); // SAM
}
public class T2_Coding_Functional_Interfaces {
}
