package Amphibia;

public class Amphibia {
	private int weiht;
	private double higth;

	public Amphibia(int weiht, double higth) {
		super();
		this.weiht = weiht;
		this.higth = higth;
	}

	public int getWeiht() {
		return weiht;
	}

	public void setWeiht(int weiht) {
		this.weiht = weiht;
	}

	public double getHigth() {
		return higth;
	}

	public void setHigth(double higth) {
		this.higth = higth;
	}

	

	@Override
	public String toString() {
		return "Amphibia [weiht=" + weiht + ", higth=" + higth + "]";
	}

	void eat() {

	}

	void sleep() {

	}

	void sweem() {

	}

	void walk() {

	}
}
