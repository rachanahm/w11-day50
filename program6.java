/*Create a base class named "Animal" with a method named "makeSound" that prints a message indicating the type of sound the animal makes. Then create three derived classes named "Dog", "Cat", and "Cow". Each of these classes should override the "makeSound" method with their own implementation of the sound they make. In the main method, create objects of all three classes and call their "makeSound" methods to hear their respective sounds.*/
class Animal{
  void makeSound(){
    System.out.println("Animal makes a sound");
  }
}
  class Dog extends Animal{
    void makeSound(){
      System.out.println("Dog barks");
    }
  }
    class Cat extends Animal{
    void makeSound(){
      System.out.println("Cat meows");
  }
    }
      class Cow extends Animal{
      void makeSound(){
      System.out.println("Cow moos");
  }
}
class program6{
  public static void main(String args[]){
    Animal dog=new Dog();
    Animal cat=new Cat();
    Animal cow=new Cow();
    dog.makeSound();
    cat.makeSound();
    cow.makeSound();
  }
}