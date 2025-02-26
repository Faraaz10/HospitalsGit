class Doctor {
    private int id;
    private String name;
    private String specialty;
    private int experience;

    // Constructor
    public Doctor(int id, String name, String specialty, int experience) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.experience = experience;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getExperience() {
        return experience;
    }

    // Method to display doctor details
    public void displayDoctorInfo() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Experience: " + experience + " years");
    }

    public static void main(String[] args) {
        // Example usage
        Doctor doc1 = new Doctor(101, "Dr. John Smith", "Cardiologist", 15);
        doc1.displayDoctorInfo();
    }
}
