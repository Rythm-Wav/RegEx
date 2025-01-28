//first pattern
public class Patterns {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]+");
    }

    //Second pattern
    public static boolean validateZip(String zip) {

        return zip.matches("[0-9]{5}");
    }

    //Third pattern
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s([A-Z][a-zA-Z]+\\s[a-zA-Z]+(.)+)");

    }

    //Fourth pattern
    public static boolean validateSSN(String social) {

        return social.matches("\\d{3}(-)\\d{2}(-)\\d{4}");
    }

    //Fifth pattern
    public static boolean validatePhone(String phone) {

        return phone.matches("(1)(-)?\\d{3}(-)\\d{3}(-)\\d{4}");
    }

    //Sixth pattern
    public static boolean validateDate(String date) {

        return date.matches("[1-9]{2}(/)[1-9]{2}(/)[0-9]{4}");
    }

    //Seventh pattern
    public static boolean validateAge(String age) {

        return age.matches("\\d{2}");
    }

    //Eighth pattern
    public static boolean validateTime(String time) {

        return time.matches("\\d{2}(:)\\d{2}");
    }

    //Ninth pattern
    public static boolean validateEmail(String email) {

        return email.matches("\\S+(gmail|hotmail|yahoo|outlook|icloud).com");
    }

    //Tenth pattern
    public static boolean validateExperience(String experience) {

        return experience.matches("([1-9][0-9]?|0) years of experience");
    }
}