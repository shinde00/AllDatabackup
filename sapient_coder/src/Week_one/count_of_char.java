package Week_one;

import Week_one.count_of_char.test;

public class count_of_char {

	class test{
		public   void c() {
			System.out.println("class in class");
		}
	}
	
	
	public static void main(String[] args) {
		
		String str="publicissapientnoidaaaaaaa";
		char ch='a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(ch==(str.charAt(i))) {
				
				count=count+1;
	
			}
			
		}
		System.out.println("character 'a' occers in given string : "+count +" times");	
	}
}
