package views;

import entities.Passenger;
import entities.Rute;
import repositories.PassengerRepository;
import repositories.RuteRepository;
import services.PassengerServices;

import java.util.Scanner;

public class MainView {
    private PassengerServices passengerService;
    private RuteRepository ruteRepository;

    public MainView() {
        PassengerRepository passengerRepository = new PassengerRepository();
        passengerService = new PassengerServices(passengerRepository);
        ruteRepository = new RuteRepository();
    }

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Passenger");
            System.out.println("2. Lihat Semua Passenger");
            System.out.println("3. Tambah Rute");
            System.out.println("4. Lihat Semua Rute");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    String umur = scanner.nextLine();
                    passengerService.addPassenger(new Passenger(nama, umur, "L", "01-01-2000", "1234567", "1234567890"));
                    break;
                case "2":
                    passengerService.showAllPassengers();
                    break;
                case "3":
                    System.out.print("Rute baru: ");
                    String rute = scanner.nextLine();
                    ruteRepository.addRute(new Rute(rute));
                    break;
                case "4":
                    for (Rute r : ruteRepository.getAllRutes()) {
                        System.out.println("Rute: " + r.getRute());
                    }
                    break;
                case "5":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        MainView view = new MainView();
        view.showMainMenu();
    }
}
