package chainofresponsibilityrg;

//Dialog class
class Dialog extends Container {
 private String wikiPageURL;

 public Dialog(Container parent, String wikiPageURL) {
     super(parent);
     this.wikiPageURL = wikiPageURL;
 }

 @Override
 public void showHelp() {
     if (wikiPageURL != null) {
         System.out.println("Opening Wiki Page: " + wikiPageURL);
     } else {
         super.showHelp();
     }
 }
}
