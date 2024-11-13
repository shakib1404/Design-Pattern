package Bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device tv=new TV();
		Remote tvRemote=new AdvancedRemote(tv);
		
		tvRemote.togglePower();
		tvRemote.channelUp();
		System.out.println("TV channel"+tv.getChannel());
		
		Device radio=new Radio();
		Remote radioRemote=new AdvancedRemote(radio);
		radioRemote.togglePower();
		radioRemote.mute();
		System.out.println("radio volume:"+radio.getVolume());
		

	}

}
