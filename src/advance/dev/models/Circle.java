package advance.dev.models;

public class Circle extends Shape {
	public double bk;
	
	public Circle(String name, double bk) {
		super(name);
		this.bk = bk;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * bk;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * bk * bk;
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if(this.chuVi() > o.chuVi()) return 1;
		if(this.chuVi() < o.chuVi()) return -1;
		return 0;
	}
}
