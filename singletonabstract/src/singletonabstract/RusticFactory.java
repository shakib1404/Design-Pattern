package singletonabstract;

public class RusticFactory implements FurnatureFactory {
	 private static volatile RusticFactory instance;
	    private static long idCounter = 0;

	    private RusticFactory() {}

	    public static RusticFactory getInstance() {
	        if (instance == null) {
	            synchronized (RusticFactory.class) {
	                if (instance == null) {
	                    instance = new RusticFactory();
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
	        return new RusticChair(generateUniqueId());
	    }

	    @Override
	    public Table createTable() {
	        return new RusticTable(generateUniqueId());
	    }

	    @Override
	    public Sofa createSofa() {
	        return new RusticSofa(generateUniqueId());
	    }
}
