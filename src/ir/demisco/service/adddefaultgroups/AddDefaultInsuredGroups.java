package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.InsuredGroup;

public class AddDefaultInsuredGroups {
    public static void addDefaultInsuredGroups() {
        InsuredGroup insuredGroup1 = new InsuredGroup();
        insuredGroup1.setId(InsuredGroup.insuredGroupCounter);
        insuredGroup1.setFromQuantity(1);
        insuredGroup1.setToQuantity(10);
        insuredGroup1.setRate(1.5);
        InsuredGroup.insuredGroupList.add(insuredGroup1);
        InsuredGroup.insuredGroupCounter++;
        InsuredGroup insuredGroup2 = new InsuredGroup();
        insuredGroup2.setId(InsuredGroup.insuredGroupCounter);
        insuredGroup2.setFromQuantity(11);
        insuredGroup2.setToQuantity(50);
        insuredGroup2.setRate(1.2);
        InsuredGroup.insuredGroupList.add(insuredGroup2);
        InsuredGroup.insuredGroupCounter++;
        InsuredGroup insuredGroup3 = new InsuredGroup();
        insuredGroup3.setId(InsuredGroup.insuredGroupCounter);
        insuredGroup3.setFromQuantity(51);
        insuredGroup3.setToQuantity(150);
        insuredGroup3.setRate(1.0);
        InsuredGroup.insuredGroupList.add(insuredGroup3);
        InsuredGroup.insuredGroupCounter++;
        InsuredGroup insuredGroup4 = new InsuredGroup();
        insuredGroup4.setId(InsuredGroup.insuredGroupCounter);
        insuredGroup4.setFromQuantity(151);
        insuredGroup4.setToQuantity(1000);
        insuredGroup4.setRate(0.9);
        InsuredGroup.insuredGroupList.add(insuredGroup4);
        InsuredGroup.insuredGroupCounter++;
        System.out.println("Add Default Insured Groups Finished ");
    }
}