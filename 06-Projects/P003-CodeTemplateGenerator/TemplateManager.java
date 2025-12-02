package P003_CodeTemplateGenerator;

import java.util.HashMap;
import java.util.Scanner;

public class TemplateManager {

    HashMap<String, Template> templates = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    private int templateCounter = 0;

    private String generateId(){
        return "TMPL_" + (++templateCounter);

    }

    void showMenu() {
        System.out.println("\n======== CODE TEMPLATE GENERATOR ========");
        System.out.println("1. Add Template");
        System.out.println("2. View All Templates");
        System.out.println("3. Search Template");
        System.out.println("4. Exit");
        System.out.println("=========================================");
        System.out.print("Enter your choice: ");
    }

    void addTemplate() {

        System.out.print("Enter Name:");
        String name =  sc.nextLine();

        System.out.print("Enter Description: ");
        String description = sc.nextLine();

        System.out.print("Enter Language: ");
        String language = sc.nextLine();

        System.out.print("Enter Code Snippt: ");
        String code = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("please enter name");

        } else if (description.isEmpty()) {
            System.out.println("please enter description");

        } else if (language.isEmpty()) {
            System.out.println("please enter language");
        } else if (code.isEmpty()) {
            System.out.println("please enter code ");
        } else {
            templates.put(name, new Template(generateId(),name,description,language,code));
        }
    }

    void viewAllTemplates() {

        for (String template : templates.keySet()) {
            Template templateName = templates.get(template);
            System.out.println(templateName);
        }
    }

    void searchTemplate() {

        System.out.print("Template name please? ");
        String templateName = sc.nextLine();

        if (!templateName.isEmpty() && templates.containsKey(templateName)) {
            System.out.println(templates.get(templateName));
        } else {
            System.out.println("Template not found!");
        }

    }

    void saveToFile() {
        // TODO: Implement this
    }

    void loadFromFile() {
        // TODO: Implement this
    }

    void start() {
        loadFromFile(); // Load existing templates on startup

        while (true) {
            showMenu();
            String choice = sc.nextLine().trim();

            try {
                switch(choice) {
                    case "1":
                        addTemplate();
                        break;
                    case "2":
                        viewAllTemplates();
                        break;
                    case "3":
                        searchTemplate();
                        break;
                    case "4":
                        saveToFile(); // Save before exiting
                        System.out.println("Templates saved. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
