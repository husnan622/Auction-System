
/**
 * Write a description of class Lot here.
 *
 * @author Husnan
 * @version 29 Oktober 2020
 */
public class Lot {
    private final int number;
    private String description;
    private Bid highestBid;

    public Lot(int num, String desc) {
        number = num;
        description = desc;
        highestBid = null;
    }

    public boolean bidFor(Bid b) {
        if (highestBid == null) {
            highestBid = b;
            return true;
        } else if (b.getValue() > highestBid.getValue()) {
            highestBid = b;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String details = number + ": " + description;

        if (highestBid != null)
            details += ", Bid : " + highestBid.getValue();
        else
            details += ", (No bid has been submitted yet)";

        return details;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Bid getHighestBid() {
        return highestBid;
    }
}