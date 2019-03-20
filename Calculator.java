public class Calculator {
    //inside the class -outside the method with static keyword
    static int a = 10;  //static/class variable
    static int b = 5;

    //This method will perform addition
    static void add() {  //no return type no argument user defined method

        System.out.println(a + b);
    }
    static void addition(int c, int d) {
        System.out.println(c + d);
    }
    static void mltiplication(int e,int f){
        System.out.println(e*f);
    }

    static void divide(int g, int h){
	 System.out.println(g/h);
    }
    static void substraction(int i ,int j){
         System.out.println(i-j); 

    }
        //java main method
    public static void main( String [] args){

        add();
        addition( 2,6);
        mltiplication(4,3);
        divide( 20,5);
        substraction(15,5);

    }


}