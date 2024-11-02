package singletonabstract;

public class ModernFactory implements FurnatureFactory {

	private static volatile ModernFactory instance;
    private static long idCounter = 0;

    private ModernFactory() {}

    public static ModernFactory getInstance() {
        if (instance == null) {
            synchronized (ModernFactory.class) {
                if (instance == null) {
                    instance = new ModernFactory();
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
        return new ModernChair(generateUniqueId());
    }

    @Override
    public Table createTable() {
        return new ModernTable(generateUniqueId());
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(generateUniqueId());
    }
}