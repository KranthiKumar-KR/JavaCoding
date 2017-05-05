package collections.sortedCollections;

public class Main {
	private static StockList stockList= new StockList();

	public static void main(String[] args) {
		StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
        temp = new StockItem("bread", 1.00, 200);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);
        
        //printing stocklist
        System.out.println(stockList);
        
        Cart cart = new Cart("kranthi");
		System.out.println("items in your cart");
		
        cart.addToCart(stockList.getItem("bread"), 10, stockList);
        cart.addToCart(stockList.getItem("juice"), 4, stockList);
        cart.addToCart(stockList.getItem("car"), 1, stockList);
        cart.addToCart(stockList.getItem("cake"), 4, stockList);
        
        checkout(cart, true);
        
        Cart cart2 = new Cart("kumar");
		System.out.println("items in your cart");
		
        cart2.addToCart(stockList.getItem("bread"), 10, stockList);
        cart2.addToCart(stockList.getItem("juice"), 4, stockList);
        cart2.addToCart(stockList.getItem("car"), 3, stockList);
        cart2.addToCart(stockList.getItem("cake"), 3, stockList);
        checkout(cart2, true);
	}
	
	private static void checkout(Cart cart, boolean confirm) {
if(confirm) {
	System.out.println(cart);
	return;
	}
System.out.println("some unexpected items in the cart");
}

}
