public class Address {

    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public Address() {
    }

    public Address(String country, int index, String city, String street, int house, int apartment) {
        this.apartment = apartment;
        this.city = city;
        this.country = country;
        this.index = index;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void viewAddress() {
        System.out.println("Country:" + country);
        System.out.println("Index:" + index);
        System.out.println("City:" + city);
        System.out.println("Street:" + street);
        System.out.println("House:" + house);
        System.out.println("Apartment:" + apartment);

    }


}
