package alex_olhovskiy.OOP_Seminar6HT;

public class Order {
	private String clientName;
    private String product;
    private int qnt;
    private double price;

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
}
