package ir.demisco.view.submenu.Insuredgroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredGroup;
import ir.demisco.service.Validation;

class AddInsuredGroup {
    static void addInsuredGroup() throws Exception {
        System.out.println("\t\t<< Add Insured Group >>");
        InsuredGroup insuredGroup = new InsuredGroup();
        insuredGroup.setId(InsuredGroup.insuredGroupCounter);
        System.out.println("Insured Group ID: " + insuredGroup.getId());
        System.out.print("From Quantity: ");
        insuredGroup.setFromQuantity(BaseEntity.SCANNER.nextInt());
        System.out.print("To Quantity: ");
        insuredGroup.setToQuantity(Validation.toQuantityValidation(BaseEntity.SCANNER.nextInt(), insuredGroup));
        System.out.print("Rate (Double): ");
        insuredGroup.setRate(BaseEntity.SCANNER.nextDouble());
        InsuredGroup.insuredGroupList.add(insuredGroup);
        InsuredGroup.insuredGroupCounter++;
        System.out.println("Add Insured Group Finished ");
    }
}