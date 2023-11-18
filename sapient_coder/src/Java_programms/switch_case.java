package Java_programms;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 30;
		String ch = "sub1";
		int  c ;
		switch(ch) {
		
		case "add":
			 c = a + b;
			System.out.println(c);
			break;
		
		case "sub":
			c = a - b;
			System.out.println(c);
			break;
		
		case "mul":
			c = a * b;
			System.out.println(c);
			break;
		
		case "div":
			  c = a / b;
			System.out.println(c);
			break;
		
		default:
			System.out.println("Wrong choice");
			break;	
		}
		
	}

}
