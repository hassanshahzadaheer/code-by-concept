package method_overload;

public class SmartMessageCenter {

    // 1. Text-only message
    void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }
    // 2. Message to one user
    void sendMessage(String message, int userId) {
        System.out.println("Sending message to user " + userId + ": " + message);
    }

    // 3. Message to multiple users
    void sendMessage(String message, int... userIds) {
        System.out.println(userIds.length);
        System.out.println(userIds[0]);
        System.out.println("Sending group message to " + userIds.length + " users: " + message);
    }
    void sendMessage(String message, String mediaUrl) {
        System.out.println("Sending message with media: " + message + " | Media: " + mediaUrl);
    }

    public static void main(String[] args) {
        SmartMessageCenter smc = new SmartMessageCenter();
        smc.sendMessage("Hey, How are you?");
        smc.sendMessage("Hey, what is going on? ",1333);
        smc.sendMessage("Java is best",33,5323,2334,887,44554,8877);
        smc.sendMessage("message","https://aheer.me");


    }
}
