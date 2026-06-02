/**
 * Writing a program to find index of an Element in array
 */
public class Practicle19 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int ele = 30;
		System.out.println("Element Found at the index : " + FindElement(arr,ele));
	}

	//Find the Index of an Element
	public static  int FindElement(int[] arr,int ele){
		int index = 0;
		for(int i = 0;i < arr.length;i++){
			if (arr[i] == ele){
				index = i;
				break;
			}
		}
		return index;
	}

}