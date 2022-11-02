public class Booleans {
    public static void main(String[] args) {
        //our comparison operators are
        //greater than >
        //less than <
        //equal to ==
        //not equal to !=
        //greater than or equal to >=
        //less than or equal to <=

        int month = 11;
        int december = 12;
        System.out.println(month < 11);
        System.out.println(month <= 11);
        System.out.println(month == december);
        System.out.println(month != december);

        //you don't have to use an if statement yet, you can just print the boolean value

        int age1 = 12;
        System.out.println("This person is an adult over 18: " + (age1 >= 18)); //complete this statement to print true or false
        System.out.println("This person can drive a car legally: " + (age1 >= 15)); //complete this statement to print true or false

        int age2 = 27;
        System.out.println("This person is an adult over 18: " + (age2 >= 18)); //complete this statement to print true or false
        System.out.println("This person can drive a car legally: " + (age2 >= 15)); //complete this statement to print true or false

    }
}
