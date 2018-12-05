package justjava;

public class StatBlock {
	
	public void m1(){
		
	System.out.println("Inside m1");
	}
	
	static{
		System.out.println("Inside block");
		
	}
	public static void main(String[] args) {
		StatBlock s= new StatBlock();
		s.m1();
		
	}

}
