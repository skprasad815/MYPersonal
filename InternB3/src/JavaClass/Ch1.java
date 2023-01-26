package JavaClass;

public class Ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Classroom of 500 students - You have to store marks of these 500 students You
		 * have 2 options: 1. Create 500 variables 2. Use Arrays (recommended)
		 */
		// There are three main ways to create an array in Java
		// 1. Declaration and memory allocation
		// int [] marks = new int[5];

		// 2. Declaration and then memory allocation
		// int [] marks;
		// marks = new int[5];
		// Initialization
		// marks[1] = 60;
		// marks[2] = 70;
		// marks[3] = 90;
		// marks[4] = 86;

		// 3. Declaration, memory allocation and initialization together

//int [] marks; // A 1-D Array
		
		/*
		 * int [][] flats; // A 2-D Array flats = new int [2][3]; flats[0][0] = 101;
		 * flats[0][1] = 102; flats[0][2] = 103; flats[1][0] = 201; flats[1][1] = 202;
		 * flats[1][2] = 203;
		 * 
		 * // Displaying the 2-D Array (for loop)
		 * System.out.println("Printing a 2-D array using for loop"); for(int
		 * i=0;i<flats.length;i++){ for(int j=0;j<flats[i].length;j++) {
		 * System.out.print(flats[i][j]); System.out.print(" "); }
		 * System.out.println("");
		 */
		 

// Practice Problem 1
		
		/*
		 * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f}; float sum = 0;
		 * for(float element:marks) { sum = sum + element; }
		 * System.out.println("The value of sum is " + sum);
		*/ 
	
		  //Practice Problem 2 
			/*
			 * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f}; float num = 45.57f;
			 * boolean isInArray = false; for(float element:marks){ if(num==element) {
			 * isInArray = true; break; } } if(isInArray){
			 * System.out.println("The value is present in the array"); } else{
			 * System.out.println("The value is not present in the array"); }
			 * 
			 */
		 /* // Practice Problem 3
		 * 
		 * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f}; float sum = 0;
		 * for(float element:marks){ sum = sum + element; }
		 * System.out.println("The value of average marks is " + sum/marks.length);
		 * 
		 * 
		 * // Practice Problem 4 int [][] mat1 = {{1, 2, 3}, {4, 5, 6}}; int [][] mat2 =
		 * {{2, 6, 13}, {3, 7, 1}}; int [][] result = {{0, 0, 0}, {0, 0, 0}};
		 * 
		 * for (int i=0;i<mat1.length;i++){ // row number of times for (int
		 * j=0;j<mat1[i].length;j++) { // column number of time
		 * System.out.format(" Setting value for i=%d and j=%d\n", i, j); result[i][j] =
		 * mat1[i][j] + mat2[i][j]; } }
		 * 
		 * // Printing the elements of a 2-D Array for (int i=0;i<mat1.length;i++){ //
		 * row number of times for (int j=0;j<mat1[i].length;j++) { // column number of
		 * time System.out.print(result[i][j] + " "); result[i][j] = mat1[i][j] +
		 * mat2[i][j]; } System.out.println(""); // Prints a new line }
		 * 
		 * 
		 * 
		 * 
		 * //swap of an array 
		 * 
		 *  
		 *  Practice Problem 5 int [] arr = {1, 21, 3, 4, 5, 34, 67}; int l =
		 * arr.length; int n = Math.floorDiv(l, 2); int temp;
		 * 
		 * for(int i=0; i<n; i++){ // Swap a[i] and a[l-1-i] // a b temp // |4| |3| ||
		 * temp = arr[i]; arr[i] = arr[l-i-1]; arr[l-i-1] = temp; }
		 * 
		 * for(int element: arr){ System.out.print(element + " "); }
		 * 
		 * // Practice Problem 6 int [] arr = {1, 2100, 3, 455, 5, 34, 67}; int max =
		 * Integer.MIN_VALUE; for(int e: arr){ if(e>max){ max = e; } }
		 * System.out.println("the value of the maximum element in this array is: "+
		 * max);
		 * 
		 * // Practice Problem 6
		 * 
		 *  System.out.println(Integer.MIN_VALUE);
		 * System.out.println(Integer.MAX_VALUE);
		 */

		// Practice Problem 7

		boolean isSorted = true;
		int[] arr = { 1, 26, 3, 4, 5, 34, 67 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("The Array is sorted");
		} else {
			System.out.println("The Array is not sorted");

		}

	}

}
