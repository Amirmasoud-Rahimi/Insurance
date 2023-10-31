package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.Contract;

class ContractInsuredManagement {
    static void contractInsuredManagementMenu() throws Exception {
        do {
            System.out.println("\t\t<< Add/Remove Contract Insured >>");
            System.out.println("1.Add New Insured ");
            System.out.println("2.Remove Insured ");
            System.out.println("3.Back ");
            System.out.print("Please Choice A Number: ");
            Contract.iChoice = BaseEntity.SCANNER.nextInt();
            switch (Contract.iChoice) {
                case 1:
                    AddRemoveInsured.addInsuredPerson();
                    break;
                case 2:
                    AddRemoveInsured.removeInsuredPerson();
                    break;
                case 3:
                    break;
                default:
                    Validation.invalidNumber();
                    break;
            }
        } while (Contract.iChoice != 3);
    }
}