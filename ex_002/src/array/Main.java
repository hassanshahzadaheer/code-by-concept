package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
//
////      declaration and creation
//        double[] expenses = new double[5];
//        expenses[0] = 50.0;
//        expenses[1] = 340.0;
//        expenses[2] = 195.3;
//        expenses[3] = 19.9;
//        expenses[4] = 200.0;
//
//        for (int i = 0;  i < expenses.length; i ++) {
//            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
//        }
//
//        double total = 0;
//
//        for (int i = 0; i < expenses.length; i++) {
//            total += expenses[i];
//        }
//
//        System.out.println("Total: $" + total);
//
//        double max = expenses[0];
//
//        // why we start loop form 1?
//        for (int i = 1; i < expenses.length; i++) {
//            if (expenses[i] > max) {
//                max = expenses[i];
//            }
//        }
//        System.out.println("Highest: $"+ max);
//
//        double min = expenses[0];
//
//        for (int i = 1; i < expenses.length; i++) {
//            if (expenses[i] < min) {
//                min = expenses[i];
//            }
//        }
//
//        System.out.println("Lowest: $ "+ min);
//
//        int count = 0;
//
//        for (int i = 0; i < expenses.length; i++) {
//            if (expenses[i] > 100) {
//                count ++;
//            }
//        }
//        System.out.println("above $100: " +count);
//
//
//        double average = total / expenses.length;
//        System.out.println("Average: $" +average);
//
//        int[] nums =  {5, 5, 5, 5};
//
//        int highest = Integer.MIN_VALUE;
//        int secondHighest = Integer.MIN_VALUE;;
//
//        for (int i = 1; i < nums.length; i++) {
//
//            if (nums[i] > highest ) {
//                secondHighest = highest;
//                highest = nums[i];
//            } else if (nums[i] > secondHighest && nums[i] != highest) {
//                secondHighest = nums[i];
//            }
//
//        }
//
//        System.out.println("Highest: "+ highest);
//        System.out.println("2nd Highest: "+ secondHighest);
//
//
//
//
//        String[] categories = {"Food", "Travel", "Shopping", "Food", "Bills"};
//        double[] amounts = {50.0, 150.0, 75.0, 120.0, 200.0};
//        int expTotal = 0;
//        int catCount = 0;
//
//        for (int i = 0; i < categories.length; i++) {
//            if(categories[i] == "Food") {
//                expTotal += amounts[i];
//                catCount ++;
//            }
//        }
//
//        System.out.println("Food: " + catCount + " times " +  " total $" + expTotal);

//
//        int[] match = {50, 75, 120, 30, 200, 95, 150};
//        int position = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int userInput = sc.nextInt();
//        for (int i = 0; i < match.length; i ++) {
//
//            if (userInput == match[i]) {
//                position = i;
//            }
//
//        }


//        System.out.println(userInput + " found at " + position + "position");


//        // Bug 1
//        String name = "Ali";
//        if (name.equals("Ali")) {  // What's wrong?
//            System.out.println("Found!");
//        }
//
//// Bug 2
//        int[] nums = {10, 20, 30};
//        int position = 0;
//        boolean found = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 20) {
//                position = i;
//                found = true;
//            }
//        }
//        if(found) {
//            System.out.println("Found at: " + position);
//        } else {
//            System.out.println("Not Found");
//        }
//

        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            if (!s.add(n)) System.out.print(n + " ");
        }


    }

}
