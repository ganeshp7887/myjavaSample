package SampleProject;

public class SortingAlgorithms {
	
	private SortingAlgorithms() {}

	public static void BubbleSort(int[] list) {
		for(int i=0; i < list.length-1; i++) {
			for(int j = 0; j < (list.length - 1)-i; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
			//PrintArray(list);
			//System.out.println("\n");
		}
		
	}
	
	public static void PrintArray(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println(" ");
	}
	
	public static void main(String args[]) {
		int a[] = {4,6,1,7,3,0,9,-4};
		//PrintArray(a);	
		BubbleSort(a);
		PrintArray(a);
	}
}
