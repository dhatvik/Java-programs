package threading;

import java.util.Scanner;

public class getnumber extends Thread{
	
	public String number;
	private static String[] digit=new String[]{"zero","one","two","three","Four","five","Six","seven","Eight","nine"};
	
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4 Digit Number");
		number=sc.next();
		
		for(char c:number.toCharArray()){
			if(c<48 || c>57){
				System.out.println("Invalid inputs");
				break;
			}
			System.out.println(digit[((int)c-48)]+" ");
		}
		System.out.println("\n");
	}
}
