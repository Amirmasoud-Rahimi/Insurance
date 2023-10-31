package ir.demisco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * Age Group is a number of people or things classed together as being of similar age.
 */
public class AgeGroup {
    private Byte id, fromAge, toAge;
    private Double rate;
    public static Integer choice;
    public static Byte ageGroupCounter = 1;
    public static List<AgeGroup> ageGroupList = new ArrayList<>();
    public static final Byte Max_Age = 120;

    public Byte getId() { return id; }

    public void setId(Byte id) { this.id = id; }

    public Byte getFromAge() { return fromAge; }

    public void setFromAge(Byte fromAge) { this.fromAge = fromAge; }

    public Byte getToAge() { return toAge; }

    public void setToAge(Byte toAge) { this.toAge = toAge; }

    public Double getRate() { return rate; }

    public void setRate(Double rate) { this.rate = rate; }

    @Override
    public String toString() {
        return "AgeGroup{" +
                "id=" + id +
                ", fromAge=" + fromAge +
                ", toAge (Max Age: 120)=" + toAge +
                ", rate=" + rate +
                '}' + '\n';
    }
}