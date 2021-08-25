import java.util.Locale;
import java.util.Scanner;

public class Program_List_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program number you would like to see: ");
        int pronum = sc.nextInt();
        sc.nextLine();  // Read the leftover new line
        switch (pronum) {

            case 1 -> {
//              Program-1
                System.out.println("Program - 1");
                System.out.println("Jan: 1 \nFeb: 2 \nMarch: 3 \nApril: 4 \nMay: 5 \nJune: 6 \nJuly: 7 \nAugust: 8 \nSeptember: 9 \nOctober: 10 \nNovember: 11 \nDecember: 12");
                System.out.println("For which month do you wish to know the number of days?");
                int mon1 = sc.nextInt();

                switch (mon1) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Number of days: 31");
                    case 4, 6, 9, 11 -> System.out.println("Number of days: 30");
                    case 2 -> System.out.println("Number of days: 28");
                    default -> System.out.println("Incorrect format of input");
                }
                sc.close();
            } //End of case 1.

            case 2 -> {
//          Program - 2

                System.out.println("Program - 2");
                System.out.println("Day to be checked: ");
                String mon2 = sc.nextLine();


                switch (mon2.toLowerCase(Locale.ROOT)) {
                    case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It's a Weekday");
                    case "saturday", "sunday" -> System.out.println("It's a Weekend");
                    default -> System.out.println("Incorrect format of input");
                }
                sc.close();
            } //End of case 2.

            case 3 -> {
//              Program - 3
                System.out.print("Weight of package in pounds: ");
                float w = sc.nextFloat();

                if (0 < w && w <= 1) {
                    System.out.println("The cost is $3.5.");
                } else if (1 < w && w <= 3) {
                    System.out.println("The cost is $5.5.");
                } else if (3 < w && w <= 10) {
                    System.out.println("The cost is $8.5.");
                } else if (10 < w && w <= 20) {
                    System.out.println("The cost is $10.5.");
                } else {
                    System.out.println("Incorrect format of input");
                }
                sc.close();
            } //End of case 3.

            case 4 -> {
//                Program - 4
                System.out.println("Enter the details of the triangle.");

                System.out.print("Length of side-1: ");
                float s1 = sc.nextInt();

                System.out.print("Length of side-2: ");
                float s2 = sc.nextInt();

                System.out.print("Length of side-3: ");
                float s3 = sc.nextInt();

                boolean validity = ((s1 + s2) > s3) && ((s3 + s2) > s1) && ((s1 + s3) > s2);

                if (validity) {
                    float perimeter = s1 + s2 + s3;
                    System.out.println("Perimeter is " + perimeter + ".");
                } else {
                    System.out.println("Triangle is not valid.");
                }
                sc.close();
            } //End of case 4.

            case 5 -> {
                System.out.println("Program - 5");
                System.out.println("Enter the numbers to be added. Entering 'zero' will signify the end of the input.");
                int sum = 0;
                int newint;

                while (true) {
                    System.out.print("Enter the integer: ");
                    newint = sc.nextInt();
                    if (newint != 0) {
                        sum += newint;
                    } else {
                        break;
                    }
                }
                System.out.println("Sum of the integers is " + sum + ".");
                sc.close();
            } //End of case 5.

            case 6 -> {
                System.out.println("Program - 6");
                System.out.print("Enter the number for which the table is to be displayed: ");
                int tabnum = sc.nextInt();
                int pro;

                for (int i = 1; i <= 10; i++) {
                    pro = tabnum * i;
                    System.out.println(tabnum + " x " + i + " = " + pro);
                }
                sc.close();
            } //End of case 6.

            case 7 -> {
                System.out.println("Program - 7");
                System.out.println("Range of ASCII integers to be displayed: ");
                int i7 = sc.nextInt();
                System.out.println("to");
                int n7 = sc.nextInt();

                for (int i = i7; i <= n7; i++) {
                    char c7 = (char) i;
                    System.out.println("ASCII: " + i + "; Symbol: " + c7);
                }
                sc.close();
            } //End of case 7.

            case 8 -> {
                System.out.println("Program - 8");
                System.out.print("Enter the number of rows to be printed: ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    String star8 = "*";
                    System.out.println(star8.repeat(i));
                }
                sc.close();
            } //End of case 8.

            case 9 -> {
                System.out.println("Program - 9");
                System.out.print("Number of rows to be printed: ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println("\n");
                }

                sc.close();
            } //End of case 9.

            case 10 -> {
                System.out.println("Program - 10");
                System.out.print("Number of rows to be printed: ");
                int n = sc.nextInt();
                boolean validity;

                validity = n <= 7;

                char ch1 = 'A';
                if (validity) {
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(ch1++ + " ");
                        }
                        System.out.println("\n");
                    }
                } else {
                    System.out.println("Enter valid input.");
                }
                sc.close();
            }  // End of case 10.

        } // End of primary switch case.
    }
}
