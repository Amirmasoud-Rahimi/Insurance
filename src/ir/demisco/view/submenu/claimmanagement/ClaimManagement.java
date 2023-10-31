package ir.demisco.view.submenu.claimmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.Claim;

public class ClaimManagement {
    public static void claimManagementMenu() {
        do {
            System.out.println("\t\t<< Claim Management >>");
            System.out.println("1-Add New Claim ");
            System.out.println("2-Search Claim By National Code ");
            System.out.println("3-Back ");
            System.out.print("Please Choice A Number: ");
            Claim.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (Claim.choice) {
                    case 1:
                        AddNewClaim.addNewClaim();
                        break;
                    case 2:
                        SearchClaim.searchClaim();
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
        } while (Claim.choice != 3);
    }
}