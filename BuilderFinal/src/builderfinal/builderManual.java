package builderfinal;

public class builderManual implements SandwitchBuilder{
	

	 private Sandwitch sandwich;

    public builderManual() {
        this.sandwich = new Sandwitch();
    }

    
    public builderManual setBread(String bread) {
        sandwich.setBread(bread);
        return this;
    }

    
    public builderManual setFilling(String filling) {
        sandwich.setFilling(filling);
        return this;
    }

   
    public builderManual setAccompaniment(String accompaniment) {
        sandwich.setAccompaniment(accompaniment);
        return this;
    }
    
    public Sandwitch build() {
        
        return sandwich;
    }


	@Override
	public String toString() {
		return "builderManual [sandwich=" + sandwich + ", build()=" + build() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    

}
