package info;

public class Address {
    private String doorNo;
    private String street;
    private String city;
    private int zipCode;

    Address(String doorNo, String street, String city, int zipCode){
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getDoorNo(){
        return doorNo;
    }
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getCity(){
        return city;
    }

    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
}
