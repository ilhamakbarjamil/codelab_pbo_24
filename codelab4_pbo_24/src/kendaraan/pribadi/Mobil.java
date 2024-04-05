package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    @Override
    public void Start() {
        System.out.println("Mesin " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Mesin " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println(this.getName()+" berhenti");
    }
}
