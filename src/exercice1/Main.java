/**
 * 
 */
package exercice1;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p = new Point(1,2);
		
		//Question 3:
		// System.out.println(p.m_x + " " + p.m_y);
		// Trigger an exception because m_x and m_y are private
		
		// We can fix it by using get methods :
		System.out.println(p.getX() + " " + p.getY());
		
		//Question 4:
		// We must declare classes attributes private to protect them from wrong usage outside of the class
		
		//Question 8		
		Point p2 = new Point(p);
		System.out.println(p2.getX() + " " + p2.getY());
	}

}
