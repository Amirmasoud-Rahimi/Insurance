package ir.demisco.view.submenu.agegroupmanagement;

import ir.demisco.model.AgeGroup;

class ShowAllAgeGroups {
    static void showAllAgeGroups() {
        if (AgeGroup.ageGroupList.isEmpty())
            throw new NullPointerException("Age Group List Is Empty!");
        System.out.println(AgeGroup.ageGroupList);
    }
}