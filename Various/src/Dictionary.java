import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	Map<String, String> dictionary = new HashMap<>();
	
    public Dictionary(){ }

    public void newEntry(String key, String value){
    	boolean isEmpty = dictionary.containsKey(key);
    	
    	dictionary.put(key, value); 	
    	

    	System.out.println(dictionary.get("Apple"));
    	
    	
    	System.out.println(dictionary.get("Apple"));

    
    }
    	

    public String look(String key){
    	return dictionary.getOrDefault(key, "Cant find entry for "+key);
    	
    }   
   }
