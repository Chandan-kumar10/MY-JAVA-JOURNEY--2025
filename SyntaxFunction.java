import java.util.*;
class SyntaxFunction{

  public static void greet(){
    System.out.print("Hey.. my name is chandan:");
    System.out.print("Hey.. my name is chandan:");
    System.out.print("Hey.. my name is chandan:");
    System.out.print("Hey.. my name is chandan:");
  }

  public static void calculatesum(){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter your first number:");
    int a =sc.nextInt();
    System.out.print("Enter your second number:");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Your total sum si:" +sum);
  }
  public static void main(String [] args){
    greet();
    calculatesum();
  }

}


