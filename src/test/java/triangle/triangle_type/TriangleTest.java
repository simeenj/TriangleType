package triangle.triangle_type;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
	
	/** TESTING VALID TRIANGLE **/
	// Testing a, b, or c = 0
	public void testValidTriangleZeroes() {
		boolean thrown = false;
	
		try{
			Triangle.validTriangle(0, 1, 1);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, 0, 1);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, 1, 0);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	// Testing a, b, or c is negative
	public void testValidTriangleNegatives(){
		boolean thrown = false;
		
		try{
			Triangle.validTriangle(-1, 1, 1);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, -1, 1);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, 1, -1);
		} catch (IllegalArgumentException e){
			thrown = true;
		}
		assertTrue(thrown);
	}

	// Testing a, b, or c is null
	public void testValidTriangleNulls(){
		boolean thrown = false;
		
		try{
			Triangle.validTriangle(null, 1, 1);
		} catch (NullPointerException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, null, 1);
		} catch (NullPointerException e){
			thrown = true;
		}
		assertTrue(thrown);
		thrown = false;
		
		try{
			Triangle.validTriangle(1, 1, null);
		} catch (NullPointerException e){
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	//Testing permutations of an invalid triangle
	public void testValidTriangleInvalid(){
		assertFalse(Triangle.validTriangle(1, 1, 2));
		assertFalse(Triangle.validTriangle(1, 2, 1));
		assertFalse(Triangle.validTriangle(2, 1, 1));
	}
	
	public void testValidTriangleValid(){
		//Testing equilateral
		assertTrue(Triangle.validTriangle(1, 1, 1)); 
		
		//Testing permutations of an isosceles
		assertTrue(Triangle.validTriangle(3, 1, 3));
		assertTrue(Triangle.validTriangle(3, 3, 1));
		assertTrue(Triangle.validTriangle(1, 3, 3));
		
		//Testing permutations of a scalene
		assertTrue(Triangle.validTriangle(4, 2, 3));
		assertTrue(Triangle.validTriangle(2, 4, 3));
		assertTrue(Triangle.validTriangle(2, 3, 4));
	}
	
	/** TESTING TRIANGLETYPE **/
	public void testTriangleTypeEqilateral()
	{
		assertEquals(Triangle.triangleType(1, 1, 1), "Equilateral");
	}
	
	//Testing permutations of isosceles
	public void testTriangleTypeIsosceles(){
		assertEquals(Triangle.triangleType(3, 1, 3), "Isosceles");
		assertEquals(Triangle.triangleType(1, 3, 3), "Isosceles");
		assertEquals(Triangle.triangleType(3, 3, 1), "Isosceles");
	}
	
	//Testing permutations of scalene
	public void testTriangleTypeScalene(){
		assertEquals(Triangle.triangleType(4, 2, 3), "Scalene");
		assertEquals(Triangle.triangleType(2, 4, 3), "Scalene");
		assertEquals(Triangle.triangleType(2, 3, 4), "Scalene");
	}
	
	//Testing invalid triangles
	public void testTriangleTypeInvalid(){
		assertEquals(Triangle.triangleType(1, 1, 2), "Not a triangle");
		assertEquals(Triangle.triangleType(1, 2, 1), "Not a triangle");
		assertEquals(Triangle.triangleType(2, 1, 1), "Not a triangle");
	}
}


