package justjava;
import java.util.Scanner;
public class Demo2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Value ");
	int i=input.nextInt();
	if(i%2==0)
	{
	System.out.println("Entered number "+i +" is sum number");
	}
	else
	System.out.println("Entered number is odd");
}
}