/*Create an interface called Calculator with the following method signatures:
int add(int a, int b)int subtract(int a, int b)int multiply(int a, int b)int divide(int a, int b)
Create a class called BasicCalculator that implements the Calculator interface. Implement the methods according to their respective arithmetic operations.
Write a Main class that creates an instance of BasicCalculator and calls its methods to perform some arithmetic operations. Print out the results of each operation.*/
interface calculator{
  int add(int a,int b);
  int subtract(int a,int b);
  int multiply(int a,int b);
  int divide(int a,int b);
}
class BasicCalculator implements calculator{
  public int add(int a,int b){
  return a+b;
}
public int subtract(int a,int b){
return a-b;
}
public int multiply(int a,int b){
  return a*b;
}
public int divide(int a,int b){
  return a/b;
}
}
class program3 {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        
        int result1 = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result1);
        
        int result2 = calculator.subtract(10, 4);
        System.out.println("10 - 4 = " + result2);
        
        int result3 = calculator.multiply(6, 7);
        System.out.println("6 * 7 = " + result3);
        
        int result4 = calculator.divide(25, 5);
        System.out.println("25 / 5 = " + result4);
    }
}