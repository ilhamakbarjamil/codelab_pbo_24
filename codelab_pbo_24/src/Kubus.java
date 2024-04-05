import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double sisi;
   

    public Kubus(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void volume(){
        double hasil = Math.pow(sisi, 3);
        
        System.out.println("Hasil volume: " + hasil);
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
       
        System.out.println("Hasil luas permukaan: " + hasil);
    }
}
