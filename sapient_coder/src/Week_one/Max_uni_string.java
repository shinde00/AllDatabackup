package Week_one;

public class Max_uni_string {

	public static void main(String[] args) {
		
		String input="abbbbcdddddccz";
		int count=1;
		int maxindex=0;
		int maxlength=1;
		int startindex=0;
		for(int i=1;i<input.length();i++) {
			
		if(input.charAt(i-1)==input.charAt(i))	{
			count++;
		}else {
			count=1;
			maxindex=i;
		}
		if(count>maxlength) {
			maxlength=count;
			startindex=maxindex;
			//count=maxlength;
		}
		}
		
  System.out.println(startindex+" "+maxlength);
	}

}
