class Demo1 extends Thread
{
public void run()
{
System.out.println("Executing 1. .. ");
}
}
class Demo2 extends Thread
{
public void run()
{
System.out.println("Executing 2. .. ");
}
}
class DemoThread
 
{
public static void main(String args[])
{
Demo1 t1= new Demo1(); Demo2 t2= new Demo2(); t1.start();
t2.start();
}
}
