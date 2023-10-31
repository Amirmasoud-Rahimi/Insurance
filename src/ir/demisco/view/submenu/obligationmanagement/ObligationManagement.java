package ir.demisco.view.submenu.obligationmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.Obligation;

public class ObligationManagement {
    public static void obligationManagementMenu() {
        do {
            System.out.println("\t\t<< Obligation Management >>");
            System.out.println("1-Add Obligation ");
            System.out.println("2-Delete Obligation ");
            System.out.println("3-Back ");
            System.out.print("Please Choice A Number: ");
            Obligation.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (Obligation.choice) {
                    case 1:
                        AddObligation.addObligation();
                        break;
                    case 2:
                        DeleteObligation.deleteObligation(Obligation.obligationList);
                        break;
                    case 3:
                        break;
                    default:
                        Validation.invalidNumber();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (Obligation.choice != 3);
    }
}