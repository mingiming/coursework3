import java.util.Scanner;

public class ProcessAName5026211124 {
    public static void main(String[] args){
        // manggil
        Scanner isiin = new Scanner(System.in);
        String nama, namaAwal, namaAkhir;
        char inisial;
        int spasi1, spasiAkhir;

        // isiin full namae
        System.out.print("Type your nama: ");
        nama = isiin.nextLine();

        // ini inisial
        spasi1 = nama.indexOf(" ");
        namaAwal = nama.substring(0, spasi1);
        inisial = namaAwal.charAt(0);
        
        // nama akhire
        spasiAkhir = nama.lastIndexOf(" ");
        namaAkhir = nama.substring(spasiAkhir);
        
        // Output
        System.out.println("Your nama is: " + namaAkhir + ", " + inisial + ".");
    }
}
