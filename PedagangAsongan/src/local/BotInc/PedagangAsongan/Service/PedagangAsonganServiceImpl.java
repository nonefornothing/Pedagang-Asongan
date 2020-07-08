package local.BotInc.PedagangAsongan.Service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import local.BotInc.PedagangAsongan.View.ViewMain;

public class PedagangAsonganServiceImpl implements PedagangAsonganService {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();

	Scanner input = new Scanner(System.in);
	public PedagangAsonganServiceImpl(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer;
	}

	public void calculate(String namaBuahParameter, Integer hargaItemParameter) {
		System.out.println("===============");
		System.out.print("berapa banyak: ");
		

		Integer masukan = getAnInteger();
		
		Integer jumlah = masukan;
		Integer totalHarga = masukan * hargaItemParameter;
		if(listCustomer.size() == 0) {
			
			String[] temp = { namaBuahParameter, String.valueOf(jumlah),String.valueOf(hargaItemParameter), String.valueOf(totalHarga) };
			listCustomer.add(temp);
			
		} else {
			Boolean flag = true;
			for(int i = 0; i < listCustomer.size(); i++) {
				if(namaBuahParameter.equalsIgnoreCase(listCustomer.get(i)[0])) {
					Integer jumlahHasil = jumlah + Integer.valueOf(listCustomer.get(i)[1]);
					Integer totalHargaHasil = totalHarga + Integer.valueOf(listCustomer.get(i)[3]);
					String[] temp = { namaBuahParameter, String.valueOf(jumlahHasil),String.valueOf(hargaItemParameter), String.valueOf(totalHargaHasil) };
					listCustomer.set(i, temp);
					flag = false;
					break;
				}
			}
			if(flag) {
				String[] temp = { namaBuahParameter, String.valueOf(jumlah),String.valueOf(hargaItemParameter), String.valueOf(totalHarga) };
				listCustomer.add(temp);
			}
		}
		System.out.println("--------------------");
		System.out.println("Berhasil ditambahkan");
		System.out.println("--------------------");
		new ViewMain(listCustomer);
	}

	public void editKeranjang(Integer masukan) {
		switch (masukan) {
		case 1:
			edit();
			break;

		case 2:
			remove();
			break;
		
		default:
			System.out.println("Input Wrong!");
			System.out.print(": ");

			Integer masukanAgain = getAnInteger();

			editKeranjang(masukanAgain);
		}
	}
	
	public void edit() {
		Scanner userInput = new Scanner(System.in);
		String masukanString;
		Integer masukan = 0;;
		System.out.print("masukan nama item: ");
		masukanString = input.nextLine();
		
		Integer flag = 0;
		for(int i = 0; i < listCustomer.size(); i++) {
			if(masukanString.equalsIgnoreCase(listCustomer.get(i)[0])) {
				System.out.print("Input jumlah: ");
				userInput.hasNextInt();

				try {
					masukan = userInput.nextInt();
				} catch (Exception e) {
					System.out.println("Input Wrong!");
					edit();
				}
				
				String namaItem = masukanString;
				String jumlahItem = String.valueOf(masukan);
				String hargaItem = listCustomer.get(i)[2];
				String totalHargaItem = String.valueOf(masukan * Integer.valueOf(listCustomer.get(i)[2]));
				String[] p = { namaItem, jumlahItem, hargaItem, totalHargaItem };
				listCustomer.set(i, p);
				flag = 1;
				System.out.println("Item berhasil diubah");
				
				new ViewMain(listCustomer);
			}
		}
		if(flag == 0) {
			System.out.println("Item tidak ada di keranjang");
			edit();
		}
	}
	
	public void remove() {

		System.out.print("masukan nama item yang ingin di hapus: ");
		Scanner userInput = new Scanner(System.in);
		String masukanString = userInput.nextLine();
		
		Integer flag = 0;
		for(int i = 0; i < listCustomer.size(); i++) {
			if(masukanString.equalsIgnoreCase(listCustomer.get(i)[0])) {
				listCustomer.remove(i);
				flag = 1;
				System.out.println("Item berhasil dihapus dari keranjang");
				System.out.println("====================================");
				new ViewMain(listCustomer);
			}
		}
		if(flag == 0) {
			System.out.println("Item tidak ada dalam keranjang");
			remove();
		}
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
