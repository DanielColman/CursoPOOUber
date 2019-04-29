from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "ABC123"
    car.driver = "Daniel Colman"
    print(vars(car))