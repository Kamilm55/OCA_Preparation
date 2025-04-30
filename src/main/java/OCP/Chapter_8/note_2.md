Java includes @FunctionalInterface on some, but not all, functional interfaces. This
annotation means the authors of the interface promise it will be safe to use in a lambda
in the future. However, just because you don’t see the annotation doesn’t mean it’s not a
functional interface. Remember that having exactly one abstract method is what makes it a
functional interface, not the annotation.

**Private methods: Since Java 9, you can have private methods inside an interface** — but they can only be used inside that interface, typically to share code between default or static methods.

✅ Rules for private methods in interfaces:
- Must have a method body (cannot be abstract).
- Can only be called from **within the interface (not visible to implementing classes)**.
- **Can be private or private static** — depending if they are instance methods or static.

Even though default methods function like abstract methods, in that they can be overridden in a class implementing the interface, they
are insufficient for satisfying the single abstract method requirement.


```java
@FunctionalInterface
interface Dance {
void move();
//    void rest(); // if uncomment --> DOES NOT COMPILE
}

//@FunctionalInterface // -->  Neither snore() nor getZzz() meets the criteria of a single abstract method
interface Sleep {
//    void absMethod(); --> to compile uncomment this single abs method

    // There is no SAM
    private  void snore() {}
    default int getZzz() { return 1; }
}

@FunctionalInterface
interface Climb {
void reach();// Single Abstract Method -> SAM
default void fall() {}
static int getBackUp() { return 100; }
private static boolean checkHeight() { return true; }
}
```
---
All classes inherit certain methods from Object:
```java
public String toString()
public boolean equals(Object)
public int hashCode()
```
If a functional interface includes an abstract method with the same signature as a public method found in Object, those methods do not count
toward the single abstract method test. The motivation behind this rule is that any class that
implements the interface will inherit from Object, as all classes do, and therefore always
implement these methods
```java
public interface Soar { // It is not Functional Interface
abstract String toString();
}
```

Bu interface-i implement eden her hansisa bir class zaten toString-i implement etmis olur, subut olaraq:
```java
public class T2_Coding_Functional_Interfaces implements Soar {
}
```
Normalda exception atmasi gerekir cunki bu classda hec bir method override edilmeyib, amma eyni adli metod Object clasindan inherit olunub