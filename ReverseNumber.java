import java.until.scanner;
public class ReverseNumber{
public static void main (string args[])
{
  scanner sc=new scanner(system.in);
  System.out.println("Enter the number:");
  int num=scanner.nextint();
  int reverseNum=0;
while(num!=0)
int digit =num%10;
reverseNum=reverseNum*10+digit;
num=num/10;
}
System.out.println("Reversed Number:"+reverseNum);
scanner.close();
}
}