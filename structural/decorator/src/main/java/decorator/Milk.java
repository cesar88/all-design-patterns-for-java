package decorator;

//Concrete Decorator
public class Milk extends AddOn {

	public Milk(Beverage bev) {
		super(bev);
	}

	@Override
	public String getDescription() {
		return bev.getDescription() + " With Milk";
	}

	@Override
	public Double getCost() {
		return 0.5 + bev.getCost();
	}

}
