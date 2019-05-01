class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license; //Asigna al atributo de la Clase license el dato pasado por parametro
        this.driver = driver;

    }

    void printDataCar() {
        System.out.println("License: " + license + "Name Diver: " + driver.name); 
    }
    
}