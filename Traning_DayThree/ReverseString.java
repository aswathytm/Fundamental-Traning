import java.util.*;
class Stack
{
	int size;
	int top;
	char[] a;
	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack(int n)
	{
		top = -1;
		size = n;
		a = new char[size];
	}
	boolean push(char x)
	{
		if (top >= size)
		{
		System.out.println("Stack Overflow");
		return false;
		}
		else
		{
			a[++top] = x;
			return true;
		}
	}
	char pop()
	{
		if (top < 0)
		{
		System.out.println("Stack Underflow");
		return 0;
		}
		else
		{
			char x = a[top--];
			return x;
		}
	}
}
class ReverseString
{
	public static void reverse(StringBuffer str)
	{
		int n = str.length();
		Stack object = new Stack(n);
		for (int i = 0; i < n; i++)
		object.push(str.charAt(i));
		for (int i = 0; i < n; i++)
		{
			char ch = object.pop();
			str.setCharAt(i,ch);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String word=sc.nextLine();// input a string from console.
		StringBuffer s= new StringBuffer(word);
		reverse(s);
		System.out.println("Reversed string is: " + s);
	}
}
