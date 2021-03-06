package local.BotInc.PedagangAsongan.View;

import java.util.ArrayList;

public class ViewListBarang extends BaseView{
	
	ArrayList<String[]> listCustomer = new ArrayList<String[]>();
	
	public ViewListBarang(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}
	
	public void show() {
		System.out.println("==== Welcome to Pedagang Asongan App by " + super.brandName + " ====");
		tampilanDaftarBarang();
		System.out.println("\n==== Pilih barang yang akan dicari ====");
		System.out.println("1. Buah ");
		System.out.println("2. Sayuran ");
		System.out.println("3. Mie ");
		System.out.println("4. Air Mineral ");
		System.out.println("5. Kembali ke Menu Awal");
		System.out.print("Input item kategori : ");
		int pilihanKategori = getAnInteger();
		
		if(pilihanKategori == 1) {
			new ViewBuah(listCustomer);
		}
		else if(pilihanKategori == 2) {
			new ViewSayuran(listCustomer);
		}
		else if(pilihanKategori == 3) {
			new ViewMie(listCustomer);
		}
		else if(pilihanKategori == 4) {
			new ViewAirMineral(listCustomer);
		}
		else if(pilihanKategori == 5) {
			new ViewMain(listCustomer);
		}
		else {
			System.out.println("Inputan Salah , Silakan input kembal");
			show();
		}
	}

}
