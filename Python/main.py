from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("ABC234", Account("Daniel Colman", "123456"))
    print(vars(car))
    print(vars(car.driver))