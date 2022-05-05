package advance.dev;

import java.util.Iterator;
import java.util.Scanner;

import advance.dev.dao.IShape;
import advance.dev.dao.ShapeManager;
import advance.dev.models.Circle;
import advance.dev.models.Rectangle;
import advance.dev.models.Triangle;
public class MainApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IShape shapeManager = new ShapeManager();
    System.out.println("Nhap vao 2 hinh tron");
    for (int i = 0; i < 2; i++) {
      System.out.println("Nhap ban kinh");
      double bk = sc.nextDouble();
      sc.nextInt();
      shapeManager.add(new Circle("Circle"+i ,bk));
    }
    System.out.println("Nhap vao 2 hinh chu nhat");
    for (int i = 0; i < 2; i++) {
      System.out.println("Nhap a");
      double a = sc.nextDouble();
      sc.nextInt();
      System.out.println("Nhap b");
      double b = sc.nextDouble();
      sc.nextInt();
      shapeManager.add(new Rectangle("Rectangle" + i ,a ,b));
    }
    System.out.println("Nhap vao hinh tam giac ");
      System.out.println("Nhap a");
      double a = sc.nextDouble();
      sc.nextInt();
      System.out.println("Nhap b");
      double b = sc.nextDouble();
      sc.nextInt();
      System.out.println("Nhap c");
      double c = sc.nextDouble();
      sc.nextInt();
      shapeManager.add(new Triangle("Triangle",a ,b,c));
      shapeManager.print();
      shapeManager.sort();
      shapeManager.print();

  }
}