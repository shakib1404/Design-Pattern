package Miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess {
    private Map<String, LibraryItem> libraryItems = new HashMap<>();

    public RealLibraryAccess() {
        libraryItems.put("1", new Book("Java Programming"));
        libraryItems.put("2", new Magazine("Tech Monthly"));
    }

    @Override
    public boolean accessItem(String itemID, User user) {
        LibraryItem item = libraryItems.get(itemID);
        if (item != null && item.borrowItem()) {
            System.out.println(user.getName() + " borrowed: " + item.getDetails());
            return true;
        }
        System.out.println("Item not available or does not exist.");
        return false;
    }
}

