package local.BotInc.PedagangAsongan.View;

import local.BotInc.PedagangAsongan.Constant.*;
import local.BotInc.PedagangAsongan.Controller.*;
import java.util.ArrayList;

public class ViewSayuran extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();

	public ViewSayuran(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}

	@Override
	void show() {
		tampilkanDaftarSayuran();

		System.out.print("masukan pilihan Sayuran : ");
		int pilihanSayuran = getAnInteger();

		if (pilihanSayuran == 1) {
			new ItemController(listCustomer).start(Barang.SAYURAN1.nama, Barang.SAYURAN1.harga);
		} else if (pilihanSayuran == 2) {
			new ItemController(listCustomer).start(Barang.SAYURAN2.nama, Barang.SAYURAN2.harga);
		} else if (pilihanSayuran == 3) {
			new ItemController(listCustomer).start(Barang.SAYURAN3.nama, Barang.SAYURAN3.harga);
		} else if (pilihanSayuran == 4) {
			new ViewListBarang(listCustomer);
		} else {
			System.out.println("Pilihan salah, silakan input kembali");
			show();
		}
	}
}
