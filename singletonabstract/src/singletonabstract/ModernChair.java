package singletonabstract;

public class ModernChair implements Chair {
	 private final long id;

	    public ModernChair(long id) {
	        this.id = id;
	    }

	public void sitOn() {
        System.out.println("Sitting on a modern chair with ID: " + id);
    }
}
