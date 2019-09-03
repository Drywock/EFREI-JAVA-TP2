/**
 * 
 */
package exercice1;

/**
 * @author Thomas LINTANF
 *
 */
public class Point {

	/**
	 * @param args
	 */

	private int m_x;
	private int m_y;

	public static void main(String[] args){
		Point p = new Point();
		
		//Question 1:
		System.out.println(p.m_x + " " + p.m_y);
		// output "0 0"
		
		//Question 2:
		// it shows the values because the static method belong to the class Point
	}


	public Point() {
		m_x = 0;
		m_y = 0;
	}
	
	public Point(int x, int y) {
		m_x = x;
		m_y = y;
	}
	
	public Point(Point p) {
		this(p.m_x,p.m_y);
	}
	
	public int getX(){
		return m_x;
	}

	public int getY(){
		return m_y;
	}
	
	public void setX(int x){
		m_x = x;
	}
	
	public void setY(int y){
		m_y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + m_x + ", y=" + m_y + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + m_x;
		result = prime * result + m_y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (m_x != other.m_x)
			return false;
		if (m_y != other.m_y)
			return false;
		return true;
	}
	
}
