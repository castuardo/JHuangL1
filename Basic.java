import java.util.Scanner;

public class Basic{

	/*public static void main(String... args){
		if(args.length == 0){
			System.out.println("I need args!");
			System.exit(0);
		}
		else{
			for(String arg : args){
				System.out.print(arg + " ");
			}
		}
	}*/
	public static void main(String... args){
		if(args.length != 2){
			System.out.println("I two need args!");
			System.exit(0);
		}
		else{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int x1 = sc.nextInt();
			System.out.print("Enter another number: ");
			int x2 = sc.nextInt();
			System.out.println("THe sum of " + x1 + " and " + x2 + " is " + (x1 + x2));
			sc.close();
		}
	}
}
