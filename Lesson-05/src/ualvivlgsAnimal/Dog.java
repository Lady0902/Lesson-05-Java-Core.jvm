package ualvivlgsAnimal;

public class Dog extends Pet {

	public Dog(int weight, double hight) {
		super(weight, hight);

	}

	@Override
	void voice() {
		System.out.println("I'm Dog - gauu-gauu");

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
		return "Dog [getWeight()=" + getWeight() + ", getHight()=" + getHight() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
