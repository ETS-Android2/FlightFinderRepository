package model;

public class Repository {
	// Attributes 
	private Item[] items;
	private int noi;
	
	private Item[] backupItems;
	private int capacity; 
	
		// Constructor
		public Repository(int number) {
			this.items = new Item[number];
			this.capacity = number;
		}
		
		// Accessor 
		public Item[] getItems() {
			this.backupItems = new Item[this.noi];
			for (int i = 0; i < this.noi; i ++) {
				this.backupItems[i] = this.items[i];
			}
			return this.backupItems;
		}
		
		public Item[] getItems(String[] items) {
			int count = 0;
			int m = 0;
			int l = 0;
			boolean stay = true;
			for (; m < items.length; m ++) {
				for (int i = 0; i < this.noi; i ++) {
					if (this.items[i].getTitle().equals(items[m])) {
						count ++;
					}
				}
			}
			m = 0;
			
			Item[] temp = new Item[count];
			for (; m < items.length; m ++) {
				for (int i = 0; i < this.noi; i ++) {
					if (this.items[i].getTitle().equals(items[m])) {
						stay = true;
						for(; stay && l < count; l ++) {
							temp[l] = this.items[i];
							stay = false;
						}
					}
				}
			}
			return temp;
		}
		
		public Item[] getItemsOutsideRange(int num1, int num2) {
			int count = 0;
			int m = 0;
			int l = 0;
			boolean stay = true;
			for (int i = 0; i < this.noi; i ++) {
				if (this.items[i].getAmount() > num1 || this.items[i].getAmount() < num2 ) {
					count ++;
				}
			}
	
			
			Item[] temp = new Item[count];
			
			for (int i = 0; i < this.noi; i ++) {
				if (this.items[i].getAmount() > num1 || this.items[i].getAmount() < num2) {
					stay = true;
					for(; stay && l < count; l ++) {
						temp[l] = this.items[i];
						stay = false;
					}
				}
			}
		
			return temp;
		}
		
		public int getAmount(String item) {
			int result = 0;
			boolean found = false;
			for (int i = 0; i < this.noi; i ++) {
				if (this.items[i].getTitle().equals(item)) {
					result = this.items[i].getAmount();
					found = true;
				}
			}
			
			if (! found) {
				result = -1;
			}
			return result;
		}
		
		// Mutator
		public void addItem(Item item) {
			boolean found = false;
			
			for (int i = 0; i < this.noi; i ++) {
				if (this.items[i].getTitle().equals(item.getTitle())) {
					this.items[i].increaseAmount(item.getAmount());
					found = true;
					break;
				}
			}
			
			if (this.noi < this.items.length) {
				if (!found){
						this.items[this.noi] = item;
						this.noi ++;
					}
			}
		}
		
		public void decreaseAmount(String item, int num) {
			boolean found = false;
			for (int i = 0; i < this.noi; i ++) {
				if (this.items[i].getTitle().equals(item)) {
					this.items[i].decreaseAmount(num);
					found = true;
					break;
				}
			}
		}
}








//this.backupItems = new Item[this.noi];
//for (int i = 0; i < this.noi; i ++) {
//	for (int m = 0; m < items.length; m ++) {
//		if (items[m].equals(this.backupItems[i])) {
//			
//		}
//	}
//	
//}



//
//boolean stay = true;
//int count = 0;
//int m = 0;
//int n = 0;
//
//this.backupItems = new Item[this.noi];
//if (m < items.length) {
//	for (int i = 0; i < this.noi; i ++) {
//		if (this.items[i].getTitle().equals(items[m])) {
//			count ++;
//		}
//		m ++;
//	}
//}
//
//Item[] temp = new Item[count];
//if (m < items.length) {
//	for (int i = 0; i < this.noi; i ++) {
//		if (this.items[i].getTitle().equals(items[m])) {
//			for(;stay && n < count; n ++) {
//				temp[n] = this.items[i];
//				stay = false;
//			}
//		}
//		m ++;
//	}
//}
 











