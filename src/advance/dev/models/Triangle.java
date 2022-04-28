package advance.dev.models;

public class Triangle extends Shape {
	public double a;
	public double b;
	public double c;
	public Triangle (String name,double a , double b , double c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double chuVi() {
		// TODO Auto-generated method stub
		return a + b +c;

}
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	
}
}
