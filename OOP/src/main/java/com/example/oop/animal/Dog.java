package com.example.oop.animal;

import com.example.oop.abs.Animal;

public class Dog extends Animal {
  private void berk() {
    System.out.println("Berk");
  }

  public void makeSound() {
    berk();
  }

}
