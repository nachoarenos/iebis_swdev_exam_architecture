


public class User implements Builder {

    public User(String angelica, String s, int i, String s1, String s2, String s3) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



    private String name;
    private String emailAddress;
    private int age;
    private String address;
    private String city;
    private String zipCode;



