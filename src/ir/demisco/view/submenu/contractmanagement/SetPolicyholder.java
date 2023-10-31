package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Policyholder;

class SetPolicyholder {
    static Long setPolicyholder() throws Exception {
        if (Policyholder.policyholderList.isEmpty())
            throw new NullPointerException("Policyholder List Is Empty!");
        System.out.println(Policyholder.policyholderList);
        System.out.print("Please Enter Policyholder ID: ");
        Long id = BaseEntity.SCANNER.nextLong();
        if (id < 1 || id >= Policyholder.policyholderCounter)
            throw new Exception("Invalid ID!");
        for (int i = 0; i < Policyholder.policyholderList.size(); i++)
            if (Policyholder.policyholderList.get(i).getId().equals(id))
                return id;
        throw new Exception("Policyholder Not Found!");
    }
}