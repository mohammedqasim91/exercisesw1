//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //IData Types
        // Assigns the value 20 to the variable value_int of type int
        int value_int = 20;

        // Assigns the value "Java" to value_string
        String value_string = "Java";

        // Assigns the value 23.63 to the value type double value_double1
        double value_double1 = 23.63;

        // Print All the variables have declared.
        System.out.println(value_int);
        System.out.println(value_string);
        System.out.println(value_double1);


        //Operators
        // Assigns the value 5.44444 to the value type double value_double2
        double value_double2 = 5.44444;

        //check if the number provided is a double or not and print output.
        if ( (value_double2 % 1) == 0 ) {
            System.out.println("It's not a double number");
        } else {
            System.out.println("It's a double number");


        //Conditional
        //create 3 integer variables num1, num2 and num3 with different values
        //check which number is the smallest and assign it to an empty variable called smallest and then print it.
            int num1 = 2;
            int num2 = 10;
            int num3 = 56;
            int smallest = 0;


            if (num1 < num2) {
                if (num1 < num3) {
                    smallest = num1;
                } else {
                    smallest = num3;
                }
            } else {
                if (num2 < num3) {
                    smallest = num2;
                } else {
                    smallest = num3;
                }
            }

            System.out.println(smallest);
        }
    }

    //String Methods
    //create a method named productFormatter
    private static String productFormatter(String productName , String details) {
        return productName.concat(details).toUpperCase().trim().replace(" ", "_");
    }
}