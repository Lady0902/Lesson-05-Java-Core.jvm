package ualvivlgsAnimal;

public abstract class Pet {
	private int weight;
	private double hight;

	public Pet(int weight, double hight) {
		super();
		this.weight = weight;
		this.hight = hight;
	}

	abstract void voice();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	@Override
	public String toString() {
		return "Pet [weight=" + weight + ", hight=" + hight + "]";
	}

}
