package prob4;

public class RectTriangle extends Shape {
	public RectTriangle(double a, double b) {
		setWidth(a);
		setHeight(b);
	}
	@Override
	public double getArea() {
		double i = getWidth()*getHeight()/2;
		return i;
	}

	@Override
	public double getPerimeter() {
		double i = getWidth()+getHeight()+Math.sqrt(Math.pow(getWidth(), 2)+Math.pow(getHeight(), 2));
		return i;
	}

}
