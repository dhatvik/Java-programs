import java.util.ArrayList;
import java.util.*;

public class books {
	String title;
	String author;
	String publisher;
	int price;
	
	books(String title,String author,String publisher,int price)
	{
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	
	public static void main(String[] args) {
		
		books b1=new books("Database","MC.graw","BBC",100);
		books b2=new books("Cloud","Br.grills","ABC",500);
		books b3=new books("Blockchain","smith","GBC",400);
		books b4=new books("ML","Renshaw","FBC",700);
		books b5=new books("Cricket","Kohli","TBC",1300);
		
		ArrayList<books> blist =new ArrayList<books>();
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		blist.add(b4);
		blist.add(b5);
		
		System.out.println(blist);
		
		Iterator<books> iter =blist.iterator();
		
		while(iter.hasNext())
		{
			System.out.print(iter.next().title);
			
		}
 		
		HashMap<Integer,boooks> hm=new HashMap<Integer,books>();
		
		hm.
		
		
		
		
		
	}

}
