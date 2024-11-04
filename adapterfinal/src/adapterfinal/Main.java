package adapterfinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	LegacyPrinter legacyprinter=new LegacyPrinter();
		ObjectAdapter objectadapter=new ObjectAdapter(legacyprinter);
		objectadapter.printdoc("This is legacy for object:");
		
		ClassAdapter classadapter=new ClassAdapter();
		classadapter.printdoc("this is legacy for class :");
		
		MordernPrinter printer=new MordernPrinter();
		printer.printdoc("printing for mordern printer");*/
		
		
         PrintService printerService = new PrintService();
        
        
        Printer modernPrinter = new MordernPrinter();
        printerService.print(modernPrinter, "Modern printing");

       
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer legacyPrinterObjectAdapter = new ObjectAdapter(legacyPrinter);
        printerService.print(legacyPrinterObjectAdapter, "Legacy printing  with Object Adapter...");

        
        Printer legacyPrinterClassAdapter = new ClassAdapter();
        printerService.print(legacyPrinterClassAdapter, "Legacy printing wirh with Class Adapter");
		
		

	}

}
