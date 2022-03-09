package collections;
import java.util.*;
public class MetaCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,List> dists = new HashMap();
			List<String> dist1 = new ArrayList();
			dist1.add("adl");
			dist1.add("rr");
			dist1.add("ngl");
			
			List<String> dist2 = new ArrayList();
			dist2.add("Mandya");
			dist2.add("kolar");
			dist2.add("Hubli");
			
			dists.put("TS", dist1);
			dists.put("KA", dist2);
			
			System.out.println(dists);
			
			Set set=dists.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		       
		        System.out.println(entry.getKey());
		        System.out.println("The districts are: ");
		        List<String> temps = (List<String>) entry.getValue();  
		        temps.forEach(System.out::println);
		    
		    } 
			
			

	}

}
