package singletonabstract;

public class ModernSofa implements Sofa {
	 private final long id;

	    public ModernSofa(long id) {
	        this.id = id;
	    }

	    @Override
	    public void lieDown() {
	        System.out.println("Lying down on a modern sofa with ID: " + id);
	    }
	
}
