package insurancepolicymanagementsystem;

import java.util.*;

class PolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Policies:");
        for (InsurancePolicy policy : hashSet) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring Within 30 Days:");
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date futureDate = cal.getTime();

        for (InsurancePolicy policy : treeSet) {
            if (policy.getExpiryDate().after(now) && policy.getExpiryDate().before(futureDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        for (InsurancePolicy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    public void displayDuplicatePolicies() {
        System.out.println("\nDuplicate Policies:");
        Set<String> seen = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();

        for (InsurancePolicy policy : hashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }

        for (InsurancePolicy policy : duplicates) {
            System.out.println(policy);
        }
    }

    public void performanceComparison() {
        int size = 10000;
        List<InsurancePolicy> testPolicies = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            testPolicies.add(new InsurancePolicy("P" + i, "Holder " + i, new Date(), "Auto", 5000));
        }

        long start, end;

        System.out.println("\nPerformance Comparison:");

        start = System.nanoTime();
        for (InsurancePolicy policy : testPolicies) hashSet.add(policy);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (InsurancePolicy policy : testPolicies) linkedHashSet.add(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (InsurancePolicy policy : testPolicies) treeSet.add(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
