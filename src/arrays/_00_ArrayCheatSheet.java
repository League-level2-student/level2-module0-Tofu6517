package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Sarah", "Joe","Ali", "Jose","Madison"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="fyeweqfwe";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<names.length;i++) {
		     System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] moreAges = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<moreAges.length;i++) {
			moreAges[i]=i;
			System.out.println(moreAges[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(moreAges[0]);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		System.out.println(moreAges[49]);
	}
}
