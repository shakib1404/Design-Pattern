package adapterfinal;

public class ObjectAdapter implements Printer {
	private final LegacyPrinter legacyprinter;
	
	public ObjectAdapter(LegacyPrinter legacyprinter)
	{
		this.legacyprinter=legacyprinter;
	}
	public void printdoc(String doc)
	{
		legacyprinter.oldDoc(doc);
	}
	
}
