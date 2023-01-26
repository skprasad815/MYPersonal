package OopsConcept;

public class Testphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone();
		p.call();
		p.sendmsg();
		System.out.println("********************");

		Mobilephone mp = new Mobilephone();
		mp.call();
		mp.sendmsg();
		mp.videocall();
		System.out.println("********************");
		
	}

}
