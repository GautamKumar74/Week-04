package aidrivenresumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String getRequiredSkills() {
        return "Skills: Market Research, Agile, Product Roadmap, Communication";
    }
}