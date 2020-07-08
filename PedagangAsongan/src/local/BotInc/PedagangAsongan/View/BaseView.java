package local.BotInc.PedagangAsongan.View;

import java.util.InputMismatchException;
import java.util.Scanner;

import local.BotInc.PedagangAsongan.Constant.*;

public abstract class BaseView {

	abstract void show();
	
	Scanner input = new Scanner(System.in);

	protected String brandName = "Asoyy Inc";

	public void tampilanDaftarBarang() {
		tampilkanDaftarBuah();
		tampilkanDaftarSayuran();
		tampilkanDaftarMie();
		tampilkanDaftarAir();
	}
	
	public void tampilkanDaftarBuah() {
		System.out.println();
		System.out.println("Daftar list barang kategori buah : ");
		System.out.println(Barang.BUAH1.no + " Nama Barang " + Barang.BUAH1.nama + " dengan harga " + Barang.BUAH1.harga);
		System.out.println(Barang.BUAH2.no + " Nama Barang " + Barang.BUAH2.nama + " dengan harga " + Barang.BUAH2.harga);
		System.out.println(Barang.BUAH3.no + " Nama Barang " + Barang.BUAH3.nama + " dengan harga " + Barang.BUAH3.harga);
		System.out.println(Barang.BUAH4.no + " Nama Barang " + Barang.BUAH4.nama + " dengan harga " + Barang.BUAH4.harga);
		System.out.println();
	}
	
	public void tampilkanDaftarSayuran() {
		System.out.println("Daftar list barang kategori sayuran : ");
		System.out.println(Barang.SAYURAN1.no + " Nama Barang " + Barang.SAYURAN1.nama + " dengan harga " + Barang.SAYURAN1.harga);
		System.out.println(Barang.SAYURAN2.no + " Nama Barang " + Barang.SAYURAN2.nama + " dengan harga " + Barang.SAYURAN2.harga);
		System.out.println(Barang.SAYURAN3.no + " Nama Barang " + Barang.SAYURAN3.nama + " dengan harga " + Barang.SAYURAN3.harga);
		System.out.println();
	}
	
	public void tampilkanDaftarMie(){
		System.out.println("Daftar list barang kategori Mie : ");
		System.out.println(Barang.MIE1.no + " Nama Barang " + Barang.MIE1.nama + " dengan harga " + Barang.MIE1.harga);
		System.out.println(Barang.MIE2.no + " Nama Barang " + Barang.MIE2.nama + " dengan harga " + Barang.MIE2.harga);
		System.out.println(Barang.MIE3.no + " Nama Barang " + Barang.MIE3.nama + " dengan harga " + Barang.MIE3.harga);
		System.out.println();
	}
	
	public void tampilkanDaftarAir(){
		System.out.println("Kategori Air Mineral : ");
		System.out.println(Barang.AIR1.no + " Nama Barang " + Barang.AIR1.nama + " dengan harga " + Barang.AIR1.harga);
		System.out.println(Barang.AIR2.no + " Nama Barang " + Barang.AIR2.nama + " dengan harga " + Barang.AIR2.harga);
		System.out.println(Barang.AIR3.no + " Nama Barang " + Barang.AIR3.nama + " dengan harga " + Barang.AIR3.harga);
		System.out.println();
	}

	public Integer getAnInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.err.print("Try again: ");
			}
		}
	}
	
}
