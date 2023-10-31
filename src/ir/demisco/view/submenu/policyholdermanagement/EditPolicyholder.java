package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.view.common.SetAddress;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Policyholder;

class EditPolicyholder {
    static void editPolicyholder() throws Exception {
        int j = 0;
        System.out.println("\t\t<< Edit Policyholder >>");
        if (Policyholder.policyholderList.isEmpty())
            throw new NullPointerException("Policyholder List Is Empty!");
        System.out.println(Policyholder.policyholderList);
        System.out.print("Please Enter Policyholder ID: ");
        Long policyholderId = BaseEntity.SCANNER.nextLong();
        if (policyholderId < 1 || policyholderId >= Policyholder.policyholderCounter)
            throw new Exception("Invalid ID!");
        for (Policyholder policyholder : Policyholder.policyholderList) {
            if (policyholder.getId().equals(policyholderId)) {
                System.out.println("Policyholder ID: " + policyholder.getId());
                System.out.print("Please Enter Policyholder Name: ");
                policyholder.setName(BaseEntity.SCANNER.next());
                if (policyholder.getType().equals("Natural")) {
                    System.out.print("Please Enter Policyholder Family: ");
                    policyholder.setFamily(BaseEntity.SCANNER.next());
                }
                System.out.print("Please Enter Policyholder National ID: ");
                policyholder.setNationalCode(BaseEntity.SCANNER.next());
                System.out.print("Please Enter Policyholder BirthDate: ");
                policyholder.setBirthDate(BaseEntity.SCANNER.next());
                if (policyholder.getType().equals("Legal")) {
                    System.out.print("Please Enter Policyholder Office Telephone: ");
                    policyholder.setOfficeTel(BaseEntity.SCANNER.next());
                } else {
                    System.out.print("Please Enter Policyholder Telephone: ");
                    policyholder.setTelephone(BaseEntity.SCANNER.next());
                }
                policyholder.setAddress(SetAddress.setAddress(policyholder.getAddress(), policyholder));
                System.out.println("Edit Policyholder Finished");
                j++;
            }
        }
        if (j == 0) System.out.println("Policyholder Not Found!");
    }
}