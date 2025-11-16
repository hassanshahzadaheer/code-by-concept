package HashMap;

import javax.sound.midi.Soundbank;
import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String > phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n=== PHONE BOOK ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Number");
            System.out.println("4. Delete Contact");
            System.out.println("5. View All");
            System.out.println("6. Exit");

            System.out.print("Select: ");
            String choice = sc.nextLine();

            if (choice.equals("1"))
            {
                try {
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    if(name.isEmpty() || phone.isEmpty()) {
                        System.out.println("name or phone number is missing!");
                    } else {
                        phoneBook.put(name,phone);
                        System.out.println("Contact added");
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            } else if (choice.equals("2")) {
                try {
                    System.out.print("Search ");
                    String name = sc.nextLine();

                    if(!name.isEmpty() && phoneBook.containsKey(name)) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not Found!");
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (choice.equals("3")){

                try {

                    System.out.print("Enter the name you want to update the number? ");
                    String name = sc.nextLine();


                    if (!name.isEmpty() && !phoneBook.containsKey(name)) {
                        System.out.println("The number you want to update does not exist.");
                    } else {
                        System.out.print("Phone: ");
                        String phone = sc.nextLine();

                        phoneBook.put(name,phone);
                        System.out.print(phone + " update successfully!");
                    }



                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        }



//
//
//
////        Map<String,String> phoneBook = new HashMap<>();
////
//////        add contact
////        phoneBook.put("Ali", "0345-1112233");
////        phoneBook.put("Ameer", "0300-4455667");
////        phoneBook.put("Sara", "0321-7788990");
////        phoneBook.put("Hassan", "0333-9011223");
////        phoneBook.put("Zara", "0312-5566778");
////        phoneBook.put("Omar", "0347-2211445");
////        phoneBook.put("Fatima", "0301-6677889");
////        phoneBook.put("Bilal", "0324-8899001");
////        phoneBook.put("Noor", "0336-5544332");
////        phoneBook.put("Hamza", "0315-7700112");
////
////
//////        view all phone numbers
////        for (String phone : phoneBook.keySet()) {
////            System.out.println(phone + " => " + phoneBook.get(phone));
////        }
////
//////        search for a number
////        if (phoneBook.containsKey("Ali")) {
////            System.out.println("Ali # is " +  phoneBook.get("Ali"));
////        }
////
//////        update a phone number
////        if (phoneBook.containsKey("Zara")) {
////            String update = phoneBook.put("Zara","0319-9900114");
////            System.out.println(update);
////
////        }
////
//////        how keyset is working?
////        Set<String> keysInPhoneBook = phoneBook.keySet();
////        System.out.println(keysInPhoneBook);
////
////
//////        show me phone numbers against each member
////
////        for(String phone : keysInPhoneBook)
////        {
////            String phoneNumber = phoneBook.get(phone);
////
////            System.out.println(phone + " : " + phoneNumber);
////        }
//
//
////        now grouping
//
//        HashMap<String , ArrayList<String>> friends = new HashMap<>();
//
//        ArrayList<String> schoolFriends = new ArrayList<>();
//        schoolFriends.add("Majid");
//        schoolFriends.add("Sajid");
//        schoolFriends.add("Wajid");
//        schoolFriends.add("Kashif");
//
//        ArrayList<String> collegeFriends = new ArrayList<>();
//        collegeFriends.add("Kamil");
//        collegeFriends.add("Kamran");
//
//        friends.put("School",schoolFriends);
//        friends.put("college",collegeFriends);
//
//        for (String allFriends : friends.keySet()) {
////            System.out.println(allFriends + " : " + friends.get(allFriends));
//
//            ArrayList<String> category = friends.get(allFriends);
//            System.out.println("=====" +  allFriends + "=====");
//
//            for(String name : category) {
//
//                System.out.println(name);
//
//            }
//
//        }
    }
}
