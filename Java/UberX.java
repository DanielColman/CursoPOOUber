class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String Brand, String model){
        super(license, driver)); //Super Clase Constructor
        this.brand = brand;
        this.model = model;
    }
}