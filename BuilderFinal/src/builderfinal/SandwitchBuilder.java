package builderfinal;

public interface SandwitchBuilder {
	
	 SandwitchBuilder setBread(String bread);
	    SandwitchBuilder setFilling(String filling);
	    SandwitchBuilder setAccompaniment(String accompaniment);
	    Sandwitch build();

}
