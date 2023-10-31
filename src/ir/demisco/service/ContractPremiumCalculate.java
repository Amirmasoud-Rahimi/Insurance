package ir.demisco.service;

import ir.demisco.view.submenu.contractmanagement.SelectContract;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Obligation;
import ir.demisco.model.AgeGroup;
import ir.demisco.model.Contract;

public class ContractPremiumCalculate {
    public static void contractPremiumCalculate() throws Exception {
        double yearlyPremium = 0, monthlyPremium, finalPremium = 0;
        Contract contract = SelectContract.selectContract();
        if (contract.getInsuredPersonList().isEmpty())
            throw new NullPointerException("Insured Person List Is Empty!");
        for (Obligation obligation : contract.getObligationList())
            yearlyPremium += obligation.getCeiling() * obligation.getPremiumRate();
        monthlyPremium = yearlyPremium / 12.0;
        System.out.print("Please Enter Today Date (Example: 1398/08/08): ");
        String todayDate = Validation.dateValidation(BaseEntity.SCANNER.next());
        for (int i = 0; i < contract.getInsuredPersonList().size(); i++) {
            System.out.print("Name: " + contract.getInsuredPersonList().get(i).getName() + "/ Family: " + contract.getInsuredPersonList().get(i).getFamily());
            int insuredPersonAge = AgeCalculate.ageCalculate(contract.getInsuredPersonList().get(i), todayDate);
            for (AgeGroup ageGroup : contract.getAgeGroupList()) {
                if (insuredPersonAge >= ageGroup.getFromAge() && insuredPersonAge < ageGroup.getToAge()) {
                    finalPremium += monthlyPremium * ageGroup.getRate();
                    break;
                }
            }
        }
        for (int i = 0; i < contract.getInsuredGroupList().size(); i++) {
            int toQuantity = contract.getInsuredGroupList().get(i).getToQuantity();
            int fromQuantity = contract.getInsuredGroupList().get(i).getFromQuantity();
            if (contract.getInsuredPersonList().size() >= fromQuantity && contract.getInsuredPersonList().size() <= toQuantity)
                finalPremium = finalPremium * contract.getInsuredGroupList().get(i).getRate();
        }
        contract.setMonthlyPremium((long) finalPremium);
        contract.setTotalYearlyPremium((long) finalPremium * 12);
        System.out.println("Monthly Premium: " + contract.getMonthlyPremium());
        System.out.println("Total Yearly Premium: " + contract.getTotalYearlyPremium());
    }
}