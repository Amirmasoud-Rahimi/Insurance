package ir.demisco.view.submenu.agegroupmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.AgeGroup;

class AddAgeGroup {
    static void addAgeGroup() throws Exception {
        System.out.println("\t\t<< Add Age Group >>");
        AgeGroup ageGroup = new AgeGroup();
        ageGroup.setId(AgeGroup.ageGroupCounter);
        System.out.println("Age Group ID: " + ageGroup.getId());
        System.out.print("From Age (0-120): ");
        ageGroup.setFromAge(Validation.fromAgeValidation(BaseEntity.SCANNER.nextInt()));
        System.out.print("To Age (0-120): ");
        ageGroup.setToAge(Validation.toAgeValidation(BaseEntity.SCANNER.nextInt(), ageGroup));
        System.out.print("Rate (Double): ");
        ageGroup.setRate(BaseEntity.SCANNER.nextDouble());
        AgeGroup.ageGroupList.add(ageGroup);
        AgeGroup.ageGroupCounter++;
        System.out.println("Add Age group Finished");
    }
}