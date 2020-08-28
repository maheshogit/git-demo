package com.inet.metro;

public class LargestArray {
public static void main(String[] args) {
	int[] arr={4,5,3,7,8,6,9};
	int largest=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>largest){
			largest=arr[i];
		}
	}
	System.out.println(largest);
}
}
