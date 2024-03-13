package Interface;



interface Drawable{
	int salary = 25000;// by default its public static final so we can direclty access it 
	void draw();//by default its public abstract 
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}


class circle implements Drawable{
	public void draw() {
		
		System.out.println("Drawing circle ");
	}
}

public class interface1 {

	public static void main(String[] args) {
		System.out.println("Program starts ");
		System.out.println("&*******************************&");
		System.out.println("The Value of the salary = "+Drawable.salary);
		circle c1 = new circle();
		c1.draw();
	
		Rectangle r1 = new Rectangle();
		r1.draw();

	}

}
