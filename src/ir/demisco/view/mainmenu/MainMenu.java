package ir.demisco.view.mainmenu;

import ir.demisco.view.submenu.insuredpersonmanagement.InsuredPersonManagement;
import ir.demisco.view.submenu.policyholdermanagement.PolicyholderManagement;
import ir.demisco.view.submenu.Insuredgroupmanagement.InsuredGroupManagement;
import ir.demisco.view.submenu.obligationmanagement.ObligationManagement;
import ir.demisco.view.submenu.textfilemanagement.TextFileManagement;
import ir.demisco.view.submenu.agegroupmanagement.AgeGroupManagement;
import ir.demisco.view.submenu.contractmanagement.ContractManagement;
import ir.demisco.view.submenu.claimmanagement.ClaimManagement;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;

/**
 * @author Amirmasoud Rahimi
 * MainMenu Class Show Main Menu of Complementary Health Insurance Programe.
 */
public class MainMenu {
    public static void mainMenu() {
        do {
            System.out.println("\t\t<< Main Menu >>");
            System.out.println("1-Policyholder Management ");
            System.out.println("2-Age Group Management ");
            System.out.println("3-Insured Group Management ");
            System.out.println("4-Obligation Management ");
            System.out.println("5-Contract Management ");
            System.out.println("6-Claim Management ");
            System.out.println("7-Insured Person Management ");
            System.out.println("8-Text File Management ");
            System.out.println("9-Exit ");
            System.out.print("Please Choice A Number: ");
            BaseEntity.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (BaseEntity.choice) {
                    case 1:
                        PolicyholderManagement.policyholderManagementMenu();
                        break;
                    case 2:
                        AgeGroupManagement.ageGroupManagementMenu();
                        break;
                    case 3:
                        InsuredGroupManagement.insuredGroupManagementMenu();
                        break;
                    case 4:
                        ObligationManagement.obligationManagementMenu();
                        break;
                    case 5:
                        ContractManagement.contractManagementMenu();
                        break;
                    case 6:
                        ClaimManagement.claimManagementMenu();
                        break;
                    case 7:
                        InsuredPersonManagement.insuredPersonManagementMenu();
                        break;
                    case 8:
                        TextFileManagement.textFileManagementMenu();
                        break;
                    case 9:
                        System.out.print("Exit");
                        break;
                    default:
                        Validation.invalidNumber();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input Value!");
                break;
            }
        } while (BaseEntity.choice != 9);
    }
}