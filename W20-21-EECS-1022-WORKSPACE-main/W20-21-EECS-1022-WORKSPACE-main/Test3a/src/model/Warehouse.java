package model;

public class Warehouse {
	// Attributes
	private Equipment[] equipments;
	private Equipment[] backup;
	private int count;
	private int quantity;
	private int repeat;
	
	private int fornow;


	/* ------------------------------------------- */
	// Constructor
	
	public Warehouse(int num) {
		this.equipments = new Equipment[num];
		this.fornow = num;
	}


	/* ------------------------------------------- */
	// Accessor

	public Equipment[] getEquipments() {
		this.backup = new Equipment[this.count];
		
		for (int i = 0; i < this.count; i ++) {
			this.backup[i] = this.equipments[i];
		}
		return this.backup;
	}
	
	public Equipment getEquipment(String product) {
		Equipment result = null;
		boolean stay = true;
		
		for(int i = 0; stay && i < this.count; i ++) {
			if (this.equipments[i].getName().equals(product)) {
				result = this.equipments[i];
				stay = false;
			}
		}
		return result;
	}
	
	public Equipment[] getEquipments(String[] names) {
		this.backup = new Equipment[this.count];
		int k = 0;
		boolean stay = true;
		
		for (int i = 0; i < this.count; i ++) {
			for (int m = 0; m < names.length; m ++) {
				if (this.equipments[i].getName().equals(names[m])) {
					repeat ++;
				}
			}
		}
		
		Equipment[] equip = new Equipment[this.repeat];
		for (int i = 0; i < this.count; i ++) {
			for (int m = 0; m < names.length; m ++) {
				if (this.equipments[i].getName().equals(names[m])) {
					stay = true;
					for (; stay && k < this.repeat; k ++) {
						equip[k] = this.equipments[i];
						stay = false;
					}
				}
			}
		}
		this.repeat = 0;
		
		return equip;
	}
	
	public Equipment[] getEquipmentsWithinRange(int a, int b) {
		int ok = 0;
		int m = 0;
		boolean stay = true;
		for (int i = 0; i < this.count; i ++) {
			if (this.equipments[i].getStock() <= b && this.equipments[i].getStock() >=a) {
				ok  ++;
			}
		}
		
		Equipment[] back = new Equipment[ok];
		
		for (int i = 0; i < this.count; i ++) {
			if (this.equipments[i].getStock() <= b && this.equipments[i].getStock() >=a) {
				stay = true;
				for (; stay && m < ok; m ++) {
					back[m] = this.equipments[i];
					stay = false;
				}
			}
		}
		
		return back;
	}
	


	/* ------------------------------------------- */
	// Mutator
	
	public void addEquipment(Equipment newEq) {
		boolean dont = false;
		if (this.count <= this.fornow) {
			for (int i = 0; i < this.count; i ++) {
				if (this.equipments[i].getName().equals(newEq.getName())) {
					this.equipments[i].setStock(newEq.getnow());
					dont = true;
					
				}
				else {
				}
			}
			if (dont == true) {
				
			}
			else {
				this.equipments[this.count] = newEq;
				this.count ++;
			}
			
			
		}
		
		
	}
	
	public void addStock(String newProduct, int quantity) {
		for (int i = 0; i < this.count; i ++) {
			if (this.equipments[i].getName().equals(newProduct)) {
				this.equipments[i].setStock(quantity);
			}
		}
	}
	
	
	
	
	
	
//	public Equipment[] getEquipments(String[] names) {
//		this.backup = new Equipment[this.count];
//		for (int i = 0; i < this.equipments.length; i ++ ) {
//			if (this.equipments[i] != null) {
//				
//			}
//			else if (this.equipments[i] == null){
//				this.backup = new Equipment[this.count];
//			}
//		}
//		return this.backup;
//	}
	
	
	
	
	
	
	 
	
	
}