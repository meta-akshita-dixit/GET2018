
/
/**
 * This class has a method that checks if the given array is unsorted,ascending or in descending order.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */
package assignment5;

public class AscOrDesc {
		public int ascOrDesc(int array[])
		{
			int position = 0;                          //it points the current index. 
			int type;                                  //it is used to tell that if the array is unsorted or is in asc or desc  order.(0=unsorted,1=asc,2=desc)
			if(array[position] <= array[position + 1])
			{
				type=1;
				for(position=1; position < array.length - 1; position++)
				{
					if(array[position] > array[position + 1]){
						type=0;
						return type;
					}
						
				}
				return type;
			}
			else 
			{
				type=2;
				for(position = 1; position < array.length - 1; position++)
				{
					if(array[position] <= array[position +1 ]){
						type=0;
						return type;
					}
										}
				return type;
			}
		}
	}


