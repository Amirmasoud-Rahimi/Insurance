package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.service.ContractPremiumCalculate;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.Contract;

public class ContractManagement {
    public static void contractManagementMenu() {
        do {
            System.out.println("\t\t<< Contract Management >>");
            System.out.println("1.New Contract ");
            System.out.println("2.Add/Remove Contract Insured  ");
            System.out.println("3.Calculate Contract Premium ");
            System.out.println("4.Back ");
            System.out.print("Please Choice A Number: ");
            Contract.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (Contract.choice) {
                    case 1:
                        NewContract.newContract();
                        break;
                    case 2:
                        ContractInsuredManagement.contractInsuredManagementMenu();
                        break;
                    case 3:
                        ContractPremiumCalculate.contractPremiumCalculate();
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
        } while (Contract.choice != 4);
    }
}