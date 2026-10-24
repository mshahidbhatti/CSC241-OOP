public class AudioPlayer extends MediaPlayer{
	int bitRate;

	AudioPlayer(String name, String maker, int bitRate){
		super(name, maker);
		this.bitRate=bitRate;
	}


	@Override
	public String toString(){
		return String.format("%s %d",super.toString(), bitRate);
	}


}