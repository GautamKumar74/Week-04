package regex.validateanipaddress;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static boolean isValidIPV4(String ip){

        String ipv4Regex= "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(ipv4Regex);
        return pattern.matcher(ip).matches();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidIPV4("192.168.1.1"));
        System.out.println(isValidIPV4("255.255.255.255"));
        System.out.println(isValidIPV4("256.100.100.100"));
        System.out.println(isValidIPV4("192.168.1"));
        System.out.println(isValidIPV4("192.168.01.1"));
        System.out.println(isValidIPV4("192.168.1.1.1"));
    }
}
