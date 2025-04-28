package OCA.Chapter4_5.pond.shore;

import OCA.Chapter4_5.pond.goose.Goose;

public class Bird {
    protected String text = "floating";          // protected access
    protected void floatInWater() {               // protected access
        System.out.println(text);
    }

    public void callOwnProtectedFields(){
        System.out.println(text);
    }
    public void callOwnProtectedFieldsAfterInstantiate(){
       Bird bird = new Bird(); // Bird is not a subclass of Bird, how it accesses into protected fields?
        System.out.println(bird.text);// Compile

        // The reason Bird can access its own protected fields and methods is that
        // protected members are 'accessible within the same class, regardless of inheritance'.
        // In Java, protected access means that the field or method is accessible within
        // 'its own class', any subclass, and any other class in the same package.

        // Works for located in the same class or WITHIN THE SAME PACKAGE
        Bird bird1 = new Goose();
        System.out.println(bird1.text);
        bird1.floatInWater();
    }
}
