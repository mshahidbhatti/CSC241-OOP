public class Product{
	int pid;


	@Override
	public boolean equals(Object other){
		Product temp= (Product)other;
		return this.pid==temp.pid;
	}


	@Override
	public String toString(){
		
		return Integer.parseInt(pid);
	}

}