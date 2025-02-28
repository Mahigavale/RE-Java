package copying;

public class Shallowcopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		State state=new State("Maharashtra");

		City Pune=new City(1,"80 lakhs","Pune", state);
		
		City Mumbai=(City)Pune.clone();
		
		Mumbai.id=7;
		Mumbai.Population="1.5 crore";
		Mumbai.name="Bombay";
		Mumbai.state.state_name="India";
		
		
		System.out.println(Pune.hashCode());
		System.out.println(Mumbai.hashCode());
		
		System.out.println(Pune);
		
		System.out.println(Mumbai);
		
		
		
	
		
	}

}


class City implements Cloneable{
	int id;
	String Population;
	String name;
	
	State state;
	public City(int id, String population, String name,State state) {
	
		this.id = id;
		Population = population;
		this.name = name;
		this.state=state;
	}
	
	public Object clone()  throws CloneNotSupportedException
	{
		 City ct=(City) super.clone();
		  ct.state= new State(ct.state.state_name);
		  return ct;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", Population=" + Population + ", name=" + name + ", state=" + state.state_name + "]";
	}

	
	
	
}

class  State{
	
	String state_name;
	
	
	public State(String state_name)
	{
		this.state_name=state_name;
	}
}