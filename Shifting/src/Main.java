public class Main {
	public static void main(String[]args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4};
		int[] temp1;
		int[] temp2;
		System.out.println("LEFT SHIFT SAMPLE");
		temp1 = shiftLeft(array1);
		printArray(temp1);
		System.out.println("\nRIGHT SHIFT SAMPLE");
		temp2 = shiftRight(array2);
		printArray(temp2);
	}
	
	public static int[] shiftLeft(int[] array) {
		int temp = array[0];
		for(int i=0; i<array.length; i++) {
			if(i+1!=array.length) {
				array[i] = array[i+1];
			}
		}
		array[array.length-1] = temp;
		return array;
	}
	
	public static int[] shiftRight(int[] array) {
		int temp = array[array.length-1];
		for(int i=array.length-1; i>=0; i--) {
			if(i+1!=array.length) {
				array[i+1] = array[i];
			}
		}
		array[0] = temp;
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}