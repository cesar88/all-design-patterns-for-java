package decorator;

//Abstract Decorator
public abstract class AddOn extends Beverage {
	
	protected Beverage bev;
	
	public AddOn(Beverage bev) {
		super("Add on");
		this.bev=bev;
	}

}
