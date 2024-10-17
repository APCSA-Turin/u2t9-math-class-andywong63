public class Main {
    public static void main(String[] args) {
        double x = Math.random() * 65;
        double y = Math.random() * 75 + 25;

        int randomNum = (int) (Math.random() * 36) + 50;

        LuckyNumbers lottery = new LuckyNumbers();
        String luckyNums = lottery.getLuckyNumbers();
        System.out.println(luckyNums);

        Circle circle = new Circle(5);
        System.out.println(circle.getInfo());
        circle.setRadius(9.2);
        System.out.println(circle.getInfo());

        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println(triangle.hypotenuse());
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        System.out.println(triangle2.hypotenuse());

        CoinFlip coin = new CoinFlip();
        System.out.println(coin.simulate(1000));
    }
}