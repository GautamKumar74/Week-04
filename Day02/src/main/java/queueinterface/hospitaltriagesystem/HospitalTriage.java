package queueinterface.hospitaltriagesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return Integer.compare(o2.severity, o1.severity);
            }
        });

        pq.offer(new Patient("John", 3));
        pq.offer(new Patient("Alice", 5));
        pq.offer(new Patient("Bob", 2));

        System.out.println("Order of treatment: ");
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
