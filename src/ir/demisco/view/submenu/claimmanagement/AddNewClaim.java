package ir.demisco.view.submenu.claimmanagement;

import ir.demisco.view.submenu.contractmanagement.SelectContract;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

class AddNewClaim {
    static void addNewClaim() throws Exception {
        if (Contract.contractList.isEmpty())
            throw new NullPointerException("Contract List Is Empty! Please Create Contract");
        System.out.println("\t\t<< Add New Claim >>");
        Claim claim = new Claim();
        claim.setId(Claim.claimCounter);
        System.out.println("Claim ID: " + claim.getId());
        SelectContract.selectContract(claim);
        System.out.print("Please Enter Claim Date(Example: 1398/08/18): ");
        claim.setClaimDate(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Amount: ");
        claim.setAmount(BaseEntity.SCANNER.nextLong());
        Claim.claimList.add(claim);
        Claim.claimCounter++;
        System.out.println("Add New Claim Finished");
    }
}