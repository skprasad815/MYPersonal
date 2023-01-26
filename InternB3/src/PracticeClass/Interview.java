package PracticeClass;



public class Interview {

	public static void main(String[] args) {
		String str="sanjay";
		System.out.println("length is"+str.length());
	System.out.println(str);
	String replace=str.replace(str,"My name is Sanjay");
	System.out.println(replace);
	System.out.println("length is "+replace.length());
	
	//reverse of string
	 StringBuilder sb=new StringBuilder(replace);  
	    sb.reverse();
	System.out.println(sb);
	    
	    
	//fibonacci series
	
	int n1=0,n2=1,n3,count=10;
	for(int i=0;i<=count;i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
	n1=n2;
	n2=n3;

	
	
	}
		}
}