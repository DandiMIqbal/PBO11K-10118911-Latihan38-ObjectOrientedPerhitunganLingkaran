/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan38;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        float diameter = 0;
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        if (scanner.hasNextInt()) {
            diameter = scanner.nextInt();
        }else{
            while (!scanner.hasNextInt()) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                diameter = scanner.nextInt();
            }
        }
        l.hitungLingkaran(diameter);
    }
    
}
