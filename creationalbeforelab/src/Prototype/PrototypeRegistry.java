package Prototype;
import java.util.*;
public class PrototypeRegistry {
	
	HashMap<String,Product> h1=new HashMap<String,Product>();
	
	void add(String string,Product product)
	{
		h1.put(string, product);
	}
	
	Product get(String key)
	{
		Product p1=h1.get(key);
		return (p1!=null)?p1.clone():null;
	}

}
