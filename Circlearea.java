import java.util.Scanner; // importing java scanner library

public class Circlearea
{
    public static void main(String[] args){
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);      // defined new scanner variable(s)
        System.out.print("Enter radius of circle:");
        r = s.nextInt();          //Transfer value entered by user into variable r
        area = pi * r * r;
        System.out.println("Area of circle = "+area);

    }

}
