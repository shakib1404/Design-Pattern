package Miscellaneous;


public class Magazine implements LibraryItem {
    private String title;
    private boolean isAvailable;

    public Magazine(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title;
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
