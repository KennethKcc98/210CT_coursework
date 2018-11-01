public class Circle extends Shape{
	private Point center;// define center
	private  double radius;//define radius
	
	public Circle(double x, double y,double radius) {
		super("circle");
		this.radius = radius;
		center = new Point(x, y);
	}
	
	public double getRadius() { return radius; }

	public Point getCenter() { return center; }

	public void setRadius(double r) {
		radius = r;
	}

	public void setCenter(Point p) {
		center = p;
	}

	public double getArea() { 
		return Math.PI*radius*radius;
	}

	public String toString() {
		return "center=" + center.toString() + "; radius=" + radius;
	}

	
}