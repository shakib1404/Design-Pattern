package singletonabstract;

public class RusticTable implements Table {
	private final long id;

    public RusticTable(long id) {
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("Using a rustic table with ID: " + id);
    }

}
