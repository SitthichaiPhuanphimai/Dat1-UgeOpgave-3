public class Task4 {

    public static void main(String[] args)
    {
        fibonacci(0,1);

    }

    public static void fibonacci(int a, int b)
    {
        System.out.println(Integer.toString(a));
        if(a > 100)
        {
            return;
        }

        fibonacci(b,a+b);
    }

}
