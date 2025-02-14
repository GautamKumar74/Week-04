package aidrivenresumescreeningsystem;

import java.util.List;

class AIScreeningSystem {
    // Method to process multiple resumes using wildcards
    public static void processResumes(List<? extends JobRole> candidates) {
        System.out.println("AI Screening System Processing Multiple Resumes...");
        for (JobRole candidate : candidates) {
            System.out.println("Screening: " + candidate.getCandidateName());
            System.out.println("Experience: " + candidate.getExperience() + " years");
            System.out.println(candidate.getRequiredSkills());
            System.out.println("-----------------------------------");
        }
    }
}