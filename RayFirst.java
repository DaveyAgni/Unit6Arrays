//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		int first = ray[0];

		for(int i = 1; i < ray.length - 1; i++)
		{
            if(ray[i] == first)
            {
                return true;
            }
            
		}
		return false;
	}
}
