package finalcomposite;

//Leaf
class File extends FileSystemComponent {
    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching in File: " + name);
        if (content.contains(keyword)) {
            System.out.println(" found in this File: " + name);
        } else {
            System.out.println(" not found in this File: " + name);
        }
    }
}