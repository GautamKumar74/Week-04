package aidrivenresumescreeningsystem;

class Resume<T extends JobRole> {
    private T candidateJobRole;

    // Constructor
    public Resume(T candidateJobRole) {
        this.candidateJobRole = candidateJobRole;
    }

    // Display Resume Details
    public void displayResume() {
        System.out.println("Candidate Name: " + candidateJobRole.getCandidateName());
        System.out.println("Experience: " + candidateJobRole.getExperience() + " years");
        System.out.println(candidateJobRole.getRequiredSkills());
        System.out.println("-----------------------------------");
    }

    // Generic method to process a resume dynamically
    public static <T extends JobRole> Resume<T> processResume(T jobRole) {
        System.out.println("Processing resume...");
        return new Resume<>(jobRole);
    }
}
