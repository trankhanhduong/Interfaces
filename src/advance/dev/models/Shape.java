package advance.dev.models;

public abstract class Shape implements Comparable<Shape>{
		protected  String name;
			

		public Shape(String name) {
			super();
			this.name = name;
		}
		public abstract double chuVi();
		public abstract double dienTich();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name:%s - cv:%.2f", name, chuVi(),dienTich());
	}
		public int Comparable(Shape o) {
			// TODO Auto-generated method stub
			if(this.chuVi() > o.chuVi()) return 1;
			if(this.chuVi() < o.chuVi()) return -1;
			return 0;
			
		
	}
	}

