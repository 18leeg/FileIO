import java.util.Scanner;
import java.io.*;

public class FileIOTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Enter name of data file.");
		String name = input.nextLine();
		
	Scanner file = new Scanner(name);
	int sum = 0;
	while (file.hasNext()){
		sum+=file.nextInt();
	}
	System.out.println("Sum: "+sum);
	
	}

}
