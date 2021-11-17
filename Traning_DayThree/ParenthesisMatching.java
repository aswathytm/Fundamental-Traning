import java.util.*;
public class ParenthesisMatching {
	static boolean Balanced(String expr)
	{
		Deque<Character> stack= new ArrayDeque<Character>();
		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);
			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Experssion :");
		String expr=sc.nextLine();
		if (Balanced(expr))
			System.out.println("The Expression is Balanced ");
		else
			System.out.println("Expresssion is Not Balanced ");
	}
}
