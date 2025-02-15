package regex.validatelicenseplatenumber;

public class LicensePlateValidator {

    public static boolean isValidLicencePlate(String plate){
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    public static void main(String[] args) {

        System.out.println(isValidLicencePlate("AB1234"));
        System.out.println(isValidLicencePlate("A12345"));
        System.out.println(isValidLicencePlate("ab2345"));
        System.out.println(isValidLicencePlate("XY9999"));
    }
}
