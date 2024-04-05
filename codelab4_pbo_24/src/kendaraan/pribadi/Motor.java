package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void Start(){
        System.out.println("Mesin "+ this.getName()+ " menyalakan");
    }
    
    @Override
    public void Stop() {
        System.out.println("Mesin " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Mesin " +this.getName() + " mengerem");
    }
}
