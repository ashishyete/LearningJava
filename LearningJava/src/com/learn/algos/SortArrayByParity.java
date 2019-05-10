package com.learn.algos;

public class SortArrayByParity {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		for(Integer i : sortAlgo(arr)) {
			System.out.print(i+" ");
			
		}
	}

	public static int[] sortAlgo(int arr[]) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
			 int temp = arr[index];
			 System.out.println("temp : "+temp);
			 arr[index++]= arr[i];
			 System.out.println("arr[index++] : "+arr[index++]);
			 arr[i]=temp;
			 System.out.println("arr[i] : "+arr[i]);
			}
		}
		return arr;
	}

	
}