package adapterfinal;

public class ClassAdapter extends LegacyPrinter implements Printer{
	
	public void printdoc(String doc)
	{
		oldDoc(doc);
	}

}
