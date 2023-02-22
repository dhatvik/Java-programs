package prog1;

public class miss_call {
	long number;
	String name;
	
	miss_call(long number,String name)
	{
		this.number=number;
		this.name=name;
	}
	
	void display()
	{
		System.out.println("Number: "+number+" Name: "+name);
	}
	
}
