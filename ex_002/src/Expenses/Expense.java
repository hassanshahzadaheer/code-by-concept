package Expenses;

public class Expense {

        private double amount;
        private String category;
        private String description;

    Expense(double amount, String category, String description) {
            this.amount = amount;
            this.category = category;
            this.description = description;
        }

        public double getAmount() {
            return this.amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getCategory() {
            return this.category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void displayExpenses(){
            System.out.println(description + " - $" + amount + " (" + category + ")");
        }

    }
