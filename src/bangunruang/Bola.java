package bangunruang;

public class Bola {
    public int r = 0;
    public final double PHI = 22.0/7;
    public void Bola() {
        System.out.println("Nilai jari-jari (r) : "+r+" cm");
        System.out.println("Nilai Phi : "+ PHI);

        double L = 4*PHI*Math.pow(r,2);
        double V = 4/3*PHI*Math.pow(r,3);

        System.out.println("Luas bola = "+ L);
        System.out.println("Volume bola = "+ V);
    }
}
