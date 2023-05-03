/*Create an abstract class Animal with the following properties and methods:
Properties:
name: a String representing the name of the animal
Methods:
move(): an abstract method that represents how the animal moveseat(): a method that prints a message saying the animal is eatinggetName(): a method that returns the name of the animal
Create two concrete classes that extend the Animal class: Dog and Bird. Each class should have its own implementation of the move() method. For example, a Dog may move by walking on four legs, while a Bird may move by flying.
Finally, write a Main class that creates instances of Dog and Bird, sets their names, and calls their move() and eat() methods. Print messages to indicate how each animal moves and that they are eating.*/
import java.util.*;
abstract class Animal{
  String name;
  abstract void move();
  void eat(){
    System.out.println(name +"is eating.");
  }
  String getName(){
    return name;
  }
  void setName(String name){
    this.name=name;
  }
}
class Dog extends Animal{
  void move(){
    System.out.println("Dog move by walking on four legs");
  }
}
class Bird extends Animal{
  void move(){
    System.out.println("Bird move by flying");
  }
}
class program2{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    Dog dog = new Dog();
    System.out.println("Enter name of the animal");
    dog.setName(s.next());
    System.out.println("name of the animal  " + dog.getName());
    dog.move();
    dog.eat();
    Bird bird = new Bird();
    System.out.println("Enter bird name");
    bird.setName(s.next());
    System.out.println("name of the bird  " + bird.getName());
    bird.move();
    bird.eat();
  }
}