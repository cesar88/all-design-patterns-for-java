package decorator;

//Abstract Component
public abstract class Beverage {
	
	private String description;
	
	public Beverage(String description) {
		this.description = description;
	}

	public abstract Double getCost();
	
	public String getDescription() {
		return description;
	} 
	
	

}
