package autoBoxingUnboxing;

public class Transaction {
	private Double transaction;
	public Transaction(double transacton) {
		this.transaction = transaction;
	}
	public Transaction addTransaction(double transaction) {
		return new Transaction(transaction);
	}
	public Double getTransaction() {
		return this.transaction;
	}
	public void setTransaction(Double transaction) {
		this.transaction = transaction;
	}
	

}
