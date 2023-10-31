package ir.demisco.view.submenu.insuredpersonmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredPerson;
import ir.demisco.service.Validation;

public class InsuredPersonManagement {
    public static void insuredPersonManagementMenu() {
        do {
            System.out.println("\t\t<< Insured Person Management >>");
            System.out.println("1-Search By Name ");
            System.out.println("2-Search By National Code ");
            System.out.println("3-Back ");
            System.out.print("Please Choice A Number: ");
            InsuredPerson.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (InsuredPerson.choice) {
                    case 1:
                        SearchInsuredPerson.searchByName();
                        break;
                    case 2:
                        SearchInsuredPerson.searchByNationalCode();
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
        } while (InsuredPerson.choice != 3);
    }
}