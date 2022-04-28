package advance.dev.dao;


import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Shape;

public class ShapeManager implements IShape {
	private List<Shape> list = new ArrayList<Shape>();
	@Override
	public void add(Shape shape) {
		// TODO Auto-generated method stub
		list.add(shape);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Shape shape : list) {
			System.out.println(shape);
			
		}
		
	}			
	public Shape get(int index) {
		return list.get(index);
		
	}

}

