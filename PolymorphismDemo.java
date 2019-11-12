
public class PolymorphismDemo {

	public PolymorphismDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     displayObject(new Circle(1,"red",false));
     displayObject(new Rectangle(1,1,"black",true));
     
	}
	public static void displayObject(GeometricObject object){
		System.out.println("Greated on "+object.getDateCreated()+".Color is"+ object.getColor());
	}

}
