package threading;


import java.util.*;

public class getstring extends Thread{

	public String string;
	public static String vowels="aeiou";
	
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		string =sc.next();
		int x=0;
		for(char c:string.toCharArray()){
			for(char ch :vowels.toCharArray())
			{
				if(c==ch)
				{
					x++;
				}
			}
		}
		System.out.println(x+"Vowels Present");
	}
}
