/**
 * 
 */

/**
 * @author nishant7rathore
 * Thanks to http://www.javawithus.com/programs/towers-of-hanoi
 */
public class Recursive 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TowerOfHanoi(3,"A","B","C");
	
	}

	public static void TowerOfHanoi(int n, String start, String auxillary, String end)
	{
		if(n == 1)
		{
			//Just put disk from start to end
			System.out.println(start + " =>>>>>" + end);
		}
		else
		{
			TowerOfHanoi(n-1,start,end,auxillary);
			System.out.println(start + " =>>>>>" + end);
			TowerOfHanoi(n-1,auxillary,start,end);
		}
	}
	
	
}
