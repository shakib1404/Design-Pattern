package Miscellaneous;

public class Book implements LibraryItem {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    @Override
    public String getDetails() {
        return "Book: " + title;
    }

    @Override
    public boolean borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
}
