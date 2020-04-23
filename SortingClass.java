package noote;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.naming.InitialContext;

public class SortingClass {

	public int[] bubbleSort(int[] array) {
		int len = array.length;
		while (len > 0) {
			for (int i = 0; i < len - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
			len--;
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
		}

		return array;
	}

	public int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			for (int k = 0; k < i; k++) {
				if (array[i] < array[k]) {
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}

		return array;
	}

	public int[] bucketSort(int[] array) {

		int len = array.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int buckets = (int) Math.floor(Math.sqrt(len));
		ArrayList<Integer>[] cras = new ArrayList[buckets];
		for (int i : array) {
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		for (int i : array) {
			int count = (int) Math.ceil(i * buckets / max);
			cras[count].add(i);
		}

		for (ArrayList<Integer> cr : cras) {
			Collections.sort(cr);
		}
		int index = 0;
		for (ArrayList<Integer> cr : cras) {
			for (int val : cr) {
				array[index] = val;
				index++;
			}
		}

		return array;
	}

	public int[] merge(int[] array) {
		return mergeSort(array, 0, array.length);
	}

	public int[] mergeSort(int[] array, int start, int end) {
		int mid = (start + end) / 2;
		if (end > start) {
			mergeSort(array, start, mid);
			System.out.println(array[start] + " " + array[mid]);
			mergeSort(array, mid + 1, end);
			System.out.println(array[mid] + " " + array[end - 1]);
			merging(array, start, mid, end);
		}
		return array;
	}

	int[] merging(int[] array, int start, int mid, int end) {
		int[] array2 = new int[mid - start + 2];
		int[] arrRight = new int[end - mid + 1];
		int a = 0, b = 0;
		for (int i = 0; i < mid - start; i++) {
			array2[i] = array[i + 1];
		}
		for (int i = 0; i < end - mid - 1; i++) {
			arrRight[i] = array[mid + 1 + i];
		}
		array2[mid - start + 1] = Integer.MAX_VALUE;
		arrRight[end - mid] = Integer.MAX_VALUE;

		for (int j = start; j <= end; j++) {
			System.out.println(b);
			if (array2[a] < arrRight[b]) {
				array[j] = array2[a];
				a++;
			} else {
				array[j] = arrRight[b];
				b++;
			}
		}

		return array;
	}

	public boolean sorted(int[] array) {
		boolean sorted = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				sorted = true;
			} else {
				sorted = false;
				break;
			}
		}
		return sorted;
	}

	public int[] quick(int[] array) {
		return quicksort(array, 0, array.length- 1);
	}

	
	 public int[] quicksort(int[] array, int start, int end) {
		  if(start<end) {
			  int pivot = givePivot(array,start, end); 
			  quicksort(array,start,pivot-1);
			  quicksort(array,pivot+1,end); 
			  } 
		  return array;
			  }
	  
	 private int givePivot(int[] array, int start, int end) { 
		 int pivot=end; 
		 int newPivot=start-1; 
		 for(int i=start; i<=end;i++) {
			 if(array[i]<=array[pivot]) {
				 newPivot++; 
				 int temp=array[i]; 
				 array[i]= array[newPivot];
				 array[newPivot]=temp;
				 } 
			 }
	  return newPivot; 
	  }


}
