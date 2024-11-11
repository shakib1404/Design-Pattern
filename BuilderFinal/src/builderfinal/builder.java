package builderfinal;

public class builder implements SandwitchBuilder{
	
	 private Sandwitch sandwich;

     public builder() {
         this.sandwich = new Sandwitch();
     }

     
     public builder setBread(String bread) {
         sandwich.setBread(bread);
         return this;
     }

     
     public builder setFilling(String filling) {
         sandwich.setFilling(filling);
         return this;
     }

    
     public builder setAccompaniment(String accompaniment) {
         sandwich.setAccompaniment(accompaniment);
         return this;
     }

    
     public Sandwitch build() {
         return sandwich;
     }
 }


