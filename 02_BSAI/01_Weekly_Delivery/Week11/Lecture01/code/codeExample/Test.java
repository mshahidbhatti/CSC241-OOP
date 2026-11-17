import java.util.ArrayList;
public class Test{
	public static void main(String args[]){
		Box<Integer> box1=new Box<Integer>(1);
		Box<Double> box2=new Box<Double>(1.0);
		Box<String> box3=new Box<String>("Computer");


		ArrayList<String> names=new ArrayList<>();

		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("name 1","reg no",1));
		students.add(new Student("name 1","reg no",1));

		students.add(new Student("name 1","reg no",1));


		ArrayList<Person> list=new ArrayList<>(students);
		for(Person p: list)
			System.out.println(p);


		System.out.println(list.contains(new Student("name 1","reg no",1)));


	}

}