package LogicalPrograms;

import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		//Missing number
		int arr[] = {1,2,4,6,8,12,15};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num :arr) {
		hs.add(num);
		}
		System.out.println(hs);
		int max =arr[arr.length-1]; //largext number
		for(int i=1 ;i<=max ;i++) {
		if(!hs.contains(i)) {
		System.out.print(i+" ");
		}
}
}}