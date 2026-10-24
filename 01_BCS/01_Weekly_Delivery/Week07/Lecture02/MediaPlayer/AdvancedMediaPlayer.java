class AdvancedAudioPlayer extends AudioPlayer{
	double duration;

	AdvancedAudioPlayer(String name, String maker, int bitRate, double duration){
		super(name, maker,bitRate);
		this.duration=duration;
	}

	@Override
	public String toString(){
		return "";
	}

}