class Palindrome
{
 public static void main(String args[])
 {
	int a=Integer.parseInt(args[0]);
	int no = a;
	int sum = 0;
	while(a>0)
	{
	 int temp = a%10;
	 sum=sum*10+temp;
	 a/=10;
	}
	if(sum==no)
	System.out.println("Number is a palindrome");
	else
	System.out.println("Number is not a palindrome");
 }
}