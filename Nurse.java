public class Nurse {
    private String name;
    private int id;
    private String department;

    // Constructor
    public Nurse(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to display nurse details
    public void displayInfo() {
        System.out.println("Nurse ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
