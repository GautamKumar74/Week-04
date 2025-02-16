package annotations.exercise2;

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // This will show a warning but will still work
        api.newFeature(); // This is the recommended method
    }
}