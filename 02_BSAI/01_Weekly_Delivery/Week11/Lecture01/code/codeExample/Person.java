// First hierarchy: a university help desk handles requests from people.
// Bigger requestPriority means the request should be processed sooner.
public class Person implements Comparable<Person> {
    private String name;
    private int requestPriority;

    public Person(String name, int requestPriority) {
        this.name = name;
        this.requestPriority = requestPriority;
    }

    public String getName() {
        return name;
    }

    public int getRequestPriority() {
        return requestPriority;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.requestPriority, other.requestPriority);
    }

	@Override
	public boolean equals(Object other){
		Student st=(Student)other;
		
		return name.equals(st.getName());

	}
}
