package singletonabstract;

public class ModernTable implements Table {
	private final long id;

    public ModernTable(long id) {
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("Using a modern table with ID: " + id);
    }

}
