public class Num_Divided_By_3_5
{
    //main method
    public static void main(String[] args)
    {
        //sout for number devided by 3
        System.out.println("Number divided by 3:  ");
        //For loop syntex
        for (int i = 1; i < 100; i++)
        {
            if (i % 3 == 0)
                System.out.println(i+",");
        }
        //sout for number devided by 5
        System.out.println("Number divided by 5: ");
        //For loop syntex
       for (int i=1;i<100;i++)
        {
            if(i%5==0)
                System.out.println(i+",");

        }
    }
}