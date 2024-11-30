package Chapter4_5;

class Animal {
    public Animal getAnimal() {
        System.out.println("Returning an Animal");
        return new Animal();
    }
}

class Dog extends Animal {
    // Covariant return type: Dog is a subclass of Animal
    @Override
    public Animal getAnimal() {
        System.out.println("Returning a Dog");
        return new Dog();
    }
}
// Override 4th principle -->  If the method returns a value, it must be the same or a subclass of the method in the
// parent class, known as covariant return types.
public class Override_4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = animal.getAnimal();// Outputs: Returning an Animal


        Animal dog = new Dog();
        Animal animal2 = dog.getAnimal();// Outputs: Returning a Dog

        // Any Data type that not extend from Animal (Not Animal or not covariant type)
        // cannot be used polymorphic

//        Animal num = dog.getAnimal();// imagine, it returns Number
        // dog reference type --> Animal --> which checks getAnimal() is accessible -> yes -> Animal getAnimal()
        // dog instance -> new Dog() --> call actual overriden method --> Number getAnimal()
    }
}
