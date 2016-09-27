import java.util.*;
public class FullName {

	public static void main(String[] args) {
		Scanner n1=new Scanner(System.in);
		System.out.print("What is your first name? ");
		String n2=n1.nextLine();
		Scanner n3=new Scanner(System.in);
		System.out.print("What is your last name? ");
		String n4=n3.nextLine();
		
		System.out.print("Your full name is ");
		System.out.print(n2 + " ");
		System.out.println(n4 + ".");
	}

}
