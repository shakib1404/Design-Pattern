package singletonabstract;

public class RusticSofa implements Sofa {
	private final long id;

    public RusticSofa(long id) {
        this.id = id;
    }

    @Override
    public void lieDown() {
        System.out.println("Lying down on a rustic sofa with ID: " + id);
    }

}
