package Bridge;

public class Radio implements Device{


	private boolean on=false;
	private int volume=50;
	private int channel=1;
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return on;
	}
	@Override
	public void enable() {
		// TODO Auto-generated method stub
		on=true;
		
	}
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		on=false;
		
	}
	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		
		return volume;
	}
	@Override
	public void setVolume(int percent) {
		// TODO Auto-generated method stub
		this.volume=percent;
		
	}
	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}
	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
		
	}
	
	
	
}
