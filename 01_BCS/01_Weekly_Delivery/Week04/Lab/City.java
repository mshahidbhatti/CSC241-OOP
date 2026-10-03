public class City{

	private String name;
	private String country;
	private boolean isCapital;
	private int population;

	private static int maxPopulation;

	{
	System.out.println("Non static Block Test text :2");
	}

	static{
	System.out.println("Static Block Test text");
	}

	{
	System.out.println("Non static Block Test text :1");
	}


	City(String name, String country, boolean isCapital, int population){
		System.out.println("Constructor sequence Test text");

		this.name=name;
		this.country=country;
		this.isCapital=isCapital;
		this.population= population;
		
		if(population>maxPopulation)
			maxPopulation=population;
	}

	public void display(){
		System.out.println("City :"+name);
		System.out.println("Country:"+country);
		System.out.println("Is Capital:"+isCapital);
		System.out.println("Population :" + population);

		System.out.println("Maximum Population of any City so far "+maxPopulation);
	}



}