package advance;

public class Circle extends Shape{
      double r;

	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
      @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.format("Hinh tron ten %s , ban kinh la %f", name ,r);
    }
}
