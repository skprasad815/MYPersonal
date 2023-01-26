package OopsConcept;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol=new Overloading();
		ol.add(10);
		ol.add(10, 20);
		ol.add("sanjay");
		
		
		
		
		
	}
		public void add(int a)  //increase parameter
		{
			System.out.println(a);
		}
		public void add(int a, int b)  
		{
			System.out.println(a+b);
		}
		public void add (String a)  //changing behavior
		{
			System.out.println(a);
		}
	}

