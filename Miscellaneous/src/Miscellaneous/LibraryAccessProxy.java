package Miscellaneous;

public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realLibraryAccess = new RealLibraryAccess();

    @Override
    public boolean accessItem(String itemID, User user) {
        if (user.isRestricted()) {
            System.out.println("Access denied: Restricted user.");
            return false;
        }
        return realLibraryAccess.accessItem(itemID, user);
    }
}
