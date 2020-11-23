package decorator;

//Concrete Component
public class HouseBlend extends Beverage {

	public HouseBlend() {
		super("HouseBlend Coffee");
	}

	@Override
	public Double getCost() {
		return 5.0;
	}

}
