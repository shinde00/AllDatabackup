package Week_one;

public class remove_spaces {

	public static void main(String[] args) {
		String str1 = " I  am    software   quality  engineer ";
		String b[]=str1.split(" ");
		String  y="";
		for(int i=0;i<b.length;i++) {
			y=y+b[i];
		}
 System.out.println(y);
	}

}
