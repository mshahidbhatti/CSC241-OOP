class A{
	int a;

	void updateStudent(Student s){
		s.addCredit(12);
	}

}


class Demo{

	pubic static void main(String args){
		Student s1=new Student();
		A obj=new A();
		obj.updateStudent(s1);
		
	}

}