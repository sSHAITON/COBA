package COBA;

class HtgGanjilGenap {
    private int[] angka = { 299, 888, 900, 277, 211, 233, 4, 7, 3, 55 };
    private int genap = 0;
    private int ganjil = 0;

    public int getGenap() {
        return genap;
    }

    public void setGenap(int genap) {
        this.genap = genap;
    }

    public int getGanjil() {
        return ganjil;
    }

    public void setGanjil(int ganjil) {
        this.ganjil = ganjil;
    }

    public void countGanjilGenap() {
        for (int number : angka) {
            if (number % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }
    }
}

public class latihan2 {

    public static void main(String[] args) {
        HtgGanjilGenap htg = new HtgGanjilGenap();
        htg.countGanjilGenap();
        System.out.println("Jumlah bilangan genap: " + htg.getGenap());
        System.out.println("Jumlah bilangan ganjil:" + htg.getGanjil());
    }
}
