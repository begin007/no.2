
public class TotalArea {
public static void main(String[] args) {
	Circle myCircle=new Circle(1);
	int n=5;
	printAreas(myCircle, n);
	System.out.println("\n"+"Radius is"+myCircle.gerRadius());
	System.out.println("n is"+ n);
	public static void printAreas(Circle c,int times) {
		System.out.println("Radius \t\rArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius() +1);
			times--;
		}
	}
}
}
