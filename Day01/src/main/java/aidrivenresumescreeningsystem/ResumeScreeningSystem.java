package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Individual Resume Processing
        Resume<SoftwareEngineer> seResume = Resume.processResume(new SoftwareEngineer("Alice", 5));
        seResume.displayResume();

        Resume<DataScientist> dsResume = Resume.processResume(new DataScientist("Bob", 3));
        dsResume.displayResume();

        Resume<ProductManager> pmResume = Resume.processResume(new ProductManager("Charlie", 7));
        pmResume.displayResume();

        // List of Candidates for Batch Processing
        List<JobRole> candidateList = new ArrayList<>();
        candidateList.add(new SoftwareEngineer("David", 4));
        candidateList.add(new DataScientist("Emma", 6));
        candidateList.add(new ProductManager("Frank", 2));

        // AI-driven resume screening for multiple candidates
        AIScreeningSystem.processResumes(candidateList);
    }
}