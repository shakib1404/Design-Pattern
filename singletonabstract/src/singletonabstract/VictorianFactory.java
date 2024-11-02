package singletonabstract;

public class VictorianFactory implements FurnatureFactory {
	  private static volatile VictorianFactory instance;
	    private static long idCounter = 0;

	    private VictorianFactory() {}

	    public static VictorianFactory getInstance() {
	        if (instance == null) {
	            synchronized (VictorianFactory.class) {
	                if (instance == null) {
	                    instance = new VictorianFactory();
	                }
	            }
	        }
	        return instance;
	    }

	    private synchronized long generateUniqueId() {
	        return ++idCounter;
	    }

	    @Override
	    public Chair createChair() {
	        return new VictorianChair(generateUniqueId());
	    }

	    @Override
	    public Table createTable() {
	        return new VictorianTable(generateUniqueId());
	    }

	    @Override
	    public Sofa createSofa() {
	        return new VictorianSofa(generateUniqueId());
	    }

}
