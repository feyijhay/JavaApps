public class DataValidator {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll(" ","");
        String regex = "(234|\\+234|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(regex);
    }
}
