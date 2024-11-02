package singletonabstract;

public class VictorianTable implements Table {
	private final long id;

    public VictorianTable(long id) {
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("Using a Victorian table with ID: " + id);
    }
}
