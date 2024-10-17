public class CoinFlip {
    public CoinFlip() {}

    public String flip() {
        if (Math.random() < 0.5) {
            return "heads";
        } else {
            return "tails";
        }
    }

    public double simulate(int flips) {
        double heads = 0;
        for (int i = 0; i < flips; i++) {
            if (flip() == "heads") heads++;
        }
        return heads / flips;
    }
}
