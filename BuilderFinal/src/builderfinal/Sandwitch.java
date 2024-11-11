package builderfinal;

public class Sandwitch {
	
	 private String bread;
	    private String filling;
	    private String accompaniment;
		
		public String getAccompaniment() {
			return accompaniment;
		}
		public void setBread(String bread) {
			this.bread = bread;
		}
		public void setFilling(String filling) {
			this.filling = filling;
		}
		public void setAccompaniment(String accompaniment) {
			this.accompaniment = accompaniment;
		}
		@Override
		public String toString() {
			return "Sandwitch [bread=" + bread + ", filling=" + filling + ", accompaniment=" + accompaniment + "]";
		}
		
		

}
