package ualvivlgsAnimal;

public class Cat extends Pet {

	public Cat(int weight, double hight) {
		super(weight, hight);

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
	void voice() {
		System.out.println("I'm Cat myauuuu-myauuu");

	}

	@Override
	public String toString() {
		return "Cat [getWeight()=" + getWeight() + ", getHight()=" + getHight() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
