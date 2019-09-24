package jxz;

public class TestPassArray {
	public static void main(String[] args) {
		int[] a={1,2};
		System.out.println("Before invoking swap");
		System.out.println("array is {"+a[0]+","+a[1]+"}");
		swap(a[0],a[1]);
		System.out.println("after invoking swap");
		System.out.println("array is {"+a[0]+","+a[1]+"}");
		
		System.out.println("Before invoking swapFirsttwoInArray");
		System.out.println("array is {"+a[0]+","+a[1]+"}");
		swapFirsttwoInArray(a);
		System.out.println("after invoking swapFirsttwoInArray");
		System.out.println("array is {"+a[0]+","+a[1]+"}");
	}
	public static void swap(int n1,int n2)
	{
		int temp=n1;
		n1=n2;
		n2=temp;
	}
	public static void  swapFirsttwoInArray(int[] array)
	{
		int temp=array[0];
		array[0]=array[1];
		array[1]=temp;
	}
}
