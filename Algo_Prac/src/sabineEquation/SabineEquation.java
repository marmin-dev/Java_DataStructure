package sabineEquation;

public class SabineEquation {
	private double width;
	private double height;
	private double depth;
	private double percentage;
	
	public SabineEquation(double width, double height, double depth, double percentage) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.percentage = percentage;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}
	public double getPercentage() {
		return percentage;
	}
	
	public double getResult(double width, double height, double depth, double percentage) {
		double result = 0.0;
		double v=0.0,a=0.0;
		v= width * height * depth * 0.161;
		a=percentage * (2*(width*height)+2*(width*depth)+2*(height*depth));
		result=v/a;
		return result;
	}
	
}
