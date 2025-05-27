import java.util.Scanner; 
public class BasicCalculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);


System.out.print("\nEnter The First Number: "); 
double num1 = sc.nextDouble(); 
System.out.print("\nEnter The Second Number: ");
 double num2 = sc.nextDouble();
System.out.println("\nSelect The Operation To Perform:");
 
for(int i=0;i<=4;i++)
{
System.out.println("1. You Want To Do Addition ?");
 System.out.println("2. You Want To Do Subtraction ?");
 System.out.println("3. You Want To Do Multiplication ?");
 System.out.println("4. You Want To Do Division ?");
System.out.print("\nEnter The Choice (1,2,3,4):");
 int choice = sc.nextInt();

double result = 0;


switch (choice) { case 1:
result=num1 + num2;
System.out.println("\nADDITION OF THE NUMBERS:" +result ); break;
case 2:
result=num1 - num2;
System.out.println("\nSUBSTRACTION OF THE NUMBERS:" + result); break;
case 3:
result=num1 * num2;

System.out.println("\nMULTIPLICATION OF THE NUMBERS:" + result); break;
case 4:
result=num1 / num2;
 

System.out.println("\nDIVISION OF THE NUMBERS:" + result); break;
default:

System.out.println("YOU HAVE ENTERED THE INCORRECT OPERATION TO PERFORM.");
}

}

}
}
