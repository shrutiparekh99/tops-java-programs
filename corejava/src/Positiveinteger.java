import java.util.Scanner;

public class Positiveinteger {

	public static void main(String[] args) {

		    Scanner sc=new Scanner(System.in);
		    int n;
		    System.out.print("Input an integer number less than ten billion : ");
		    n=sc.nextInt();
		    int counter=0;
		    while(n>0){
		        n=n/10;
		        counter++;
		    }
		    System.out.println(counter);
		}
	}


