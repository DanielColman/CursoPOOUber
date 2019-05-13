class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        UberX uberX = new UberX("ABC123", new Account("Daniel Colman", "5241779"), "Toyota", "Corolla");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("123ccc", new Account("daniel", "12345"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }

}