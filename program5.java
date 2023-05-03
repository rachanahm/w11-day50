/*Write a Java program to demonstrate function overloading. Create a class named "MathFunctions" with three methods named "max", "max", and "max". The "max" method with two integer parameters will return the maximum value between the two parameters. The "max" method with two double parameters will return the maximum value between the two parameters. The "max" method with three integer parameters will return the maximum value between the three parameters. In the main method, create an object of the "MathFunctions" class and call each of the "max" methods with appropriate arguments.*/
class MathFunctions{
  int max(int a, int b){
    if(a>b)
      return a;
    else
      return b;
    
  }
  double max(double a , double b){
    if(a>b)
      return a;
    else
      return b;
    
  }
  int max(int a,int b,int c){
    if(a>b && a>c)
      return a;
    else if(b>a && b>c)
      return b;
    else
      return c;
  }
}
class program5{
    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();
        
        int result1 = math.max(5, 10);
        System.out.println("Max of 5 and 10 is " + result1);
        
        double result2 = math.max(3.5, 8.2);
        System.out.println("Max of 3.5 and 8.2 is " + result2);
        
        int result3 = math.max(4, 9, 2);
        System.out.println("Max of 4, 9, and 2 is " + result3);
    }
}