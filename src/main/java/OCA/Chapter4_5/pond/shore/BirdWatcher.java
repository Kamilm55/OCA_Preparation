package OCA.Chapter4_5.pond.shore;

// Same package not subclass
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird(); // Call with original Bird --> Same package
        bird.floatInWater();               // calling protected member
        System.out.println(bird.text);     // calling protected member
    } }
