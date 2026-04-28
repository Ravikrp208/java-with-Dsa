class Nested_5Var
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 25;
        int c = 15;
        int d = 40;
        int e = 30;
        int g;

        if (a > b)
        {
            if (a > c)
            {
                if (a > d)
                {
                    if (a > e)
                        g = a;
                    else
                        g = e;
                }
                else
                {
                    if (d > e)
                        g = d;
                    else
                        g = e;
                }
            }
            else
            {
                if (c > d)
                {
                    if (c > e)
                        g = c;
                    else
                        g = e;
                }
                else
                {
                    if (d > e)
                        g = d;
                    else
                        g = e;
                }
            }
        }
        else
        {
            if (b > c)
            {
                if (b > d)
                {
                    if (b > e)
                        g = b;
                    else
                        g = e;
                }
                else
                {
                    if (d > e)
                        g = d;
                    else
                        g = e;
                }
            }
            else
            {
                if (c > d)
                {
                    if (c > e)
                        g = c;
                    else
                        g = e;
                }
                else
                {
                    if (d > e)
                        g = d;
                    else
                        g = e;
                }
            }
        }

        System.out.println("Greatest number = " + g);
    }
}