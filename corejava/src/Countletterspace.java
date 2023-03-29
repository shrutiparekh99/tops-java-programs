import java.util.Scanner;

public class Countletterspace {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string are:");
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		int i,letters=0,spaces=0,numbers=0,others=0;
		
		for(i=0;i<str.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letters++;
              }
			if(Character.isSpaceChar(ch[i]))
			{
				spaces++;
			}
			if(Character.isDigit(ch[i]))
			{
				numbers++;
			}
			else
			{
		       others++;
		}
	}
		System.out.println("Letters are:"+ letters);
		System.out.println("Spaces are:"+ spaces);
		System.out.println("Numbers are:"+ numbers);
		System.out.println("Others are:"+ others);
	}
}
