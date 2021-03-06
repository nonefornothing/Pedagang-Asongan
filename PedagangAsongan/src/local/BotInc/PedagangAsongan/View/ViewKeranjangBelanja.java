package local.BotInc.PedagangAsongan.View;

import java.util.ArrayList;

import local.BotInc.PedagangAsongan.Controller.*;

public class ViewKeranjangBelanja extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();

	public ViewKeranjangBelanja(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}

	@Override
	void show() {

		System.out.println("\n===== Keranjang Belanja =====");
		if (listCustomer.size() == 0) {
			System.out.println("Keranjang belanja anda masih kosong");
			System.out.println("==========================================");
		} else {
			for (int i = 0; i < listCustomer.size(); i++) {
				System.out.println(listCustomer.get(i)[0] + " " + listCustomer.get(i)[1] + " x "
						+ listCustomer.get(i)[2] + " dengan Total: " + listCustomer.get(i)[3]);
			}
		}

		tampilTotalHarga();

		System.out.println("1. Edit Keranjang");
		System.out.println("2. Kembali Ke Menu");
		System.out.print("masukan pilihan: ");

		Integer masukan = getAnInteger();

		if (masukan == 1) {
			pilihanMenuEdit(masukan);
		} else if (masukan == 2) {
			new ViewMain(listCustomer);
		}

	}

	public void tampilTotalHarga() {
		Integer temp = 0;
		for (int i = 0; i < listCustomer.size(); i++) {
			temp += Integer.valueOf(listCustomer.get(i)[3]);
		}
		System.out.println("--------------------------------");
		System.out.println("Total Harga = " + temp);
		System.out.println("--------------------------------");
	}

	public void pilihanMenuEdit(Integer masukan) {

		System.out.println();
		switch (masukan) {
		case 1:
			System.out.println("1. Ubah Jumlah");
			System.out.println("2. Hapus Item");
			System.out.println("================");
			System.out.print("masukan pilihan: ");

			Integer masukanMenuEdit = getAnInteger();

			new ItemController(listCustomer).editkeranjang(masukanMenuEdit);
			break;

		case 2:
			new ViewMain(listCustomer);
			break;

		default:
			System.out.println("Input Wrong!");
			break;
		}
	}

}
