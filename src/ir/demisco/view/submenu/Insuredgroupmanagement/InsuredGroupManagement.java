package ir.demisco.view.submenu.Insuredgroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredGroup;
import ir.demisco.service.Validation;

public class InsuredGroupManagement {
    public static void insuredGroupManagementMenu() {
        do {
            System.out.println("\t\t<< Insured Group Management >>");
            System.out.println("1-Add Insured Group ");
            System.out.println("2-Edit Insured Group ");
            System.out.println("3-Delete Insured Group ");
            System.out.println("4-Back ");
            System.out.print("Please Choice A Number: ");
            InsuredGroup.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (InsuredGroup.choice) {
                    case 1:
                        AddInsuredGroup.addInsuredGroup();
                        break;
                    case 2:
                        EditInsuredGroup.editInsuredGroup();
                        break;
                    case 3:
                        DeleteInsuredGroup.deleteInsuredGroup(InsuredGroup.insuredGroupList);
                        break;
                    case 4:
                        break;
                    default:
                        Validation.invalidNumber();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (InsuredGroup.choice != 4);
    }
}