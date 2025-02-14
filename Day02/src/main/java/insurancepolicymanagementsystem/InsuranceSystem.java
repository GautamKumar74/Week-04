package insurancepolicymanagementsystem;

import java.util.*;
public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new InsurancePolicy("P123", "Alice", new Date(System.currentTimeMillis() + 2592000000L), "Health", 2000));
        manager.addPolicy(new InsurancePolicy("P456", "Bob", new Date(System.currentTimeMillis() + 864000000L), "Auto", 3000));
        manager.addPolicy(new InsurancePolicy("P789", "Charlie", new Date(System.currentTimeMillis() + 604800000L), "Home", 2500));
        manager.addPolicy(new InsurancePolicy("P456", "Bob", new Date(System.currentTimeMillis() + 864000000L), "Auto", 3000));

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Auto");
        manager.displayDuplicatePolicies();
        manager.performanceComparison();
    }
}