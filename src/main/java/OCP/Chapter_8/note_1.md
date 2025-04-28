# Functional Programming and Lambdas in Java
Functional programming is a way of writing code more declaratively.
You specify what you want to do rather than dealing with the state of objects.
You focus more on expressions than loops.
---

## Lambda Expressions
You can think of a lambda expression as an unnamed method existing inside an anonymous class.

---

## Deferred Execution
This code uses a concept called **deferred execution**.  
Deferred execution means that code is specified now but will run later.  
In this case, "later" is inside the `print()` method body, as opposed to when it is passed to the method.

### Key Points:
- **Biz checker arqumenti** (lambda və ya functional interface obyektini) `print()` metoduna ötürürük.
- **Ötürəndə kod sadəcə "verilir", icra olunmur.**
- **İcra olunması** `print()` metodunun içində, `checker.test(animal)` sətri çağırılarkən baş verir.
- **Əgər `checker.test(animal)` yazılmasa idi**, heç vaxt işləməyəcəkdi.

```java
private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
        if (checker.test(animal))
            System.out.print(animal + " ");
    }
    System.out.println();
}
```

---

## Lambdas and Interfaces

Lambdas work with interfaces that have exactly **one abstract method**.

---

## How Does Java Know?
Java relies on **context** when figuring out what lambda expressions mean.  
Context refers to where and how the lambda is interpreted.
### Example:
If we see someone in line to enter the zoo and they have their wallet out, it is fair to assume they want to buy zoo tickets.  
Alternatively, if they are in the concession line with their wallet out, they are probably hungry.
---

### Referring to our earlier example, we passed the lambda as the second parameter of the `print()` method:
```java
print(animals, a -> a.canHop());
```
The `print()` method expects a `CheckTrait` as the second parameter:

```java
private static void print(List<Animal> animals, CheckTrait checker) { ... }
```
Since we are passing a lambda instead, Java tries to map our lambda to the abstract method declaration in the `CheckTrait` interface.  
(map lambda to abs method declaration --> lambdani bizdeki metoda uygunlasdirmaq return type, parameters cehetden)

```java
boolean test(Animal a);
```
Since that interface’s method takes an `Animal`, the lambda parameter has to be an `Animal`.  
And since that interface’s method returns a `boolean`, we know the lambda returns a `boolean`.

---

### Compilation Error Example
Why do you think this line of code doesn’t compile?
```java
var invalid = (Animal a) -> a.canHop();  // DOES NOT COMPILE
```
Remember when we talked about Java inferring information about the lambda from the context?  
Well, `var` assumes the type based on the context as well.  
There’s not enough context here!  
Neither the lambda nor `var` have enough information to determine what type of functional interface should be used.
