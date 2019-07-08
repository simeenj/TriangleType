package triangle.triangle_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Triangle {
	
	//validTriangle returns whether the given lengths for sides of a triangle a, b, and c can actually make a valid triangle
	public static Boolean validTriangle(Integer a, Integer b, Integer c) {
		try {
			if (a <= 0 || b <= 0 || c <= 0 ){
				throw new IllegalArgumentException("All args must be greater than 0");
			} else if (a + b > c && a + c > b && b + c > a) {
				return true;
			} else {
				return false;
			}
		} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("All args must be greater than 0", e);
		} catch (NullPointerException e1){
			throw new NullPointerException("Args must not be null");
		}
	}
	//Given the lengths of the sides of a triangle, triangleType determines whether it is equilateral, isosceles, or scalene.
	public static String triangleType(Integer a, Integer b, Integer c) throws IllegalArgumentException, NullPointerException {
		try {
			if (validTriangle(a, b, c)){
				if (a.equals(b) && b.equals(c)){
					return "Equilateral";
				} else if (!a.equals(b) && !b.equals(c) && !a.equals(c)){
					return "Scalene";
				} else
					return "Isosceles";
			} else {
				return "Not a triangle";
			}
		} catch (IllegalArgumentException e){
			e.printStackTrace(); //write this to a log
		} catch (NullPointerException e1){
			e1.printStackTrace(); //write this to a log
		}
		return null;
	}
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		ArrayList<Integer> sideLengths = new ArrayList<Integer>(); 
		char side = 'a';
		
		System.out.println("Enter in lengths for sides of a triangle in a, b, and c.");
		try{
			for (int i = 0; i < 3; i++) {
				System.out.println(side + ": ");
				sideLengths.add(Integer.parseInt(br.readLine()));
				side = (char) (side + 1);
			}
			System.out.println(Triangle.triangleType(sideLengths.get(0), sideLengths.get(1), sideLengths.get(2)));
		} catch (NumberFormatException e){
			System.out.println("All inputs must be integers");
			System.exit(1);
		} catch (IllegalArgumentException e1){
			e1.getMessage();
			System.exit(1);
		} catch (NullPointerException e2){
			e2.getMessage();
			System.exit(1);
		} catch (IOException e3){
			e3.getMessage();
			System.exit(1);
		}
	}
}
