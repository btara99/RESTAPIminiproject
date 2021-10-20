package com.sparta.bt.northwindrest.DTO;

public class ApiDTO {
    private String id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String country;

    public ApiDTO() {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
       this.country = country;
    }



    @Override
    public String toString() {
        return "CustomerEntity" + " " +
                "ID: " + id  + " " +
                "CompanyName: " + companyName + " " +
                "ContactName: " + contactName  + " " +
                "ContactTitle: " + contactTitle  + " " +
                "Address: " + address + " " +
                "City: " + city  + " " +
                "Country: " + country
                ;
    }
}
