
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point2d point = new point2d();
		System.out.println("punkt x: "+point.x);
		System.out.println("punkt y: "+point.y);
		
		point2d point2 = new point2d(3,4);
		System.out.println("punkt x: "+point2.x);
		System.out.println("punkt y: "+point2.y);

		
		point3d point3 = new point3d();
		
		System.out.println("punkt x: "+point3.x);
		System.out.println("punkt y: "+point3.y);
		System.out.println("punkt z: "+point3.z);
		
	point3d point4 = new point3d();
		
		point4.x = 55;
		point4.y = 60;
		point4.z = 15;
		
		System.out.println("punkt x: "+point4.x);
		System.out.println("punkt y: "+point4.y);
		System.out.println("punkt z: "+point4.z);
		
	}

}
