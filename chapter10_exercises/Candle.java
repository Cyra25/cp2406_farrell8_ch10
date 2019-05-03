public class Candle {
    public String color;
    public int height;
    public double price;
    public double pricePerInch;

    public double getPrice() {
        this.price = pricePerInch * this.height;
        return price;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        pricePerInch = 2;
    }

}
