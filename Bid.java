
/**
 * Write a description of class Bid here.
 *
 * @author Husnan
 * @version 29 Oktober 2020
 */
public class Bid {
    private final Person bidder;
    private final long value;

    public Bid(Person bidder, long value) {
        this.bidder = bidder;
        this.value = value;
    }

    public Person getBidder() {
        return bidder;
    }

    public long getValue() {
        return value;
    }
}