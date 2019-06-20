public class Main
{
    public static void main(String[] args)
    {
        int x;
        int i;
        boolean[] ansu = new boolean[100];

        for (i = 0; i < ansu.length; i++)
        {
            for (x = i; x < ansu.length; x += (i+1))
            {
                ansu[x] = !ansu[x];
            }
        }

        for (i=0;i<ansu.length; i++)
        {
            if (ansu[i])
            {
                System.out.println("Locker " +(i+1)+ " is open.");
            }
        }
    }
}