package ir.demisco.model;

import ir.demisco.model.base.BaseProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * Policy-holder is a person or group in whose name an insurance policy is held
 * @see ir.demisco.model.base.BaseProperty  for policy-holders Properties
 */
public class Policyholder extends BaseProperty {
    private String type, officeTel;
    public static Integer choice;
    public static Long policyholderCounter = 1L;
    public static List<Policyholder> policyholderList = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    @Override
    public String toString() {
        return "Policyholder{" +
                "id=" + super.getId() +
                ", type=" + type +
                super.toString() +
                ", officeTel='" + officeTel + '\'' +
                '}' + '\n';
    }
}