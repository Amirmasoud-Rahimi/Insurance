package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Policyholder;
import ir.demisco.service.Validation;

public class PolicyholderManagement {
    public static void policyholderManagementMenu() {
        do {
            System.out.println("\t\t<< Policyholder Management >>");
            System.out.println("1-Add Policyholder ");
            System.out.println("2-Edit Policyholder ");
            System.out.println("3-Delete Policyholder ");
            System.out.println("4-Show Legal Policyholder ");
            System.out.println("5-Show Natural Policyholder ");
            System.out.println("6-Back ");
            System.out.print("Please Choice A Number: ");
            Policyholder.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (Policyholder.choice) {
                    case 1:
                        AddPolicyholder.addPolicyholder();
                        break;
                    case 2:
                        EditPolicyholder.editPolicyholder();
                        break;
                    case 3:
                        DeletePolicyholder.deletePolicyholder(Policyholder.policyholderList);
                        break;
                    case 4:
                        ShowPolicyholder.showPolicyholder("Legal");
                        break;
                    case 5:
                        ShowPolicyholder.showPolicyholder("Natural");
                        break;
                    case 6:
                        break;
                    default:
                        Validation.invalidNumber();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (Policyholder.choice != 6);
    }
}