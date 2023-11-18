package OppsConcepts;





class test{
	public static void vehicle() {
		System.out.println("this is parent car");
	}
}
public class Polymorphism extends test{
	
//	public static void vehicle() {
//		System.out.println("this is child car");
//	}
	
	public static void bicycle() {
		System.out.println("this is child motorcycle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Polymorphism poly=new Polymorphism();  // .......... standard object
		
		//test poly= new Polymorphism();  // ............Upcasting object if we use this subclass other method will not executed
		
		//poly.vehicle();
		//poly.bicycle();
		//poly.bicycle();
		//bicycle();
		vehicle();
		
	}

}
