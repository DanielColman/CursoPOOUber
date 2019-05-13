import java.util.Map;
import java.util.ArrayList;;

class UberVan extends Car{

    Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver); //Super Clase Constructor 
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6){
            this.passenger = passenger;
        } else {
            System.out.println("Necesistas asignar 4 Pasajeros");
        }
    }
}

