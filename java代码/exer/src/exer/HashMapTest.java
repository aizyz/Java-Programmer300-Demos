package exer;
import java.util.HashMap;
public class HashMapTest {
	public static void main (String[] args){
	HashMap<String, String>hashmap = new HashMap();
	hashmap.put("wu", "yu");
	hashmap.put("zhang","yuzhu");
	hashmap.put("zhao", "sd");
	hashmap.put("da", "qi");
	hashmap.put("s", "zc");
	System.out.println(hashmap.get("wu"));
		for (String key:hashmap.keySet()){
		int hash = key.hashCode();
		int index = hash%5;
		System.out.println(String.format("%s的hashcode是%s,index是%s",key, hash,index));
	 	}
	}

}
