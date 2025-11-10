package array;

public class Main {
    public static void main (String[] args) {

//      declaration and creation
        double[] expenses = new double[5];
        expenses[0] = 50.0;
        expenses[1] = 340.0;
        expenses[2] = 195.3;
        expenses[3] = 19.9;
        expenses[4] = 200.0;

        for (int i = 0;  i < expenses.length; i ++) {
            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
        }

        double total = 0;

        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
        }

        System.out.println("Total: $" + total);

        double max = expenses[0];

        // why we start loop form 1?
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Highest: $"+ max);

        double min = expenses[0];

        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
        }

        System.out.println("Lowest: $ "+ min);

        int count = 0;

        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > 100) {
                count ++;
            }
        }
        System.out.println("above $100: " +count);


        double average = total / expenses.length;
        System.out.println("Average: $" +average);

    }
}
