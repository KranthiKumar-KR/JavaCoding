package collections.sortedCollections;

import java.util.*;

public class Cart {
	private final String name;
	private final Map<StockItem, Integer> shoppingCart;

	public String getName() {
		return name;
	}

	public Map<StockItem, Integer> getShoppingCart() {
		return shoppingCart;
	}

	public Cart(String name) {
		super();
		this.name = name;
		this.shoppingCart = new LinkedHashMap<>();
	}

	public int addToCart(StockItem item, int quantity, StockList list) {
		if (item != null && quantity > 0) {
			if (list.sellStock(item.getName(), quantity) > 0) {
				int newItemQuantity = shoppingCart.getOrDefault(item, 0);
				shoppingCart.put(item, quantity + newItemQuantity);
				System.out.println(quantity+newItemQuantity + " "+ item.getName() + "s has been added to the cart, price: "
						+ String.format("%.2f",(quantity + newItemQuantity) * item.getPrice()));
				return quantity;
			} else {
				System.out.println(item.getName() + " is out of stock, available stock is: "
						+ list.getItem(item.getName()).getStockQuantity());
			}

		}
		return 0;
	}

	public Map<StockItem, Integer> getMap() {
		return Collections.unmodifiableMap(shoppingCart);
	}

	@Override
	public String toString() {
		String s = "\n shopping cart: " + name + "\n";
		s = s + "no of items in the cart: " + shoppingCart.size();
		double totalPrice = 0;
		for (StockItem item : shoppingCart.keySet()) {
			s = s + "\n item name: " + item.getName() + ", quantity ordered: " + shoppingCart.get(item)
					+ ", total item price: " + String.format("%.2f",(shoppingCart.get(item) * item.getPrice()));
			totalPrice += shoppingCart.get(item) * item.getPrice();
		}
		s = s + "\n and the total cart value is: " + String.format("%.2f", totalPrice);
		return s;
	}

}
