package singletonabstract;

public class VictorianSofa implements Sofa {
	private final long id;

    public VictorianSofa(long id) {
        this.id = id;
    }

    @Override
    public void lieDown() {
        System.out.println("Lying down on a Victorian sofa with ID: " + id);
    }

}
