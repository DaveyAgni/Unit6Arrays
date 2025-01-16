//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
    public static int go(int[] ray)
    {
        int odd = -1;
        int even = -1;

        for (int i = 0; i < ray.length; i++)
        {
            if (ray[i] % 2 == 1)
            {
                odd = i;
                break;
            }
        }

        if (odd == -1)
        {
            return -1;
        }

        for (int i = odd + 1; i < ray.length; i++)
        {
            if (ray[i] % 2 == 0)
            {
                even = i;
                break;
            }
        }

        if (even == -1)
        {
            return -1;
        }

        return even - odd;
    }
}
