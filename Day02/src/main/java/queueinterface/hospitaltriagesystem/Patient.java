package queueinterface.hospitaltriagesystem;

public class Patient {

    String name;
    int severity;

    public Patient(String name, int severity){
        this.name= name;
        this.severity= severity;
    }

    public String toString(){
        return name + " (Severity: " + severity + ")";
    }
}
