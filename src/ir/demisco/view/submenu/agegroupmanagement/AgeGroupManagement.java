package ir.demisco.view.submenu.agegroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.AgeGroup;

public class AgeGroupManagement {
    public static void ageGroupManagementMenu() {
        do {
            System.out.println("\t\t<< Age Group Management >>");
            System.out.println("1-Add Age Group ");
            System.out.println("2-Delete Age Group ");
            System.out.println("3-Show All ");
            System.out.println("4-Back ");
            System.out.print("Please Choice A Number: ");
            AgeGroup.choice = BaseEntity.SCANNER.nextInt();
            try {
                switch (AgeGroup.choice) {
                    case 1:
                        AddAgeGroup.addAgeGroup();
                        break;
                    case 2:
                        DeleteAgeGroup.deleteAgeGroup(AgeGroup.ageGroupList);
                        break;
                    case 3:
                        ShowAllAgeGroups.showAllAgeGroups();
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
        } while (AgeGroup.choice != 4);
    }
}