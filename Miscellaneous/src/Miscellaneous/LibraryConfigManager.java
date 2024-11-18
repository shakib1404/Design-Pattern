package Miscellaneous;

public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private int borrowingLimit;
    private String openingHours;

    private LibraryConfigManager() {
        lateFee = 0.50;
        borrowingLimit = 5;
        openingHours = "9 AM - 5 PM";
    }

    public static synchronized LibraryConfigManager getInstance() {
        if (instance == null) {
            instance = new LibraryConfigManager();
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
    
    public void updateSettings(double newLateFee, int newBorrowingLimit, String newOpeningHours) {
        if (newLateFee < 0 || newBorrowingLimit <= 0) {
            throw new IllegalArgumentException("Late fee and borrowing limit must be positive.");
        }
        if (newOpeningHours == null || newOpeningHours.isEmpty()) {
            throw new IllegalArgumentException("Opening hours cannot be null or empty.");
        }

        lateFee = newLateFee;
        borrowingLimit = newBorrowingLimit;
        openingHours = newOpeningHours;
        System.out.println("Library configuration updated successfully.");
    }
}