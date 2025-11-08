package user_management;

public class UserManager {

    public boolean validateEmail(String email) {
        if(email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }


    // 2. Create a method that validates if password is strong
    //    - Minimum 8 characters
    //    - Must contain at least one uppercase letter
    //    - Must contain at least one number
    //    Return true/false
    //    Method name: isStrongPassword(String password)

    public boolean isStrongPassword(String password) {
        System.out.println(password.length());
        if (password.length() >= 8 && password.matches("^(?=.*[A-Z])(?=.*\\d).+$")) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        UserManager manager = new UserManager();

        System.out.println("=== Testing User Manager ===");

        // Test 1: Email validation
//        System.out.println("Test email validation:");
//        System.out.println(manager.validateEmail("majid@java.com"));
//        System.out.println(manager.validateEmail("invalid.email"));


        // Test 2: Password validation
        System.out.println("\nTest password validation:");
        System.out.println(manager.isStrongPassword("Pass123"));        // should be false (< 8 chars)
//        System.out.println(manager.isStrongPassword("Password123"));    // should be true
    }
}
