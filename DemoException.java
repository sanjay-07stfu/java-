
class DemoException
{
public static void main(String args[])
{
try
{
int b=8; int c=b/0;
System.out.println("Answer="+c);
}
catch(ArithmeticException e)
{
System.out.println("Division by Zero");
}
}
}
