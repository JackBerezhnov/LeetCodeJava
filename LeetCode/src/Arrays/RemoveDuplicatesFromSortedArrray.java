package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//Problem #26 Remove Duplicates from Sorted Array


public class RemoveDuplicatesFromSortedArrray {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 9, 10};
		
		int j = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != array[j]) {
				j += 1;
				array[j] = array[i];
			}
		}
		//It should return the length for a new array
		j += 1;
		System.out.println(j);
		System.out.println(Arrays.toString(array));
	}
}
