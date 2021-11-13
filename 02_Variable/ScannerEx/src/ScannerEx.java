import java.util.*;

class ScannerEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the two-digit integer.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("What you input : " + input);
		System.out.printf("num=%d%n", num);
	}

}
