package collections.sortedCollections;

public class StockItem implements Comparable<StockItem>{
	private final String name;
	private double price;
	private int stockQuantity = 0;
	public StockItem(String name, double price, int stockQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	public StockItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = 0;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void modifyStockQuantity(int stockQuantity) {
		int newQuantity = this.stockQuantity+stockQuantity;
		if ( newQuantity >= 0) {
			this.stockQuantity = newQuantity;
		}
		this.stockQuantity = newQuantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockItem other = (StockItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(StockItem o) {
if(this == o) {
	return 0;
}
if(o != null) {
	return this.compareTo(o);
}
throw new NullPointerException();
}
	@Override
	public String toString() {
		return "item name " + this.name + ", price is " + this.price;
	}

}
