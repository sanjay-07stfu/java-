import java.util.Scanner;
public class AtmMachine
{
 public static void main(String args[])
{
 int balance=500;
 int deposite,withdraw;
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("1:CHECK BALANCE");
System.out.println("2:DEPOSITE");
System.out.println("3:WITHDRAW");
System.out.println("4:EXIT");


System.out.println("Enter your choice");
int choice=sc.nextInt();

switch(choice){
case 1:
{
 System.out.println("Balance is:" +balance);
 break;
}
 case 2:
{
System.out.println("Enter the how many money you want to diposite:");
int money=sc.nextInt();
balance=balance+money;
System.out.println("Your money has been successfully diposited");
break;
}
case 3:
{
System.out.println("Enter the withdraw amount:");
 withdraw=sc.nextInt();
if(balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("Withdraw Successfully!!");
System.out.println("Please collect your money");
System.out.println("Your balance is"+balance);
}
else
{
System.out.println("Please enter the sufficient money");
}
break;
}
case 4:
{
System.exit(0);
break;
}
default:
{
 System.out.println("Enter the valid number!!");
}
}
}
sc.close();

}
}