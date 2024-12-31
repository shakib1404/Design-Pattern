package finalcomposite;

//Component
abstract class FileSystemComponent {
 protected String name;

 public FileSystemComponent(String name) {
     this.name = name;
 }

 public abstract void search(String keyword);
 
}



 



