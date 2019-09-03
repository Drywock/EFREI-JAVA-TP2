/**
 * 
 */
package Exercice2;

/**
 * @author Thomas LINTANF
 *
 */

import exercice1.Point;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Question 1:
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		/*
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		//output:
		// true
		// false
		*/
		
		//Question 2:
		// The "indexOf" method is use to get the index (the position in the list) of the specified item of the list
		
		//Question 3:
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		//output
		// 0
		// -1
		
		//Question 4:
		// We can not find the index of a point if we do not have its reference
		
		//Question 5:
		// It calls the method equals()
		
		//Question 6:
		//
		
		//Question 7:
		// the annotation @Override indicate that we are redefining a method from the mother class java.lang.Object
	
	}
}
