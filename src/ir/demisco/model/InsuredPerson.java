package ir.demisco.model;

import ir.demisco.model.base.BaseProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * Insured Person is a person who contracts for an insurance policy that
 * indemnifies him against loss of property or life or health
 * @see ir.demisco.model.base.BaseProperty  for InsuredPerson Properties
 */
public class InsuredPerson extends BaseProperty {
    public static Integer choice;
    public static Long insuredPersonCounter = 1L;
    public static List<InsuredPerson> insuredPersonList = new ArrayList<>();

    @Override
    public String toString() {
        return "InsuredPerson{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", family=" + super.getFamily() +
                ", nationalCode=" + super.getNationalCode() +
                ", birthDate=" + super.getBirthDate() +
                ", telephone=" + super.getTelephone() +
                '}' + '\n';
    }
}