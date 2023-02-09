package hashmap;
import java.util.*;

public class hashex {
	public static void main(String[] args){
		HashMap<Integer,String> dic =new HashMap<Integer,String>();
		
		//Inserting elements into hashmap
		dic.put(1, "ML");
		dic.put(2, "OOADP");
		dic.put(3, "BC");
		dic.put(4, "Cloud");
		
		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : dic.entrySet()){    
		System.out.println(m.getKey()+" "+m.getValue());    
	}  
		dic.putIfAbsent(5,"EVS");
		
		   System.out.println("Iterating Hashmap After PUTIFABSENT() METHOD...");  
		   for(Map.Entry m : dic.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
	HashMap<Integer,String> dic1 =new HashMap<Integer,String>();
	
	dic1.put(6,"JavaLab");
	dic1.putAll(dic);
	
	  System.out.println("Iterating Hashmap After PUTALL() METHOD...");  
	   for(Map.Entry m : dic1.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   } 
	 
	   //Remove methods
	 dic.remove(5);
	 System.out.println("Iterating Hashmap After PUTALL() METHOD...");  
	   for(Map.Entry m : dic1.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   } 
	  
	   //REPLACE METHODS
	   
	   System.out.println("Updated list of elements:");  
	     dic.replace(3, "BlockChain");  
	     for(Map.Entry m:dic.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	   System.out.println("Replacing all values in hashmap");
	        dic.replaceAll((k,v) -> "ISE SUBJECTS");  
	        for(Map.Entry m:dic.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		   
	     
	     
		
	}

}
