package local.BotInc.PedagangAsongan.View;
import java.util.ArrayList;

public class ViewMain extends BaseView {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();
	
	public int pilihanMenu;
	public int pilihanKategoriBarang;
	public int pilihanUpdate,updateIndex,nilaiUpdate;
	public int pilihanRemove,removeIndex;
	
	public ViewMain(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
		show();
	}

	
	public void show() {

		System.out.println("\n==== Pedagang Asongan App ====");
		System.out.println("\n==== Pilih Menu dari aplikasi ====");
		System.out.println("1. List Barang ");
		System.out.println("2. Keranjang Barang ");
		System.out.println("3. Keluar Aplikasi");

		do {
			pilihanMenu = getAnInteger();
			
			if(pilihanMenu == 1) {
				new ViewListBarang(listCustomer);
			}else if(pilihanMenu == 2) {
				new ViewKeranjangBelanja(listCustomer);
			}else if(pilihanMenu == 3) {
				System.exit(0);
			}else {
				System.out.println("Inputan Salah , Coba lagi");
			}
		}while(true);
		
	}

}
