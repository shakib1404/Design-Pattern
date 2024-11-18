package Miscellaneous;


import java.util.HashMap;
import java.util.Map;

public class LibraryItemFactoryManager {
    private static final Map<String, LibraryItemFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put("book", new BookFactory());
        factoryMap.put("magazine", new MagazineFactory());
    }

    public static LibraryItemFactory getFactory(String type) {
        LibraryItemFactory factory = factoryMap.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown factory type: " + type);
        }
        return factory;
    }
}