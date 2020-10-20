package ualvivlgsAnimal;

public class Cow extends Pet {

	public Cow(int weight, double hight) {
		super(weight, hight);

	}

	@Override
	void voice() {
		System.out.println("I'm Cow - muuuu-muuu");
	}

	@Override
	public int getWeight() {
		return super.getWeight();
	}

	@Override
	public void setWeight(int weight) {
		super.setWeight(weight);
	}

	@Override
	public double getHight() {
		return super.getHight();
	}

	@Override
	public void setHight(double hight) {
		super.setHight(hight);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
