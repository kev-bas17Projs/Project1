package fixtures;
public abstract class Fixture {
	String name;
	String longDescription;
	String shortDescription;
	
	public Fixture(String name, String longDescription, String shortDescription) {
		this.name = name;
		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
}
