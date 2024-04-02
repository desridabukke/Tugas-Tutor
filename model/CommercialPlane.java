package model;

public class CommercialPlane implements Plane {
    private String name;

    public CommercialPlane(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        // Logika untuk menghitung luas pesawat komersial
        return 0; // Contoh sementara, gantilah dengan logika yang sesuai
    }

    @Override
    public String toString() {
        return "CommercialPlane [name=" + name + "]";
    }
}
