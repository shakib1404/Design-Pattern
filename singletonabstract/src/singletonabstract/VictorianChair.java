package singletonabstract;

public class VictorianChair implements Chair {
	private final long id;

    public VictorianChair(long id) {
        this.id = id;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair with ID: " + id);
    }

}
