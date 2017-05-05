package collections.sortedCollections;

import java.util.*;

public class StockList {
	Map<String, StockItem> list;
	

	public StockList() {
		super();
		list = new LinkedHashMap<>();
	}

	public int addStock(StockItem item) {
		if (item != null) {
			StockItem newItem = list.getOrDefault(item.getName(), item);
			if (newItem != item) {
				item.modifyStockQuantity(newItem.getStockQuantity()+item.getStockQuantity());
			}
			list.put(item.getName(), item);
			return item.getStockQuantity();
		}
		return 0;
	}
	
	public int sellStock(String itemName, int quantity) {
		if (quantity != 0 && list.get(itemName).getStockQuantity() >= quantity && quantity >0) {
			list.get(itemName).modifyStockQuantity(-quantity);
			return quantity;
			}
		return 0;
	}
	public StockItem getItem(String item) {
		return list.get(item);
	}
	public Map<String, StockItem> getItemList() {
		return Collections.unmodifiableMap(list);
	}
	@Override
	public String toString() {
		String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getStockQuantity();

            s = s + stockItem + ". There are " + stockItem.getStockQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f", totalCost);
	}
	
}
