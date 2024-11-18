package Miscellaneous;

public class BookFactory implements LibraryItemFactory {
    @Override
    public LibraryItem createLibraryItem(String title) {
        return new Book(title);
    }
}
