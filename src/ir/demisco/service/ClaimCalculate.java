package ir.demisco.service;

import ir.demisco.model.InsuredPerson;
import ir.demisco.model.Obligation;
import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

public class ClaimCalculate {
    public static void claimCalculate(InsuredPerson insuredPerson, Contract contract) {
        Obligation obligation = new Obligation();
        Claim claim;
        long remainingCeiling = 0L, additionalAmount;
        double franchiseAmount, remainAmount;
        int i, j = 0, k;
        for (i = 0; i < Claim.claimList.size(); i++)
            if (Claim.claimList.get(i).getInsuredID().equals(insuredPerson.getId())) {
                claim = Claim.claimList.get(i);
                j++;
                for (k = 0; k < contract.getObligationList().size(); k++) {
                    if (contract.getObligationList().get(k).getId().equals(claim.getObligationID())) {
                        obligation = contract.getObligationList().get(k);
                        if (obligation.totalInsurerAmount >= obligation.getCeiling()) {
                            claim.setInsuredAmount(claim.getAmount());
                            claim.setInsurerAmount(0L);
                            remainingCeiling = 0L;
                        } else if (obligation.totalInsurerAmount < obligation.getCeiling()) {
                            franchiseAmount = (obligation.getFranchise() / 100.0) * claim.getAmount();
                            remainAmount = claim.getAmount() - franchiseAmount;
                            if (obligation.totalInsurerAmount + remainAmount > obligation.getCeiling()) {
                                claim.setInsurerAmount(obligation.getCeiling() - obligation.totalInsurerAmount);
                                claim.setInsuredAmount(claim.getAmount() - claim.getInsurerAmount());
                                additionalAmount = (obligation.totalInsurerAmount + (long) remainAmount) - obligation.getCeiling();
                                claim.setAdditionalAmount(additionalAmount);
                                obligation.totalInsurerAmount += claim.getInsurerAmount();
                                remainingCeiling = obligation.getCeiling() - obligation.totalInsurerAmount;
                            } else if ((obligation.totalInsurerAmount + remainAmount) <= obligation.getCeiling()) {
                                claim.setInsuredAmount((long) franchiseAmount);
                                claim.setInsurerAmount((long) remainAmount);
                                obligation.totalInsurerAmount += claim.getInsurerAmount();
                                remainingCeiling = obligation.getCeiling() - obligation.totalInsurerAmount;
                            }
                        }
                        System.out.println("Amount Report (Base: Rial)>>");
                        System.out.println(obligation.showObligation());
                        System.out.println(claim.showClaim());
                        System.out.println("Total Insurer Amount= " + obligation.totalInsurerAmount);
                        System.out.println("Remaining Ceiling: " + remainingCeiling);
                        System.out.println("Claim Date= " + claim.getClaimDate());
                        claim.obligation = obligation;
                    }
                }
            }
        if (j == 0) System.out.println("Claim for Insured Person Not Found!");
        obligation.totalInsurerAmount = 0L;
    }
}