/*Abstract class
shape
  one abstract method area()
  perimeter()
rectangle
square*/
abstract class Shape{
  abstract double area();
  abstract double perimeter();
}
class Rectangle extends Shape{
  double width;
  double height;
  Rectangle(double width,double height){
    this.width=width;
    this.height=height;
  }
  double area(){
    return width*height;
  }
  double perimeter(){
    return 2*(width+height);
  }
}
class Square extends Shape{
  double side;
  Square(double side){
    this.side=side;
  }
  double area(){
    return side*side;
  }
  double perimeter(){
    return 4*side;
  }
}
class program1{
  public static void main(String args[]){
    Rectangle rect=new Rectangle(5.0,20.0);
    System.out.println("Rectangle area is:"+rect.area());
    System.out.println("Perimeter is:"+rect.perimeter());
    Square sq=new Square(7.8);
    System.out.println("Square area is:"+sq.area());
    System.out.println("Perimeter is:"+sq.perimeter());
  }
}