package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.AgeGroup;

public class AddDefaultAgeGroups {
    public static void addDefaultAgeGroups() {
        AgeGroup ageGroup1 = new AgeGroup();
        ageGroup1.setId(AgeGroup.ageGroupCounter);
        ageGroup1.setFromAge((byte) 0);
        ageGroup1.setToAge((byte) 60);
        ageGroup1.setRate(1.0);
        AgeGroup.ageGroupList.add(ageGroup1);
        AgeGroup.ageGroupCounter++;
        AgeGroup ageGroup2 = new AgeGroup();
        ageGroup2.setId(AgeGroup.ageGroupCounter);
        ageGroup2.setFromAge((byte) 60);
        ageGroup2.setToAge((byte) 70);
        ageGroup2.setRate(1.3);
        AgeGroup.ageGroupList.add(ageGroup2);
        AgeGroup.ageGroupCounter++;
        AgeGroup ageGroup3 = new AgeGroup();
        ageGroup3.setId(AgeGroup.ageGroupCounter);
        ageGroup3.setFromAge((byte) 70);
        ageGroup3.setToAge((byte) 80);
        ageGroup3.setRate(1.6);
        AgeGroup.ageGroupList.add(ageGroup3);
        AgeGroup.ageGroupCounter++;
        AgeGroup ageGroup4 = new AgeGroup();
        ageGroup4.setId(AgeGroup.ageGroupCounter);
        ageGroup4.setFromAge((byte) 80);
        ageGroup4.setToAge(AgeGroup.Max_Age);
        ageGroup4.setRate(2.0);
        AgeGroup.ageGroupList.add(ageGroup4);
        AgeGroup.ageGroupCounter++;
        System.out.println("Add Default Age Groups Finished");
    }
}