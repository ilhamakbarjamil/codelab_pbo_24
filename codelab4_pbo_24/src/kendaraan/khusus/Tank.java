package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble{
    @Override
    public void Start() {
        System.out.println("Menyalakan mesin" + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println(this.getName()+" berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
