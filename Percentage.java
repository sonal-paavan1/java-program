
public class Percentage
{
    public static void mark(int a, int b,int c){

        double total,per;
       System.out.println("English = "+a);
       System.out.println("Maths = " +b);
       System.out.println("Science = " +c);

       total = a+b+c;
       per = (total /300)*100; // total marks

        System.out.println("Total marks = " +total);
        System.out.println("Percentage = " +per  );

    }

    public static void main(String[] args)
    {
        mark(78,66,80);
    }





}

