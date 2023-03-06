import java.util.Arrays;

public class IPv4Validation {
    public boolean validateIPv4(String ip) {
        String[] ipFields = ip.split("\\.");
        if(ipFields.length != 4)
            return false;
        if(ipFields[3].equals("0"))
            return false;
        if(ipFields[3].equals("255"))
            return false;
        if(Arrays.stream(ipFields).anyMatch(field -> field.matches(".*([a-zA-Z]).*")))
            return false;
        if(Arrays.stream(ipFields).anyMatch(field -> Integer.parseInt(field) > 255))
            return false;
        return true;
    }

}
