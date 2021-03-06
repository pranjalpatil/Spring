import org.springframework.beans.factory.annotation.Required;


public class Circle implements Shape {

	Point center;
	
	
	public Point getCenter() {
		return center;
	}

   @Required //if the dependency is not satisfied throws exception
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		System.out.println("Drawing from circle");
		
		System.out.println("Circle point is "+getCenter().getX()+" "+getCenter().getY());

	}

}
