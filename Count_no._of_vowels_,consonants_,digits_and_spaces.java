import java.util.Scanner;
class countofcharacters {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int v=0,c=0,d=0,k=0;
			String s1=sc.nextLine();
			String vowels="aeiouAEIOU";
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(Character.isLetter(ch))
				{
					if(vowels.contains(String.valueOf(ch)))
				    v++;
			        else
				    c++;
				}
				else if(Character.isDigit(ch))
					d++;
				else if(Character.isSpace(ch))
					k++;
			}
			System.out.println("Vowels: "+v);
			System.out.println("Consonants: "+c);
			System.out.println("Digits: "+d);
			System.out.println("White spaces: "+k);
		}
	}
