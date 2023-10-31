package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

public class AddDefaultClaim {
    public static void addDefaultClaim() {
        Claim claim = new Claim();
        claim.setId(Claim.claimCounter);
        Contract contract = Contract.contractList.get(0);
        claim.setContractID(contract.getId());
        claim.setInsuredID(1L);
        claim.setClaimDate("1398/08/18");
        claim.setAmount(1250000L);
        claim.setObligationID(4L);
        Claim.claimList.add(claim);
        Claim.claimCounter++;
        System.out.println("Add Default Claim Finished");
    }
}