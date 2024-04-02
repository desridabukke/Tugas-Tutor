package driver;

import java.util.Scanner;
import model.Passanger;
import model.Pilot;
import model.CommercialPlane; // Ubah 'Plane' menjadi kelas konkret yang telah Anda buat

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the passenger: ");
        String name = scanner.nextLine();
        Passanger passenger = new Passanger(name);
        System.out.println("Enter the name of the pilot: ");
        name = scanner.nextLine();
        Pilot pilot = new Pilot(name);
        System.out.println("Enter the name of the plane: ");
        name = scanner.nextLine();
        CommercialPlane plane = new CommercialPlane(name); // Menggunakan kelas konkret yang sudah dibuat
        System.out.println(passenger);
        System.out.println(pilot);
        System.out.println(plane);
    }
}
