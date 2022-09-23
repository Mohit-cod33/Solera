package daythree.string;

public class StringOp {
	public static void main(String []args) {
		String h="Hello";
		String s="hellooo   ";
		System.out.println("length of string : "+h.length());
		System.out.println("index of char e: "+h.indexOf('e'));
		System.out.println("last index of l: "+ h.lastIndexOf('l'));
		System.out.println("Substring :"+ h.substring(1));
		System.out.println("Substring:"+ h.substring(2,4));
		System.out.println(s.trim());
		
		int n=25;
		String nums=String.valueOf(n);
		System.out.println(nums instanceof String);
		Integer nn=Integer.parseInt(nums);
		System.out.println(5*nn);
		/*
		String ss=null;
		System.out.println(ss.isEmpty());
		*/
		
		String ss="";
		System.out.println(ss.isEmpty()); // introduce in jDK 6
		
		System.out.println(h.hashCode());
		h=h.concat("World");
		System.out.println(h);
		System.out.println(h.hashCode());
		System.out.println("###############################################");
		System.out.println();
		System.out.println(h.toLowerCase());
		System.out.println(h.toUpperCase());
		System.out.println(h.replace('H', 'P'));
		System.out.println((s.replace(" ", "orld")).trim());
		System.out.println(s.replaceAll("\\s", "world"));
		System.out.println("###############################################");
		System.out.println();
		String para="hello everyone, this is third day of the training. i hope all of you are good. let's start our session";
		System.out.println();
		System.out.println(para);
		for(String st:para.split("[.]")) {
			System.out.println(st);
		}
		}

}
