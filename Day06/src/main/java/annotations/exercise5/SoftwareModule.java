package annotations.exercise5;

class SoftwareModule {

    @BugReport(description = "NullPointerException occurs when input is null.")
    @BugReport(description = "Performance issue when handling large data.")
    public void processData() {
        System.out.println("Processing data...");
    }
}