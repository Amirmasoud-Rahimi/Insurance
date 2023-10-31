package ir.demisco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * Insured Group is a number of people or things classed together.
 */
public class InsuredGroup {
    private Byte id;
    private Integer fromQuantity, toQuantity;
    private Double rate;
    public static Integer choice;
    public static Byte insuredGroupCounter = 1;
    public static List<InsuredGroup> insuredGroupList = new ArrayList<>();

    public Byte getId() { return id; }

    public void setId(Byte id) {
        this.id = id;
    }

    public Integer getFromQuantity() { return fromQuantity; }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public Integer getToQuantity() { return toQuantity; }

    public void setToQuantity(Integer toQuantity) {
        this.toQuantity = toQuantity;
    }

    public Double getRate() { return rate; }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "InsuredGroup{" +
                "id=" + id +
                ", fromQuantity=" + fromQuantity +
                ", toQuantity=" + toQuantity +
                ", rate=" + rate +
                '}' + '\n';
    }
}