public class Demo{

	public static void main(String args[]){
		Object o=new Object();
		System.out.println(o.toString());

		MediaPlayer mp1=new MediaPlayer("MP3","Sony");
		System.out.println(mp1.toString());

		Object o2= new MediaPlayer("MP4","Samsung");
		System.out.println(o2);

		AudioPlayer aud1=new AudioPlayer("wave","Nokia",12);
		System.out.println(aud1);

		Object aud2=new AudioPlayer("wave","Nokia",12);
		System.out.println(aud2);	

		Object aud3=new AdvancedAudioPlayer("wave","Nokia",12,3.5);
		System.out.println(aud3);	





	}

}