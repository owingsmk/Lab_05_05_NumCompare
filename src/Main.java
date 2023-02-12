public class Main {
    public static void main(String[] args) {

        int num1 = 25; //intital variables
        int num2 = 8;
        System.out.println("Enter your First Number: "); //Output asking user for the number
        //input of first number
        System.out.println("Enter your Second number: "); //Output asking for second number
        //input of second number

        if (num1>num2){
            System.out.println("The larger of " + num1 + " and " + num2 + " is " + num1);
        } else if (num1<num2) {
            System.out.println("The larger of " + num2 + " and " + num1 + " is " + num2);
        } else
            System.out.println("Are equal");
    }
}