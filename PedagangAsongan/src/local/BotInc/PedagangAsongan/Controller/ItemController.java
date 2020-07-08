package local.BotInc.PedagangAsongan.Controller;

import java.util.ArrayList;

import local.BotInc.PedagangAsongan.Service.*;

public class ItemController {

	ArrayList<String[]> listCustomer = new ArrayList<String[]>();
	
	public ItemController(ArrayList<String[]> listCustomer) {
		this.listCustomer = listCustomer ;
	}
	
	public void start(String nameItem, Integer priceItem) {
		new PedagangAsonganServiceImpl(listCustomer).calculate(nameItem, priceItem);
	}
	
	public void editkeranjang(Integer masukanMenuEdit) {
		new PedagangAsonganServiceImpl(listCustomer).editKeranjang(masukanMenuEdit);
	}
	
}
