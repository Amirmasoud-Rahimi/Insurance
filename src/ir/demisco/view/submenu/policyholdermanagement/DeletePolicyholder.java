package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Policyholder;

import java.util.List;

class DeletePolicyholder {
    static void deletePolicyholder(List<Policyholder> policyholders) throws Exception {
        int j = 0;
        if (policyholders.isEmpty())
            throw new NullPointerException("Policyholder List Is Empty!");
        System.out.println(policyholders);
        System.out.print("Please Enter Policyholder ID: ");
        Long policyholderId = BaseEntity.SCANNER.nextLong();
        if (policyholderId < 1 || policyholderId >= Policyholder.policyholderCounter)
            throw new Exception("Invalid ID!");
        for (int i = policyholders.size() - 1; i >= 0; i--) {
            if (policyholders.get(i).getId().equals(policyholderId)) {
                policyholders.remove(i);
                System.out.println("Delete Policyholder Finished");
                j++;
            }
        }
        if (j == 0) System.out.println("Policyholder Not Found!");
    }
}