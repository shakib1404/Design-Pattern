package finalcomposite;

import java.util.ArrayList;
import java.util.List;


class Folder extends FileSystemComponent {
   
    private List<FileSystemComponent> children = new ArrayList<>();

    
    public Folder(String name) {
        super(name);
    }
   
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    
    @Override
    public void search(String keyword) {
        System.out.println("Searching in Folder: " + name);
        for (FileSystemComponent composite : children) {
            composite.search(keyword); 
        }
    }
}
