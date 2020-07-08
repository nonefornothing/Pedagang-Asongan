package local.BotInc.PedagangAsongan.View;
import java.util.ArrayList;

import local.BotInc.PedagangAsongan.Constant.*;
import local.BotInc.PedagangAsongan.Controller.*;

public class ViewAirMineral extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();

	public ViewAirMineral(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}

	@Override
	void show() {
		
		tampilkanDaftarAir();
		System.out.print("masukan pilihan Air Mineral : ");
		int pilihanAir = getAnInteger();
	

		if (pilihanAir == 1) {
			new ItemController(listCustomer).start(Barang.AIR1.nama, Barang.AIR1.harga);
		} else if (pilihanAir== 2) {
			new ItemController(listCustomer).start(Barang.AIR2.nama, Barang.AIR2.harga);
		} else if (pilihanAir == 3) {
			new ItemController(listCustomer).start(Barang.AIR3.nama, Barang.AIR3.harga);
		} else if (pilihanAir == 4) {
			new ViewListBarang(listCustomer);
		} else {
			System.out.println("Pilihan salah, silakan input kembali");
			show();
		}

	}

}
