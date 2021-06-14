package advance;

public class Rectangle extends Shape{
         double a;
         double b;
         
		public Rectangle(String name, double a, double b) {
			super(name);
			this.a = a;
			this.b = b;
		}

		@Override
		double chuVi() {
			// TODO Auto-generated method stub
			return 2*(a+b);
		}

		@Override
		double dienTich() {
			// TODO Auto-generated method stub
			return a*b;
		}
         @Override
        public String toString() {
        // TODO Auto-generated method stub
        return String.format(" hinh chu nhat ten %s,Do dai 2 canh %f  %f", name,a,b);
        }
}
