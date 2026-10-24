public class MediaPlayer{

	String name;

	String maker;


	MediaPlayer(String name, String maker){
		this.name=name;
		this.maker=maker;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s, %s",super.toString(),name, maker);	
	}


}