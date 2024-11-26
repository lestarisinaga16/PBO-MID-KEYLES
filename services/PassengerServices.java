package services;

import entities.Passenger;
import repositories.PassengerRepository;

public class PassengerServices {
    private PassengerRepository repository;

    public PassengerServices(PassengerRepository repository) {
        this.repository = repository;
    }

    public void addPassenger(Passenger passenger) {
        repository.addPassenger(passenger);
    }

    public void showAllPassengers() {
        for (Passenger passenger : repository.getAllPassengers()) {
            System.out.println("Nama: " + passenger.getNama() + ", Umur: " + passenger.getUmur());
        }
    }
}
