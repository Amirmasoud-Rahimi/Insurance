package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.model.Policyholder;

class ShowPolicyholder {
    static void showPolicyholder(String type) {
        if (Policyholder.policyholderList.isEmpty())
            throw new NullPointerException("Policyholder List Is Empty!");
        int i = 0;
        for (Policyholder policyholder : Policyholder.policyholderList) {
            if ((policyholder.getType()).equals(type)) {
                System.out.println(policyholder);
                i++;
            }
        }
        if (i == 0) System.out.println(type + " Policyholder Not Found! ");
    }
}