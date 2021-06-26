package demo;

class Point {
	
    private	double xCoordinate;
	private double yCoordinate;
	double distance;
	
    //Implement your code here
	
	public Point(double xCoordinate, double yCoordinate){
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	    public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	
	public double calculateDistance() {
		
	    distance = Math.sqrt(Math.pow((xCoordinate - 0),2) + (Math.pow((yCoordinate - 0),2)));
		//distance = Math.sqrt(((xCoordinate - 0)*(xCoordinate - 0)) + (((yCoordinate - 0)*(yCoordinate - 0))));
		return Math.round(distance*100.0)/100.0;
	}
	
	public double calculateDistance(Point point) {
	distance = Math.sqrt(Math.pow((xCoordinate - point.xCoordinate),2) + (Math.pow((yCoordinate - point.yCoordinate),2)));
		if(distance < 0) {
			return Math.round((distance*-1)*100.0)/100.0;
		}
		else {
			return Math.round(distance*100.0)/100.0;
		}
		
	}
}


class Tester1 {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
       
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
