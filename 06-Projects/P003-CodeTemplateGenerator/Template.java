package P003_CodeTemplateGenerator;

public class Template {
    String id;
    String name;
    String description;
    String language;
    String code;

    public Template(String id, String name, String description, String language, String code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.language = language;
        this.code = code;
    }

    @Override
    public String toString() {
        return "\n=== Template: " + name + " ===\n" +
                "ID: " + id + "\n" +
                "Language: " + language + "\n" +
                "Description: " + description + "\n" +
                "Code:\n" + code + "\n";
    }
}
