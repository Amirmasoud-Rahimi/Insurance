package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.Obligation;

public class AddDefaultObligations {
    public static void addDefaultObligations() {
        Obligation obligation1 = new Obligation();
        obligation1.setId(Obligation.obligationCounter);
        obligation1.setName("General Surgery");
        obligation1.setServiceName("General Surgery Service");
        obligation1.setFranchise((byte) 20);
        obligation1.setCeiling(100000000L);
        obligation1.setPremiumRate(0.017);
        Obligation.obligationList.add(obligation1);
        Obligation.obligationCounter++;
        Obligation obligation2 = new Obligation();
        obligation2.setId(Obligation.obligationCounter);
        obligation2.setName("Specialized Surgery");
        obligation2.setServiceName("Specialized Surgery Service");
        obligation2.setFranchise((byte) 15);
        obligation2.setCeiling(50000000L);
        obligation2.setPremiumRate(0.019);
        Obligation.obligationList.add(obligation2);
        Obligation.obligationCounter++;
        Obligation obligation3 = new Obligation();
        obligation3.setId(Obligation.obligationCounter);
        obligation3.setName("Dentistry");
        obligation3.setServiceName("Dentistry Service");
        obligation3.setFranchise((byte) 25);
        obligation3.setCeiling(10000000L);
        obligation3.setPremiumRate(0.012);
        Obligation.obligationList.add(obligation3);
        Obligation.obligationCounter++;
        Obligation obligation4 = new Obligation();
        obligation4.setId(Obligation.obligationCounter);
        obligation4.setName("Ambulance");
        obligation4.setServiceName("Ambulance Service");
        obligation4.setFranchise((byte) 30);
        obligation4.setCeiling(2000000L);
        obligation4.setPremiumRate(0.015);
        Obligation.obligationList.add(obligation4);
        Obligation.obligationCounter++;
        System.out.println("Add Default Obligations Finished ");
    }
}