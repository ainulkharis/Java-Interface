package ModelBaru;

import Interfaces.*;

public class Perhitungan implements ContohInterface{
    private int Panjang;
    private int Lebar;
    private int Luas;

    public Perhitungan(int _p, int _l, int _Luas){
        this.Panjang = _p;
        this.Lebar = _l;
        _Luas = 0;
        this.Luas = _Luas;
        printJudulClass("Menentukan Luas Persegi Panjang");
    }

    private void printJudulClass(String judul){
        System.out.println(judul);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Menentukan Luas Persegi Panjang");
    }

    @Override
    public void HitungLuas() {
        this.Luas = this.Panjang * this.Lebar;
    }

    @Override
    public void printHitungLuas() {
        this.Luas = this.Panjang * this.Lebar;
        System.out.println("Panjang = " + this.Panjang);
        System.out.println("Lebar   = " + this.Lebar);
        System.out.println("Jadi luas persegi panjang diatas adalah " + this.Luas);
        
    }
    
}
