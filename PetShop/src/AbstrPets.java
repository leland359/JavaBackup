// abstract classes may have concrete methods as well as abstract methods or
// they may be comprised of all abstract methods.

// abstract methods appearing in an abstract class must be defined by
// any class extending this abstract class

public abstract class AbstrPets implements PetsInterface { 
	private String name;
	private int size;

	public AbstrPets(String petName) {
		name = petName;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "pet " + name;
	}

	abstract public String speak();

	abstract public String move();
}
