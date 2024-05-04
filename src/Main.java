//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //IData Types
        int value_int = 20; // int type
        String value_string = "Java"; // String type
        double value_double1 = 23.63; // double type
        System.out.println(value_int);
        System.out.println(value_string);
        System.out.println(value_double1);

        //Operators
        double value_double2 = 5.44444; // double type
        // Check if the number is an integer or double and print the result
        if ((value_double2 % 1) == 0) {
            System.out.println("It's not a double number");
        } else {
            System.out.println("It's a double number");
        }

        // Conditional
        int num1 = 2, num2 = 10, num3 = 56, smallest;
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        System.out.println(smallest);

        // Call productFormatter
        String formattedProduct = productFormatter("Coffee Maker ", "20230915");
        System.out.println(formattedProduct);
    }

    // String Methods
    private static String productFormatter(String productName, String date) {
        String formattedName = productName.trim().toUpperCase().replace(" ", "_");
        return formattedName + "_" + date;
    }
}