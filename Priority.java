class Demo1 extends Thread
{
public void run()
{
for(int i=2;i<=15;i=i+2)
{
System.out.println("Even: "+i);
}
}
}
class Demo2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i=i+2)
{
System.out.println("Odd: "+i);
}
}
}
class Priority
{
public static void main(String args[])
{
Demo1 t1= new Demo1(); Demo2 t2= new Demo2(); t1.setPriority(8); t2.setPriority(2);
t1.start();
t2.start();
}
}
