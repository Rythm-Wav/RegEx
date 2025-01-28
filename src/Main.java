//Job Application
public class Main {
    public static void main(String[] args) {
//pattern 1

        String name1 = "Asad";
        String name2 = "McCormen";
        String name3 = "J4M35";
        String name4 = "Gracie-Lee";
        String name5 = "J";
        String name6 = "dale";
        String name7 = "Sam Foreman";

        System.out.println("Name Asad is valid? "  +Patterns.validateFirstName(name1));
        System.out.println("Name McCorman is valid? " + Patterns.validateFirstName(name2));
        System.out.println("Name J4M35 is valid? " + Patterns.validateFirstName(name3));
        System.out.println("Name Gracie-Lee is valid? " + Patterns.validateFirstName(name4));
        System.out.println("Name J is valid? " + Patterns.validateFirstName(name5));
        System.out.println("Name dale is valid? " + Patterns.validateFirstName(name6));
        System.out.println("Name Sam Foreman is valid? " + Patterns.validateFirstName(name7));

//pattern 2
        String zip1 = "92555";
        String zip2 = "72:64";
        String zip3 = "9";
        String zip4 = "9646";
        String zip5 = "8239-1";
        String zip6 = "185 34";
        String zip7 = "18534";

        System.out.println("\nZip code 92555 is valid? "  +Patterns.validateZip(zip1));
        System.out.println("Zip code 72:64 is valid? " + Patterns.validateZip(zip2));
        System.out.println("Zip code 9 is valid? " + Patterns.validateZip(zip3));
        System.out.println("Zip code 9646 is valid? " + Patterns.validateZip(zip4));
        System.out.println("Zip code 8239-1 is valid? " + Patterns.validateZip(zip5));
        System.out.println("Zip code 185 34 is valid? " + Patterns.validateZip(zip6));
        System.out.println("Zip code 18534 is valid? " + Patterns.validateZip(zip7));

//pattern 3
        String address1 = "1600 Pennsylvania Avenue";
        String address2 = "13072 Wild Sage Ln";
        String address3 = "Address";
        String address4 = "eleven twenty-two three Dorian St.";
        String address5 = "35 Norman";
        String address6 = "3119223 forest way";
        String address7 = "12964 Hardy Dr.";

        System.out.println("\naddress 1600 Pennsylvania Avenue is valid? "  +Patterns.validateAddress(address1));
        System.out.println("address 13072 Wild Sage Ln is valid? " + Patterns.validateAddress(address2));
        System.out.println("address address is valid? " + Patterns.validateAddress(address3));
        System.out.println("address eleven twenty-two three Dorian St. is valid? " + Patterns.validateAddress(address4));
        System.out.println("address  35 Norman is valid? " + Patterns.validateAddress(address5));
        System.out.println("address 3119223 forest way  is valid? " + Patterns.validateAddress(address6));
        System.out.println("address 12964 Hardy Dr is valid? " + Patterns.validateAddress(address7));

//pattern 4
        String ssn1 = "287-89-8273";
        String ssn2 = "100-9-1234";
        String ssn3 = "9";
        String ssn4 = "192-aso0-vi";
        String ssn5 = "8239-1";
        String ssn6 = "137-45-8239";
        String ssn7 = "18534";

        System.out.println("\nssn 287-89-8273 is valid? " +Patterns.validateSSN(ssn1));
        System.out.println("ssn 100-9-1234 is valid? " + Patterns.validateSSN(ssn2));
        System.out.println("ssn 9 is valid? " +Patterns.validateSSN(ssn3));
        System.out.println("ssn 192-aso0-vi is valid? " + Patterns.validateSSN(ssn4));
        System.out.println("ssn 8239-1 is valid? " + Patterns.validateSSN(ssn5));
        System.out.println("ssn 137-45-8239 is valid? " + Patterns.validateSSN(ssn6));
        System.out.println("ssn 18534 is valid? " + Patterns.validateSSN(ssn7));
//pattern 5
        String phone1 = "1-800-588-2300";
        String phone2 = "100-94-2334";
        String phone3 = "009";
        String phone4 = "951-num-1809";
        String phone5 = "123456789";
        String phone6 = "343-1291989";
        String phone7 = "181234";

        System.out.println("\nphone 1-800-588-2300 is valid? "+Patterns.validatePhone(phone1));
        System.out.println("phone 100-94-2334 is valid? " + Patterns.validatePhone(phone2));
        System.out.println("phone 009 is valid? " + Patterns.validatePhone(phone3));
        System.out.println("phone 951-num-1809 is valid? " + Patterns.validatePhone(phone4));
        System.out.println("phone 123456789 is valid? " + Patterns.validatePhone(phone5));
        System.out.println("phone 343-1291989 is valid? " + Patterns.validatePhone(phone6));
        System.out.println("phone 181234 is valid? " + Patterns.validatePhone(phone7));
//pattern 6
        String date1 = "1/21";
        String date2 = "12/34/2000";
        String date3 = "10/05/2020";
        String date4 = "9-23-1987";
        String date5 = "5";
        String date6 = "the ninth of january, 2016";
        String date7 = "123456789";

        System.out.println("\ndate 1/21 is valid? "+Patterns.validateDate(date1));
        System.out.println("date 12/34/2000 is valid? " + Patterns.validateDate(date2));
        System.out.println("date 10/05/2020 is valid? " + Patterns.validateDate(date3));
        System.out.println("date 9-23-1987 is valid? " + Patterns.validateDate(date4));
        System.out.println("date 5 is valid? " + Patterns.validateDate(date5));
        System.out.println("date the ninth of january, 2016 is valid? " + Patterns.validateDate(date6));
        System.out.println("date 123456789 is valid? " + Patterns.validateDate(date7));
//pattern 7
        String age1 = "twenty";
        String age2 = "20";
        String age3 = "30+23";
        String age4 = "18 years old";
        String age5 = "5";
        String age6 = "+-+-";
        String age7 = "rigorous testing";

        System.out.println("\nage twenty is valid? "+Patterns.validateAge(age1));
        System.out.println("age 20 is valid? " + Patterns.validateAge(age2));
        System.out.println("age 30+23 is valid? " + Patterns.validateAge(age3));
        System.out.println("age 18 years old is valid? " + Patterns.validateAge(age4));
        System.out.println("age 5 is valid? " + Patterns.validateAge(age5));
        System.out.println("+-+- valid? " + Patterns.validateAge(age6));
        System.out.println("age rigorous testing is valid? " + Patterns.validateAge(age7));

//pattern 8
        String time1 = "eleven thirty-two";
        String time2 = "2:0";
        String time3 = "11:59";
        String time4 = "time";
        String time5 = "false o' clock";
        String time6 = "0:0";
        String time7 = "vrrrt vrrrrt";

        System.out.println("\ntime eleven thirty-two valid? "+Patterns.validateTime(time1));
        System.out.println("time 2:0 is valid? " + Patterns.validateTime(time2));
        System.out.println("time 11:59 is valid? " + Patterns.validateTime(time3));
        System.out.println("time time is valid? " + Patterns.validateTime(time4));
        System.out.println("time false o' clock is valid? " + Patterns.validateTime(time5));
        System.out.println("time 0:0 is valid? " + Patterns.validateTime(time6));
        System.out.println("time vrrrt vrrrrt is valid? " + Patterns.validateTime(time7));
//pattern 9
        String email1 = "sally@gmail.com";
        String email2 = "2020221@:L:.com";
        String email3 = "MyEmail";
        String email4 = "@.com";
        String email5 = "DaleBolido@hotmail.com";
        String email6 = "emailatemaildotcom";
        String email7 = "3175727@florbnob.com";

        System.out.println("\nemail sally@gmail.com is valid? "+Patterns.validateEmail(email1));
        System.out.println("email 2020221@:L:.com is valid? " + Patterns.validateEmail(email2));
        System.out.println("email MyEmail is valid? " + Patterns.validateEmail(email3));
        System.out.println("email @.com is valid? " + Patterns.validateEmail(email4));
        System.out.println("email DaleBolido@hotmail.com is valid? " + Patterns.validateEmail(email5));
        System.out.println("email emailatemaildotcom " + Patterns.validateEmail(email6));
        System.out.println("email 3175727@florbnob.com is valid? " + Patterns.validateEmail(email7));
//pattern 10
        String experience1 = "7 years of experience";
        String experience2 = "45 years of experience";
        String experience3 = "0 years of experience";
        String experience4 = "09 years of experience";
        String experience5 = "1 yrs exp";
        String experience6 = "3.14159 years of experience";
        String experience7 = "100 years";

        System.out.println("\ninput 7 years of experience is valid? "+Patterns.validateExperience(experience1));
        System.out.println("input 45 years of experience is valid? " + Patterns.validateExperience(experience2));
        System.out.println("input 0 years of experience is valid? " + Patterns.validateExperience(experience3));
        System.out.println("input 09 years of experience is valid? " + Patterns.validateExperience(experience4));
        System.out.println("input 1 yrs exp is valid? " + Patterns.validateExperience(experience5));
        System.out.println("input 3.14159 yrs exp is valid? " + Patterns.validateExperience(experience6));
        System.out.println("input 100 years is valid? " + Patterns.validateExperience(experience7));
    }
}