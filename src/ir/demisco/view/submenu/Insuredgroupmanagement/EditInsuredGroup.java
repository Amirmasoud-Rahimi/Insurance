package ir.demisco.view.submenu.Insuredgroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredGroup;
import ir.demisco.service.Validation;

class EditInsuredGroup {
    static void editInsuredGroup() throws Exception {
        int i = 0;
        if (InsuredGroup.insuredGroupList.isEmpty())
            throw new NullPointerException("Insured Group List Is Empty!");
        System.out.println(InsuredGroup.insuredGroupList);
        System.out.print("Please Enter Insured Group ID:");
        Byte insuredGroupId = BaseEntity.SCANNER.nextByte();
        if (insuredGroupId < 1 || insuredGroupId >= InsuredGroup.insuredGroupCounter)
            throw new Exception("Invalid ID!");
        for (InsuredGroup insuredGroup : InsuredGroup.insuredGroupList) {
            if (insuredGroup.getId().equals(insuredGroupId)) {
                System.out.print("From Quantity: ");
                insuredGroup.setFromQuantity(BaseEntity.SCANNER.nextInt());
                System.out.print("To Quantity: ");
                insuredGroup.setToQuantity(Validation.toQuantityValidation(BaseEntity.SCANNER.nextInt(), insuredGroup));
                System.out.print("Rate (Double): ");
                insuredGroup.setRate(BaseEntity.SCANNER.nextDouble());
                System.out.println("Insured Group Edit Finished ");
                i++;
            }
        }
        if (i == 0) System.out.println("Insured Group Not Found!");
    }
}