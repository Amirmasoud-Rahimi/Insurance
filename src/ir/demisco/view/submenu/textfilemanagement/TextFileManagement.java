package ir.demisco.view.submenu.textfilemanagement;

import ir.demisco.view.submenu.contractmanagement.SelectContract;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.ConvertToText;
import ir.demisco.service.Validation;
import ir.demisco.model.OutputFile;
import ir.demisco.model.Claim;

public class TextFileManagement {
    public static void textFileManagementMenu() {
        do {
            System.out.println("\t\t<< Text File Management >>");
            System.out.println("1-Contract Text File ");
            System.out.println("2-Claim Text File ");
            System.out.println("3-Back ");
            System.out.print("Please Choice A Number: ");
            OutputFile.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (OutputFile.choice) {
                    case 1:
                        ConvertToText.textContract(SelectContract.selectContract());
                        break;
                    case 2:
                        ConvertToText.textClaim(SelectClaim.selectClaim(Claim.claimList));
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
        } while (OutputFile.choice != 3);
    }
}