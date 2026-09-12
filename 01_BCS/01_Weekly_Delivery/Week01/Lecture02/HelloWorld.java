import java.lang.*;
import java.time.LocalDate;

public class HelloWorld{
	public static void main(String args[]){

		LocalDate currentDate=LocalDate.now();

		LocalDate  dob=LocalDate.of(2026,1,1);

		System.out.println("Hello World!!"+ currentDate);

	}

}