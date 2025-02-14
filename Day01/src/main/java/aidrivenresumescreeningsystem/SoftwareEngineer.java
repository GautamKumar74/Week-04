package aidrivenresumescreeningsystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String getRequiredSkills() {
        return "Skills: Java, Python, Data Structures, Algorithms, System Design";
    }
}
