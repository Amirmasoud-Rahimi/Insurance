package ir.demisco.view.submenu.obligationmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.service.Validation;
import ir.demisco.model.Obligation;

class AddObligation {
    static void addObligation() throws Exception {
        System.out.println("\t\t<< Add Obligation >>");
        Obligation obligation = new Obligation();
        obligation.setId(Obligation.obligationCounter);
        System.out.println("Obligation ID: " + obligation.getId());
        System.out.print("Please Enter Obligation Name: ");
        obligation.setName(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Service Name: ");
        obligation.setServiceName(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Franchise (0 - 100) : ");
        obligation.setFranchise(Validation.franchiseValidation(BaseEntity.SCANNER.nextByte()));
        System.out.print("Please Enter Ceiling: ");
        obligation.setCeiling(BaseEntity.SCANNER.nextLong());
        System.out.print("Please Enter Premium Rate: ");
        obligation.setPremiumRate(BaseEntity.SCANNER.nextDouble());
        Obligation.obligationList.add(obligation);
        Obligation.obligationCounter++;
        System.out.println("Add Obligation Finished ");
    }
}