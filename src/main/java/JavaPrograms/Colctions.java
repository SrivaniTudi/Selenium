package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Colctions {
	
	int empid;
	String name;
	long salary;
	String address;
	
	Colctions(int empid,String name,long salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Colctions emp1=new Colctions(101, "vani", 20000);
		Colctions emp2=new Colctions(102, "sony", 20000);
		Colctions emp3=new Colctions(103, "rani", 20000);
		
		
	

		
		ArrayList<Colctions> al=new ArrayList();
		al.add(emp3);
		al.add(emp2);
		al.add(emp1);
		
		
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		ListIterator<Colctions> itr=al.listIterator();
		while(itr.hasNext())
		{
			Colctions al1= itr.next();
			
			System.out.println(al1);
		}

		Set<String> hs=new HashSet<String>();
		hs.add("Hyd");
		hs.add("kdp");
		hs.add("wrgl");
		
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1,"hyd");
		hmap.put(2, "kdp");
		hmap.put(3, "wrgl");
		
		Iterator<Map.Entry<Integer,String>> itr1=hmap.entrySet().iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, String>  mp=(Map.Entry<Integer, String>) itr1.next();
			
			System.out.println("key="+mp.getKey() +" value="+mp.getValue());
		}
		
		
		hmap.forEach((key,value)->System.out.println(key+" "+value));
		
		
		
		
		
	}

}
