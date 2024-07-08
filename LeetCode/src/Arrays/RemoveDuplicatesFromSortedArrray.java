package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//Problem #26 Remove Duplicates from Sorted Array


public class RemoveDuplicatesFromSortedArrray {
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6};
		
		int k = 0;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[k]) {
				k += 1;
				nums[k] = nums[i];
			}
		}
		k += 1;
//      It should return k;
		System.out.println(k);
		//I don't know why array prints a little bit weird
		System.out.println(Arrays.toString(nums));
	}
}
