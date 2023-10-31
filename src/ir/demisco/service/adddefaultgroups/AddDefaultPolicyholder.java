package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.common.Address;
import ir.demisco.model.Policyholder;

public class AddDefaultPolicyholder {
    public static void addDefaultPolicyholder() {
        Policyholder policyholder1 = new Policyholder();
        policyholder1.setType("Legal");
        policyholder1.setId(Policyholder.policyholderCounter);
        policyholder1.setName("Demisco");
        policyholder1.setNationalCode("031-1234567");
        policyholder1.setBirthDate("1384/04/04");
        policyholder1.setOfficeTel("031-31319277");
        Address address1 = new Address();
        address1.setId(policyholder1.getId());
        address1.setCountry("IRAN");
        address1.setProvince("Isfahan");
        address1.setCity("Isfahan");
        address1.setAlley("Parvin No.5");
        address1.setPostalCode("88154-69854");
        policyholder1.setAddress(address1);
        Policyholder.policyholderList.add(policyholder1);
        Policyholder.policyholderCounter++;
        Policyholder policyholder2 = new Policyholder();
        policyholder2.setType("Natural");
        policyholder2.setId(Policyholder.policyholderCounter);
        policyholder2.setName("Amirmasoud");
        policyholder2.setFamily("Rahimi");
        policyholder2.setNationalCode("4610651945");
        policyholder2.setBirthDate("1371/10/03");
        policyholder2.setTelephone("09137039825");
        Address address2 = new Address();
        address2.setId(policyholder2.getId());
        address2.setCountry("IRAN");
        address2.setProvince("Shahrekord");
        address2.setCity("Shahrekord");
        address2.setAlley("Aboreyhan No.2");
        address2.setPostalCode("88179-84519");
        policyholder2.setAddress(address2);
        Policyholder.policyholderList.add(policyholder2);
        Policyholder.policyholderCounter++;
        System.out.println("Add Default Policyholders Finished");
    }
}