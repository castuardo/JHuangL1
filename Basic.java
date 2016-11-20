import java.util.Scanner;
import java.io.*;

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
	/*public static void main(String... args){
		if(args.length != 0){
			System.out.println("I dont need args!");
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
	}*/
	public static void main(String... args){
		if(args.length != 1){
			System.out.println("I need one arg!");
			System.exit(0);
		}
		else{
			try{
				File file = new File(args[0]);
				FileReader rdr = new FileReader(file);
				BufferedReader brdr = new BufferedReader(rdr);
				String line = null;
				while((line = brdr.readLine()) != null){
					System.out.println("A line: " + line);
				}
				brdr.close();
				rdr.close();
			}
			catch(IOException exc){
				System.out.println("An error ocurred: " + exc.getMessage());
			}
		}
	}
}
