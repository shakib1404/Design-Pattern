package Proxyfinal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageViewer {
    public static void main(String[] args) {
        
        List<String> filenames = List.of("photo1.jpg", "photo2.jpg", "photo3.jpg");

        
        List<Image> images = new ArrayList<>();
        for (String filename : filenames) {
            images.add(new ProxyImage(filename));
        }

        System.out.println("Image Viewer Program");
        System.out.println("List of photos:");
        
        
        for (int i = 0; i < filenames.size(); i++) {
            System.out.println((i + 1) + ". " + filenames.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the photo to view: ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= images.size()) {
            System.out.println("Displaying selected image:");
            images.get(choice - 1).display(); 
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

