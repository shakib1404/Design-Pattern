package singletonabstract;

public class RusticChair implements Chair{
	private final long id;

    public RusticChair(long id) {
        this.id = id;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a rustic chair with ID: " + id);
    }
}
