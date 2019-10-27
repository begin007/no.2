
public class TestPassObject {
private double radius=1;
private static int numberOfObjects=0;
	public TestPassObject() {
		// TODO Auto-generated constructor stub
		numberOfObjects++;
	}

	public TestPassObject(double newRadius) {
		// TODO Auto-generated method stub
    radius=newRadius;
    numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
