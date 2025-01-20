//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
        int small = ray[0];

        for(int i = 0; i <= ray.length - 1; i++)
        {
            if(ray[i] <= small)
            {
                small = ray[i];
            }
            else{
                small += 0;
            }
        }
		return small;
	}
}
