package ir.demisco.view.submenu.textfilemanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Claim;

import java.util.List;

class SelectClaim {
    static Claim selectClaim(List<Claim> claims) throws Exception {
        if (claims.isEmpty())
            throw new NullPointerException("Claim List Is Empty!");
        System.out.println(claims);
        System.out.print("Please Enter Claim ID: ");
        Long id = BaseEntity.SCANNER.nextLong();
        if (id < 1 || id >= Claim.claimCounter)
            throw new Exception("Invalid ID!");
        for (Claim claim : claims)
            if (claim.getId().equals(id)) {
                if (claim.getInsurerAmount() == null)
                    throw new Exception("Claim Property Is Null");
                return claim;
            }
        throw new Exception("Claim Not Found!");
    }
}