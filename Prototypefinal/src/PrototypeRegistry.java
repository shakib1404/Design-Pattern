
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Product> prototypes = new HashMap<>();

   
    public void addPrototype(String key, Product product) {
        prototypes.put(key, product);
    }

    
    public Product getPrototype(String key) {
        Product prototype = prototypes.get(key);
        return (prototype != null) ? prototype.cloneProduct() : null;
    }
}

