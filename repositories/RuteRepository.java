package repositories;

import entities.Rute;
import java.util.ArrayList;
import java.util.List;

public class RuteRepository {
    private List<Rute> rutes = new ArrayList<>();

    public void addRute(Rute rute) {
        rutes.add(rute);
    }

    public List<Rute> getAllRutes() {
        return rutes;
    }

    public void editRute(int index, Rute updatedRute) {
        rutes.set(index, updatedRute);
    }

    public void removeRute(int index) {
        rutes.remove(index);
    }
}
