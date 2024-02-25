import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab1coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
        String tanggalLahirInput = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);
        LocalDate sekarang = LocalDate.now();

        Period umur = Period.between(tanggalLahir, sekarang);

        String jenisKelaminFull;

        if(jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminFull = "laki-laki";
        } else if(jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminFull = "perempuan";
        } else {
            System.out.println("Input jenis kelamin tidak valid");
            return;
        }

        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminFull);
        System.out.println("Umur Anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}
