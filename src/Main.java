public class Main {

    public static void main(String[] args) {

        Address home = new Address();

        home.setCountry("Belgium");
        home.getCountry();
        //System.out.println(home.getCountry()); // 2-ой вариант вывода поля

        home.setIndex(1060);
        home.getIndex();

        home.setCity("Brussels");
        home.getCity();

        home.setStreet("Avenue Louise");
        home.getStreet();

        home.setHouse(267);
        home.getHouse();

        home.setApartment(2);
        home.getApartment();

        home.viewAddress();



    }
}
