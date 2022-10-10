import java.util.Scanner;

public class DisplayTime
{
	public static void main(String[] args)
	{
		byte b = 127;
		System.out.println(0B1111);
		System.out.println(07777);
		System.out.println(0XFFFF);
		System.out.println(232_45_4519);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds%60;
		System.out.println(seconds + " seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
	}
}
