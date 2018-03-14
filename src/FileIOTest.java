import java.util.Scanner;
import java.io.*;

public class FileIOTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner xinput = new Scanner(System.in);
	System.out.println("Enter name of data file.");
		String name = xinput.nextLine();
		
	Scanner input;
	
	try{
	input = new Scanner(new File(name));
	
	int sum = 0;
	while (input.hasNextLine()){
		sum+=input.nextInt();
	}
	System.out.println("Sum: "+sum);
	
	}
	catch(Exception e){
		
	}
}
}
