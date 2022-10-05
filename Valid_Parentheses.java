import java.util.*;
class solution
{
    public static boolean isValid(String s) 
    {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            String st=s.next();
            boolean c=(isValid(st));
            if(c)
            {
                System.out.format("True
");
            }
            else
            {
                System.out.format("False
");
            }
        }
    }
}