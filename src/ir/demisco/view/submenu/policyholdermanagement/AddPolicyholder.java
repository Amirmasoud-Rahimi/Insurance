package ir.demisco.view.submenu.policyholdermanagement;

import ir.demisco.view.common.SetAddress;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.common.Address;
import ir.demisco.model.Policyholder;

class AddPolicyholder {
    static void addPolicyholder() {
        Policyholder policyholder = new Policyholder();
        PolicyholderTypeManagement.policyholderTypeManagementMenu(policyholder);
        if (policyholder.getType() != null) {
            System.out.println("\t\t<< Add " + policyholder.getType() + " Policyholder >>");
            policyholder.setId(Policyholder.policyholderCounter);
            System.out.println("Policyholder ID: " + policyholder.getId());
            System.out.print("Please Enter Policyholder Name: ");
            policyholder.setName(BaseEntity.SCANNER.next());
            if (policyholder.getType().equals("Natural")) {
                System.out.print("Please Enter Policyholder Family: ");
                policyholder.setFamily(BaseEntity.SCANNER.next());
            }
            System.out.print("Please Enter Policyholder National ID: ");
            policyholder.setNationalCode(BaseEntity.SCANNER.next());
            System.out.print("Please Enter Policyholder BirthDate(Example: 1370/07/07): ");
            policyholder.setBirthDate(BaseEntity.SCANNER.next());
            if (policyholder.getType().equals("Legal")) {
                System.out.print("Please Enter Policyholder Office Telephone: ");
                policyholder.setOfficeTel(BaseEntity.SCANNER.next());
            } else {
                System.out.print("Please Enter Policyholder Telephone: ");
                policyholder.setTelephone(BaseEntity.SCANNER.next());
            }
            Address address = new Address();
            policyholder.setAddress(SetAddress.setAddress(address, policyholder));
            Policyholder.policyholderList.add(policyholder);
            Policyholder.policyholderCounter++;
            System.out.println("Add Policyholder Finished");
        }
    }
}