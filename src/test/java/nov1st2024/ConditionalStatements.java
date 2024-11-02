package nov1st2024;

public class ConditionalStatements {

    public static void main(String[] args) {

        int a = 20;


        if (a == 10)
            System.out.println("Value of a is 10");
        else {
            System.out.println("Value of a is not 10");

            a = 40 - 200 / 10 * 40 / 4;

            if (a % 2 == 0)
                System.out.println(a + " is divisible by 2");
            else
                System.out.println(a + " is not divisible by 2");

            a = 50 - 200 * 10 - 400 - 100;


            if (a % 5 == 0 && a % 2 == 0)
                System.out.println("value of a: " + a + " is divisible by 5 and 2");
            else if (a % 5 == 0 || a % 2 == 0) {

            } else
                System.out.println("value of a:" + a + "is neither divisible by 5 or 2");

            a = 500 - 300 / 2 + 400 - 230 * 42;

            if (a > 300 && a < 600)
                System.out.println(a + " Value of a is falling within the range of 300 and 600");
            else if (a < 300 || a > 600) {
                System.out.println( a + " Value of a beyond the range of 300 and 600");
            } else
                    System.out.println("Value of a is imanginary");

                }

            }

        }










