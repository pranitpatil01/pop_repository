package justjava;

public class Demo {
	int j;
	
public int getJ() {
		return j;
	}

public void setJ(int j) {
		this.j = j;
	}

public static void main(String[] args) {
	Demo d=new Demo();
int sum=0;
for(int i=0; i<=d.j; i++){
	sum=sum+i;
}
System.out.println(+sum);
}
}