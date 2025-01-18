package Protoytpe;
import java.util.*;

public class Registry {

	HashMap<String,Product> stores= new HashMap<>();
	
	void add(String key,Product value)
	{
		stores.put(key, value);
	}
	
	Product get(String key)
	{
		Product p1=stores.get(key);
		return (p1!=null)?p1.clone():null;
	}
}
