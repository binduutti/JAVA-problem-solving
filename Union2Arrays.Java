/* Find the union of two arrays */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2= {1, 2, 7};
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<nums1.length;i++){
		    hs.add(nums1[i]);
		}
		for(int j=0;j<nums2.length;j++){
		      hs.add(nums2[j]);
		    }
		for(int x:hs){
		    System.out.print(x+" ");
		}
	}
}
