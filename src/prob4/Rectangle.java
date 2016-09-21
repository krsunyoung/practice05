package prob4;

public class Rectangle extends Shape implements Resizable {
	public Rectangle(double a, double b){
		setWidth(a);
		setHeight(b);
	}

	@Override
	public void resize(double s) {
		setWidth(getWidth()*s);
		setHeight(getHeight()*s);
		
	}

	@Override
	public double getArea() {
		double i = getWidth() * getHeight();
		return i;
	}

	@Override
	public double getPerimeter() {
	 double i = getWidth()*2 + getHeight()*2;
	 return i;
	}

}
