import java.util.Random;

public class MathWork {

   static Random rand = new Random();
 static int [] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    static void divisible(int n)
    {
        for(int i=0; i<=100;i++){

            if(i % n == 0){

                System.out.println(i);
            }
        }

    }

    static void getRandom(){

        int x = rand.nextInt(arr.length);

        System.out.println(arr[x]);

    }


}
