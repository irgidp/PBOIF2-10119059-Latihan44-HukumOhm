/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Hukum Ohm
 */
package pboif2.pkg10119059.latihan44.hukumohm;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan44HukumOhm {

    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        
        Baterai batre = new Baterai(3,12);
        
        System.out.println("");
        System.out.println("Kuat Arus : " +batre.getKuatArus());
        System.out.println("Hambatan  : " +batre.getHambatan());
        System.out.println("Hasil Tegangan : " +batre.hitungTegangan()+ " Volt");
    }
    
}
