package aidrivenresumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String getRequiredSkills() {
        return "Skills: Machine Learning, Python, Statistics, Deep Learning";
    }
}