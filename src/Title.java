import java.util.HashMap;
import java.util.Map;

public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574;

    private static final Map<String, Double> literatureValues = new HashMap<>();

    static {
        literatureValues.put("BI", 3.0);
        literatureValues.put("TE", 3.0);
        literatureValues.put("LYRIK", 6.0);
        literatureValues.put("SKØN", 1.7);
        literatureValues.put("FAG", 1.0);
    }

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        return literatureValues.getOrDefault(literatureType, 1.0);
    }
}