package ir.demisco.view.submenu.Insuredgroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredGroup;

import java.util.List;

class DeleteInsuredGroup {
    static void deleteInsuredGroup(List<InsuredGroup> insuredGroups) throws Exception {
        int j = 0;
        if (insuredGroups.isEmpty())
            throw new NullPointerException("Insured Group List Is Empty!");
        System.out.println(insuredGroups);
        System.out.print("Please Enter Insured Group ID: ");
        Byte insuredGroupId = BaseEntity.SCANNER.nextByte();
        if (insuredGroupId < 1 || insuredGroupId >= InsuredGroup.insuredGroupCounter)
            throw new Exception("Invalid ID!");
        for (int i = insuredGroups.size() - 1; i >= 0; i--) {
            if (insuredGroups.get(i).getId().equals(insuredGroupId)) {
                insuredGroups.remove(i);
                System.out.println("Delete Insured Group Finished");
                j++;
            }
        }
        if (j == 0) System.out.println("Insured Group Not Found!");
    }
}