public class AccountOwner {
    private static String salutation;
    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static long phoneNumber;
    private static MailingAddress mailingAddress;


    public AccountOwner(String salutation, String firstName, String lastName, String emailAddress, long phoneNumber, MailingAddress mailingAddress){
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.mailingAddress = mailingAddress;
    }

    public String getName(int format){
        if(format == 3){
            return lastName + ", " + firstName;
        }else if (format == 2){
            return salutation + ". " + lastName;
        }
        return firstName + " " + lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFormattedPhoneNumber() {
        String phoneNumber1 = String.valueOf(phoneNumber);
        String first = "(" + phoneNumber1.substring(0, 3) + ") ";
        String second = phoneNumber1.substring(3, 6) + "-" + phoneNumber1.substring(6, 10);
        return first + second;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public void setSalutation(String salutation) {
        AccountOwner.salutation = salutation;
    }

    public void setFirstName(String firstName) {
        AccountOwner.firstName = firstName;
    }

    public void setLastName(String lastName) {
        AccountOwner.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        AccountOwner.emailAddress = emailAddress;
    }

    public void setPhoneNumber(long phoneNumber) {
        AccountOwner.phoneNumber = phoneNumber;
    }
}