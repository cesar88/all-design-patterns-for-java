package decorator;

public class Main {

	public static void main(String[] args) {
		HouseBlend coffee = new HouseBlend();
		System.out.println(coffee.getDescription());

		Milk coffeeWithMilk = new Milk(coffee);
		System.out.println(coffeeWithMilk.getDescription());

		Sugar coffeeWithSugar = new Sugar(coffee);
		System.out.println(coffeeWithSugar.getDescription());

		Sugar coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);
		System.out.println(coffeeWithMilkAndSugar.getDescription() + " : " + coffeeWithMilkAndSugar.getCost());

	}

}
