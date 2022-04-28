package advance.dev.models;

public class Rectangle extends Shape  {
	public double a;
	public double b;
	public Rectangle(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (a+b);
}
	public double dienTich() {
		// TODO Auto-generated method stub
		return a * b;
}
}
