package local.BotInc.PedagangAsongan.Constant;

public enum Barang {

	BUAH1(1, "Durian", 20000), BUAH2(2, "Mangga", 15000), BUAH3(3, "Apel", 25000), BUAH4(4, "Nanas", 7000),
	SAYURAN1(1, "Bayam", 5000), SAYURAN2(2, "Brokoli", 8000), SAYURAN3(3, "Kol", 4000), MIE1(1, "Indomie", 2000),
	MIE2(2, "Mie Sedap", 1000), MIE3(3, "Mie Sarimi", 3000), AIR1(1, "Aqua", 5000), AIR2(2, "Danone", 3500),
	AIR3(3, "Le-Minerale", 5000);

	public int no;
	public String nama;
	public int harga;

	private Barang(int no, String nama, int harga) {
		this.no = no;
		this.nama = nama;
		this.harga = harga;
	}

}
