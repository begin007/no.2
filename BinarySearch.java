package jxz;

public class BinarySearch {

		public static int linearSearch(int[] list,int key) 
		{
			for(int i=0;i<list.length;i++)
			{
			 if(key==list[i])
				 return 1;
			}
			return -1;
		}
		
}


