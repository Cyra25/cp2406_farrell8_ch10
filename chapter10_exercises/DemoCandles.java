public class DemoCandles {
    public static void main(String[] args){
        Candle candle = new Candle();
        candle.setColor("Purple");
        candle.setHeight(3);
        System.out.println("Color is "+ candle.getColor() +
                "\nHeight is " + candle.getHeight() +
                "\nPrice is " + candle.getPrice());

        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColor("Red");
        scentedCandle.setHeight(4);
        scentedCandle.setScent("Rose");
        System.out.println("Color is "+ scentedCandle.getColor() +
                "\nHeight is " + scentedCandle.getHeight() +
                "\nScent is " + scentedCandle.getScent() +
                "\nPrice is " + scentedCandle.getPrice());



    }
}
