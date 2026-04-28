class Nested
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 5;
        int c = 7;

        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);

        int g = a;

        if (a > b)
        {
            if (a > c)
                g = a;
            else
                g = c;
        }
        else
        {
            if (b > c)
                g = b;
            else
                g = c;
        }

        System.out.println(g + " is greatest");
    }
}