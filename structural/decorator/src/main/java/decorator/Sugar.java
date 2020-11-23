package decorator;

//Concrete Decorator
public class Sugar extends AddOn {

	public Sugar(Beverage bev) {
		super(bev);
	}

	@Override
	public String getDescription() {
		return bev.getDescription() + " With Sugar";
	}

	@Override
	public Double getCost() {
		return 0 + bev.getCost();
	}

}
