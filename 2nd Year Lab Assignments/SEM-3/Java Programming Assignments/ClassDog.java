/*
PROBLEM STATEMENT :Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
 */

class Dog {
  private String name;
  private String breed;

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }
}

public class ClassDog {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Buddy", "Golden Retriever");
    Dog dog2 = new Dog("Charlie", "Bulldog");

    System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
    System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

    System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
    dog1.setBreed("Labrador Retriever");
    dog2.setName("Daisy");

    System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
    System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
  }
}