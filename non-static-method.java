import java.util.*;
class NonStaticMethod{
  public void gretting() {
    System.out.println("Hey...Good Morning:");
    System.out.println("Hey...Good Morning:");
    System.out.println("Hey...Good Morning:");
    System.out.println("Hey...Good Morning:");
  }
  public void claculate(){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the first number:");
    int a = sc.nextInt();
    System.out.print("Enter the second number:");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("sum is:" +sum);
    return sum;
  }

// This is the main method:--
public static void main(String[] agrs){
  NonStaticMethod obj = new NonStaticMethod();
   obj.gretting();
   obj.calculate();
