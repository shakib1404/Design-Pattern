package Miscellaneous;

public class MagazineFactory implements LibraryItemFactory {
    @Override
    public LibraryItem createLibraryItem(String title) {
        return new Magazine(title);
    }
}