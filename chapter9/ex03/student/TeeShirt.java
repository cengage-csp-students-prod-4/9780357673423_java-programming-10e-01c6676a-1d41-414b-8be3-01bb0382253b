public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price = 19.99;

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setSize(String size) {
        this.size = size;
        if ("XXL".equalsIgnoreCase(size) ||
            "XXXL".equalsIgnoreCase(size)) {
            price = 22.99;
        } else {
            price = 19.99;
        }
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}