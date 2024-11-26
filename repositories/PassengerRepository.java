package repositories;

import entities.Passenger;
import java.util.ArrayList;
import java.util.List;

public class PassengerRepository {
    private List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    public void editPassenger(int index, Passenger updatedPassenger) {
        passengers.set(index, updatedPassenger);
    }
}
