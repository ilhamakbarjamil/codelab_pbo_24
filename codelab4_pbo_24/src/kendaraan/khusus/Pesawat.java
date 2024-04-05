package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Mennyalakan mesin " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin " + this.getName());
    }

    @Override
    public void Brake(){
        System.out.println("Mesin " + this.getName() + "mengerem");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " lepas landas");
    }
}
