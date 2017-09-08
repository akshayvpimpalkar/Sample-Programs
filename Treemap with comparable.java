package sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){
		String s = "Pimpalkar";
		String s1 = s.substring(2, 4);
		System.out.println(s1);
		Map<Integer, String> hm = new HashMap<>();
		Map<Myclass, String> tm = new TreeMap<>();
		Myclass m3 = new Myclass(45);
		Myclass m1 = new Myclass(10);
		Myclass m2 = new Myclass(20);
		Myclass m4 = new Myclass(15);
		tm.put(m3, "m3String");
		tm.put(m1, "m1String");
		tm.put(m2, "m2String");
		tm.put(m4, "m4String");
		System.out.println(tm);
	}
}


package sample;

public class Myclass implements Comparable<Myclass>{
	private int a;

	public Myclass(int a) {
		super();
		this.a = a;
	}

	@Override
	public int compareTo(Myclass o) {
		// TODO Auto-generated method stub
		return o.a - a;
	}

	@Override
	public String toString() {
		return "Myclass [a=" + a + "]";
	}
	
	
}
