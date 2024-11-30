package Chapter4_5.pond.inland;

import Chapter4_5.pond.shore.Bird;

// Different package from Bird and not subclass
public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();               // DOES NOT COMPILE
//
//        System.out.println(bird.text);     // DOES NOT COMPILE
    } }
