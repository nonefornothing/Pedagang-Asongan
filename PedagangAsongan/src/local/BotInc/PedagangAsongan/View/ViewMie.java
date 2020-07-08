package local.BotInc.PedagangAsongan.View;

import java.util.ArrayList;

import local.BotInc.PedagangAsongan.Constant.*;
import local.BotInc.PedagangAsongan.Controller.*;

public class ViewMie extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();

	public ViewMie(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}

	@Override
	void show() {
		tampilkanDaftarMie();
		System.out.print("masukan pilihan Mie : ");
		int pilihanMie = getAnInteger();

		if (pilihanMie == 1) {
			new ItemController(listCustomer).start(Barang.MIE1.nama, Barang.MIE1.harga);
		} else if (pilihanMie == 2) {
			new ItemController(listCustomer).start(Barang.MIE2.nama, Barang.MIE2.harga);
		} else if (pilihanMie == 3) {
			new ItemController(listCustomer).start(Barang.MIE3.nama, Barang.MIE3.harga);
		} else if (pilihanMie == 4) {
			new ViewListBarang(listCustomer);
		} else {
			System.out.println("Pilihan salah, silakan input kembali");
			show();
		}
	}

}
