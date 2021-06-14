package advance;

public  abstract class Shape {
      String name;
      abstract double chuVi();
      abstract double dienTich();
      
	public Shape(String name) {
		super();
		this.name = name;
	}
      
}
