package org.example.Assessment;


// Assessment test no_16 in introduction
public interface Animal { public default String getName() { return null; } }
  interface Mammal { public default String getName() { return null; } }
// It can extend/implement interface that with same name, BUT IT SHOULD NOT BE DEFAULT
  abstract class Otter implements Mammal, Animal {
//  @Override
//  public String getName() { // Concrete implementation  -> Compile -> F
//    return "Mammal.super.getName();";
//  }

  @Override
  public abstract String getName();  // Abstract implementation -> Compile -> G

}
