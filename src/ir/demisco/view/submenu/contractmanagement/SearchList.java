package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredPerson;
import ir.demisco.model.InsuredGroup;
import ir.demisco.model.Obligation;
import ir.demisco.model.AgeGroup;

import java.util.ArrayList;
import java.util.List;

class SearchList {
    static List<Obligation> searchObligationList(List<Obligation> obligationList) {
        if (obligationList.isEmpty())
            throw new NullPointerException("Obligation List Is Empty!");
        List<Obligation> obligations = new ArrayList<>(obligationList);
        List<Obligation> newList = new ArrayList<>();
        while (obligations.size() != 0) {
            System.out.println(obligations);
            System.out.print("Please Enter Obligation ID (Press '0' To Finish): ");
            Long id = BaseEntity.SCANNER.nextLong();
            if (id >= Obligation.obligationCounter) {
                System.out.println("Invalid ID! ");
                continue;
            }
            if (id > 0) {
                for (int i = obligations.size() - 1; i >= 0; i--) {
                    if (obligations.get(i).getId().equals(id)) {
                        newList.add(obligations.get(i));
                        obligations.remove(i);
                    }
                }
            } else {
                if (newList.isEmpty())
                    throw new NullPointerException("Obligation List Is Empty!");
                return newList;
            }
        }
        return newList;
    }

    static List<AgeGroup> searchAgeGroupList(List<AgeGroup> ageGroupList) {
        if (ageGroupList.isEmpty())
            throw new NullPointerException("Age Group List Is Empty");
        List<AgeGroup> ageGroups = new ArrayList<>(ageGroupList);
        List<AgeGroup> newList = new ArrayList<>();
        while (ageGroups.size() != 0) {
            System.out.println(ageGroups);
            System.out.print("Please Enter Age Group ID (Press '0' To Finish): ");
            Byte id = BaseEntity.SCANNER.nextByte();
            if (id >= AgeGroup.ageGroupCounter) {
                System.out.println("Invalid ID! ");
                continue;
            }
            if (id > 0) {
                for (int i = ageGroups.size() - 1; i >= 0; i--) {
                    if (ageGroups.get(i).getId().equals(id)) {
                        newList.add(ageGroups.get(i));
                        ageGroups.remove(i);
                    }
                }
            } else {
                if (newList.isEmpty())
                    throw new NullPointerException("Age Group List Is Empty!");
                return newList;
            }
        }
        return newList;
    }

    static List<InsuredGroup> searchInsuredGroupList(List<InsuredGroup> insuredGroupList) {
        if (insuredGroupList.isEmpty())
            throw new NullPointerException("Insured Group List Is Empty");
        List<InsuredGroup> insuredGroups = new ArrayList<>(insuredGroupList);
        List<InsuredGroup> newList = new ArrayList<>();
        while (insuredGroups.size() != 0) {
            System.out.println(insuredGroups);
            System.out.print("Please Enter Insured Group ID (Press '0' To Finish): ");
            Byte id = BaseEntity.SCANNER.nextByte();
            if (id >= InsuredGroup.insuredGroupCounter) {
                System.out.println("Invalid ID! ");
                continue;
            }
            if (id > 0) {
                for (int i = insuredGroups.size() - 1; i >= 0; i--) {
                    if (insuredGroups.get(i).getId().equals(id)) {
                        newList.add(insuredGroups.get(i));
                        insuredGroups.remove(i);
                    }
                }
            } else {
                if (newList.isEmpty())
                    throw new NullPointerException("Insured Group List Is Empty!");
                return newList;
            }
        }
        return newList;
    }

    static List<InsuredPerson> searchInsuredPersonList(List<InsuredPerson> insuredPersonList) {
        if (insuredPersonList.isEmpty())
            throw new NullPointerException("Insured Person List Is Empty");
        List<InsuredPerson> insuredPersons = new ArrayList<>(insuredPersonList);
        List<InsuredPerson> newList = new ArrayList<>();
        while (insuredPersons.size() != 0) {
            System.out.println(insuredPersons);
            System.out.print("Please Enter Insured Person ID (Press '0' To Finish): ");
            Long id = BaseEntity.SCANNER.nextLong();
            if (id >= InsuredPerson.insuredPersonCounter) {
                System.out.println("Invalid ID! ");
                continue;
            }
            if (id > 0) {
                for (int i = insuredPersons.size() - 1; i >= 0; i--) {
                    if (insuredPersons.get(i).getId().equals(id)) {
                        newList.add(insuredPersons.get(i));
                        insuredPersons.remove(i);
                    }
                }
            } else {
                if (newList.isEmpty())
                    throw new NullPointerException("Insured Person List Is Empty!");
                return newList;
            }
        }
        return newList;
    }
}