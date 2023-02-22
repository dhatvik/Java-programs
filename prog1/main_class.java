package prog1;
import java.util.*;
public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long,String> contacts=new HashMap<Long,String>();
		
		ArrayList<miss_call> missed_call=new ArrayList<miss_call>();
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("List First 3 Contacts");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter name: ");
			String name=sc.next();
			System.out.println("Enter Number: ");
			long number=sc.nextLong();
			contacts.put(number, name);
			
		}
		System.out.println("Initial Contact List ");
		System.out.println(contacts);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Type a number for missed call");
			long number=sc.nextLong();
			if(contacts.containsKey(number))
			{
				miss_call ms=new miss_call(number,contacts.get(number));
				missed_call.add(ms);
			}
			else
			{
				miss_call ms=new miss_call(number,"Private Number");
				missed_call.add(ms);
			}
		}
		System.out.println("Missed calls in order ");
		for(int i=0;i<3;i++)
		{
			missed_call.get(i).display();
		}
		
		System.out.println("Enter the number to check missed call");
		long missed_number =sc.nextLong();
		int flag = 0;
		for(miss_call c: missed_call)
		{
			if(c.number == missed_number){
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Missed call came from given Number");
		}
		else{
			System.out.println("No missed Call");
		}
		
		System.out.println("Enter the number for Deletion");
		long number =sc.nextLong();
		if(contacts.containsKey(number))
		{
			System.out.println("Befor Deletion: ");
			System.out.println(contacts);
			contacts.remove(number);
			System.out.println("After Deletion");
			System.out.println(contacts);
		}
		else
		{
			System.out.println("Number not exists");
			System.out.println(contacts);
		}
		
	
		
		sc.close();
		
	}

}
