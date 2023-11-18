package Week_one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicate_from_string {

	public static void main(String[] args) {
		
		String str="Asssessment";
		String opt="";
		
		/*********using ArrayList******/
		
		List<Character>list=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
		
		if(! list.contains(str.charAt(i))) {
			list.add(str.charAt(i));
			opt=opt+str.charAt(i);
		}
		}
		System.out.println(opt);
		
		
		/*********using HashSet******/
		
		Set<Character>set=new HashSet<>();
		
		for(int j=0;j<str.length();j++) {
			
			set.add(str.charAt(j));
			
		}
		System.out.println(set);
	
		}

}
