package justjava;

class Heapdemo {
	int i;
	static String j;
public static void main(String[] args) {
	double mb=1024*1024;
	Runtime r= Runtime.getRuntime();
	System.out.println("Max memory:"+r.maxMemory()/mb);
	System.out.println("Total memory:"+r.totalMemory()/mb);
	System.out.println("free memory:"+r.freeMemory()/mb);
	System.out.println("consumed memory:"+(r.totalMemory()-r.freeMemory())/mb);
}
}

