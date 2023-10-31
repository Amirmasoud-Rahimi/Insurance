package ir.demisco.view.submenu.agegroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.AgeGroup;

import java.util.List;

class DeleteAgeGroup {
    static void deleteAgeGroup(List<AgeGroup> ageGroups) throws Exception {
        int j = 0;
        if (ageGroups.isEmpty())
            throw new NullPointerException("Age Group List Is Empty!");
        System.out.println("\t\t<< Delete Age Group >>");
        System.out.println(ageGroups);
        System.out.print("Please Enter Age Group ID: ");
        Byte ageGroupId = BaseEntity.SCANNER.nextByte();
        if (ageGroupId < 1 || ageGroupId >= AgeGroup.ageGroupCounter)
            throw new Exception("Invalid ID!");
        for (int i = ageGroups.size() - 1; i >= 0; i--) {
            if (ageGroups.get(i).getId().equals(ageGroupId)) {
                AgeGroup.ageGroupList.remove(ageGroups.get(i));
                System.out.println("Age Group Deleted");
                j++;
            }
        }
        if (j == 0) System.out.println("Age Group Not Found!");
    }
}