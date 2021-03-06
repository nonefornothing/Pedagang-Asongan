package local.BotInc.PedagangAsongan.View;

import java.util.ArrayList;

import local.BotInc.PedagangAsongan.Constant.*;
import local.BotInc.PedagangAsongan.Controller.*;

public class ViewBuah extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();
	public ViewBuah(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}
	
	@Override
	void show() {
	
		tampilkanDaftarBuah();
		
		System.out.print("Masukan pilihan Buah : ");
		int pilihanAir = getAnInteger();
	

		if (pilihanAir == 1) {
			new ItemController(listCustomer).start(Barang.BUAH1.nama, Barang.BUAH1.harga);
		} else if (pilihanAir== 2) {
			new ItemController(listCustomer).start(Barang.BUAH2.nama, Barang.BUAH2.harga);
		} else if (pilihanAir == 3) {
			new ItemController(listCustomer).start(Barang.BUAH3.nama, Barang.BUAH3.harga);
		} else if (pilihanAir == 4) {
			new ItemController(listCustomer).start(Barang.BUAH4.nama, Barang.BUAH4.harga);
		} else if (pilihanAir == 5) {
			new ViewListBarang(listCustomer);
		} else {
			System.out.println("Pilihan salah, silakan input kembali");
			show();
		}
		
	}
	
	
	

}
