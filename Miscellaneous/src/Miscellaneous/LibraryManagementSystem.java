package Miscellaneous;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Singleton Configuration Manager
    	
    	
        LibraryConfigManager configManager = LibraryConfigManager.getInstance();
        System.out.println("Library Hours: " + configManager.getOpeningHours());
        System.out.println("Late Fee: $" + configManager.getLateFee());
        
        
        
        configManager.updateSettings(1.00, 10, "10 AM - 6 PM");
         
        System.out.println("Library Hours: " + configManager.getOpeningHours());
        System.out.println("Late Fee: $" + configManager.getLateFee());
        
        // Factory Manager Usage
        LibraryItemFactory bookFactory = LibraryItemFactoryManager.getFactory("book");
        LibraryItemFactory magazineFactory = LibraryItemFactoryManager.getFactory("magazine");

        LibraryItem book = bookFactory.createLibraryItem("The Great Gatsby");
        LibraryItem magazine = magazineFactory.createLibraryItem("National Geographic");

        System.out.println(book.getDetails());
        System.out.println(magazine.getDetails());

        // Proxy for Access Control
        LibraryAccess proxy = new LibraryAccessProxy();

        User user1 = new User("Alice", false);
        User user2 = new User("Bob", true);

        proxy.accessItem("1", user1); // Allowed
        proxy.accessItem("2", user1); // Allowed
        proxy.accessItem("1", user2); // Denied
    }
}
