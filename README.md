# TriangleType
Given the lengths of the sides of a triangle, this program determines whether it is an equilateral, isosceles, or scalene triangle.

## Solution
Before any type can be determined, we must first determine if the inputs of the three sides could actually make a triangle. <i>validTriangle</i> must first check that exactly 3 non-null integers greater than 0 are passed in. 

If the lengths input are considered valid, <i>validTriangle</i> then checks whether sum of the lengths of any two sides of the triangle, the sum is greater than the third.

Once determined that the lengths input do make a valid triangle, triangleType determines what type it is. For efficiency, triangleType checks whether it is equilateral first as there is only one possible way to be an equilateral triangle, and that is if all sides are equal. 

The second conditional is for a scalene because again there is only one possible way to be a scalene triangle, and this is if all three sides are unequal.

If it's been determined that the lengths given do make a valid triangle, and the type is not equilateral nor scalene, then it must be isosceles. This again adds to efficiency because an isosceles triangle is one where two sides are equal, but not the third, which could result from more than one possibilities:

If the inputs are invalid, then no type can be determined and triangleType just returns null. If the inputs are valid, but they do not pass the Triangle Inequality Theorem to form a triangle, triangleType returns "Not a Triangle".

#Stepts to run :
1. Clone this repository
2. Import project in Eclipse or IntelliJ
3. Build maven project (to download all dependencies) => Clean and Install
4. Right click on 'TriangleTest' and run
