package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mendeklarasi dan mendeskripsikan variabel pecahan sesuai dengan ukuran yang dapat ditampungnya.
 *                        Mengakses variabel dan menampilkannya di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float f;
        double d;
        
        f = 1234567890.123456789F;
        d = 1_234_567_890.123456789;
        
        System.out.println("float\t: " + f);
        System.out.println("double\t: " + d);
    }
    
}
