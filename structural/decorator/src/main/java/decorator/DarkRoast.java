package decorator;

//Concerete Component
public class DarkRoast extends Beverage {

	public DarkRoast() {
		super("DarkRoast Coffee");
	}

	@Override
	public Double getCost() {
		return 6.0;
	}

}
