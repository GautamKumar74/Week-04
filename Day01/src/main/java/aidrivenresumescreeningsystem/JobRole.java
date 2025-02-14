package aidrivenresumescreeningsystem;

abstract class JobRole {
    private String candidateName;
    private int experience; // Years of experience

    // Constructor
    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    // Getter methods
    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    // Abstract method to get job-specific skills
    public abstract String getRequiredSkills();
}
