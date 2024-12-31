package finalcomposite;



public class FileSystemDemo {
	 public static void main(String[] args) {
	     File file1 = new File("Doc1.txt", "my name is Shakib.");
	     File file2 = new File("Doc2.txt", "Institute of imformation technology.");
	     File file3 = new File("Img1.png", "a technologial photo.");
	     File file4=new File("Img2.png", "My favourite photo.");

	     Folder fol1 = new Folder("Fol1");
	     fol1.add(file1);
	     fol1.add(file2);
	     fol1.add(file4);

	     Folder fol2 = new Folder("Fol2");
	     fol2.add(fol1);
	     fol2.add(file3);

	     System.out.println("Searching for keyword 'photo':");
	     fol2.search("photo");
	 }
	}