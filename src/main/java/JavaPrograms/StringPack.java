package JavaPrograms;

public class StringPack {
	public static void main(String[] args) {
		
		String s1="Sri";
		String s2="Vani";
		System.out.println(s1+s2);
		String s3="Sri";
		String s4="Vani";
		//System.out.println(s1.compareTo(s3)); //sri sri
		System.out.println(s1.equals(s3));
		System.out.println(s1.contains(s3));
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		
		String v1=new  String("Sri");
		String v2=new String("Sri");
		System.out.println(s1.equals(v2));
		System.out.println(s1==v2);
		
		
	/*	
		obj1=new StringPack("Jagan");
		StringPack obj2=new StringPack("Jagan");
		System.out.println(obj1.equals(obj2));//false String s1="Arjun"; 
		String s2="Arjun"; 
		System.out.println(s1.equals(s2)); //true 
		String str1=new String("NIT"); 
		String str2=new String("NIT"); System.out.println(str1.equals(str2)); //true
		// string bugger reference comparison means object class
		StringBuffer sb1=new StringBuffer("Rashmika"); 
		StringBuffer sb2=new StringBuffer("Rashmika"); 
		System.out.println(sb1.equals(sb2)); //false 
		*/
	}

}
