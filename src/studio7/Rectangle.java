package studio7;

public class Rectangle {

	public double area(double len, double wid) {
		double area = len * wid;
		return area;
	}

	public double perimeter(double len, double wid) {
		double perimeter = (len + wid) * 2.0;
		return perimeter;
	}

	public boolean firstSmallerThanSecond(double len1, double wid1, double len2, double wid2) {

		if (area(len1, wid1) < area(len2, wid2)) {
			return true;
		} else {
			return false;
		}

	}
	public boolean isSquare(double len, double wid) {
		if (len == wid) {
			return true;
		}
		return false;
	}
	
	
	public static void main (String[] args) {
		Rectangle r = new Rectangle();
		double computeArea = r.area(6.0, 6.0);
		double perimeter = r.perimeter(4.0, 3.0);
		boolean isSmaller = r.firstSmallerThanSecond(6.0,6.0,4.0,3.0);
		boolean isSquare = r.isSquare(6.0,6.0);
		System.out.println("6.0, 6.0 area: " + computeArea);
		System.out.println("4.0, 3.0 perimeter: " + perimeter);
		System.out.println("6.0 * 6.0 is smaller than 4.0 * 3.0 ?: " + isSmaller);
		System.out.println("6.0 * 6.0 is square?: " + isSquare);
		
		
	}
}


