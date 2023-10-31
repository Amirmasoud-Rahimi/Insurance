package ir.demisco.view.submenu.claimmanagement;

import ir.demisco.service.ClaimCalculate;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredPerson;
import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

class SearchClaim {
    static void searchClaim() {
        if (Claim.claimList.isEmpty())
            throw new NullPointerException("Claim List Is Empty! Please Add Claim");
        System.out.print("Please Enter Insured Person National Code: ");
        String code = BaseEntity.SCANNER.next();
        int j = 0;
        for (int i = 0; i < Contract.contractList.size(); i++) {
            for (InsuredPerson insuredPerson : Contract.contractList.get(i).getInsuredPersonList()) {
                if (insuredPerson.getNationalCode().equals(code)) {
                    System.out.println("Name: " + insuredPerson.getName() + " Family: " + insuredPerson.getFamily());
                    ClaimCalculate.claimCalculate(insuredPerson, Contract.contractList.get(i));
                    j++;
                }
            }
        }
        if (j == 0) System.out.println("Insured Person Not Found!");
    }
}