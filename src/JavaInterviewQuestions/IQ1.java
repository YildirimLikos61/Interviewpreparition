package JavaInterviewQuestions;

public class IQ1 {

	public static void main(String[] args) {
		
		//1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
		//	without a temporary variable?
		//	int a = 5;
		//	int b = 10;
		//	At the end, the value of b will be 5 and the value of a will be 10.
		//	You can add them together and remove them from each other.
		
		int a=5;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		//
		
		String str="Yildirim";
		String str2="Likos";
		
		str=str+str2;
		str2=str.substring(0,str.length()-str2.length());
		str=str.substring(str2.length());
		System.out.println(str);
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
