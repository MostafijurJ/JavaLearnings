package com.example.oop.animal;

import com.example.oop.abs.Animal;

public class Cat extends Animal {

  private void meow() {
    System.out.println("Meow");
  }

  public void makeSound() {
    meow();
  }
}
