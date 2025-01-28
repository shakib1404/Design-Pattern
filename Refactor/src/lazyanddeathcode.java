
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void printUser() {
        System.out.println("Username: " + username + ", Email: " + email);
    }

    // Dead Code (Never Called)
    private void unusedMethod() {
        System.out.println("This method is never called.");
    }

    // Lazy Class (Only one trivial method)
    public static class NotificationSender {
        public void sendNotification(String message) {
            System.out.println("Sending notification: " + message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        user.printUser();
        // Lazy class usage
        User.NotificationSender sender = new User.NotificationSender();
        sender.sendNotification("Welcome to the platform!");
    }
}
//
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void printUser() {
        System.out.println("Username: " + username + ", Email: " + email);
    }

    // Merged NotificationSender responsibility into User class
    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        user.printUser();
        user.sendNotification("Welcome to the platform!");
    }
}
