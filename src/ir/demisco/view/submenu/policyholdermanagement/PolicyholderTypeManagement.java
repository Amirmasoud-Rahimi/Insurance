package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Policyholder;
import ir.demisco.service.Validation;

class PolicyholderTypeManagement {
    static void policyholderTypeManagementMenu(Policyholder policyholder) {
        System.out.println("\t\t<< Policyholder Type Management >>");
        System.out.println("1-Legal Policyholder ");
        System.out.println("2-Natural Policyholder ");
        System.out.print("Please Choice Policyholder Type: ");
        switch (BaseEntity.SCANNER.nextInt()) {
            case 1:
                policyholder.setType("Legal");
                break;
            case 2:
                policyholder.setType("Natural");
                break;
            default:
                Validation.invalidNumber();
                break;
        }
    }
}