import java.util.ArrayList;
public class Demo{

	public static void main(String args[]){
		Box b1= new Box(20);


		 b1.setBox("Hello text");


		Integer i = (Integer)b1.getBox();

		NewBox<Integer> nb1=new NewBox<Integer>(12);

		// nb1.setBox("text");

		NewBox<String> nb2=new NewBox<>("text");

		ArrayList<String> list=new ArrayList<>();
		list.add("text 1");


	}
}