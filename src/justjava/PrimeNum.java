package justjava;

import java.util.Scanner;

public class PrimeNum {
static int num;
static int a;
static boolean b=true;
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value ");
	num=input.nextInt();
	for(int j=2; j<=num/2; j++){
		a=num%j;
		if(a==0){
			b=false;
			break;
		}
		if(b)
		System.out.println("Entered Number is Prime Number");
		else
		System.out.println("Entered Number is not Prime");
	}
	
}
}
