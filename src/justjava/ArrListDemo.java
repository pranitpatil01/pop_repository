package justjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrListDemo {
	public static void main(String[] args) {
ArrayList al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		System.out.println("git change");
		
		System.out.println(al);
		List l1= Collections.synchronizedList(al);
		
		
Vector v= new Vector<>(l1);
		/*v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
	v.add(100);
		v.add(110);*/
		System.out.println(v);
		
		
	}

}
