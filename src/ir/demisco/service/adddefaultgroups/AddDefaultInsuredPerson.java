package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.common.Address;
import ir.demisco.model.InsuredPerson;

public class AddDefaultInsuredPerson {
    public static void addDefaultInsuredPerson() {
        InsuredPerson insuredPerson1 = new InsuredPerson();
        insuredPerson1.setId(InsuredPerson.insuredPersonCounter);
        insuredPerson1.setName("Amir");
        insuredPerson1.setFamily("Rahimi");
        insuredPerson1.setNationalCode("4610123978");
        insuredPerson1.setBirthDate("1371/10/03");
        insuredPerson1.setTelephone("038-33382542");
        Address address1 = new Address();
        address1.setId(insuredPerson1.getId());
        address1.setCountry("IRAN");
        address1.setProvince("Shahrekord");
        address1.setCity("Shahrekord");
        address1.setAlley("Aboreyhan No.2");
        address1.setPostalCode("88179-84519");
        insuredPerson1.setAddress(address1);
        InsuredPerson.insuredPersonList.add(insuredPerson1);
        InsuredPerson.insuredPersonCounter++;
        InsuredPerson insuredPerson2 = new InsuredPerson();
        insuredPerson2.setId(InsuredPerson.insuredPersonCounter);
        insuredPerson2.setName("Ali");
        insuredPerson2.setFamily("Alavi");
        insuredPerson2.setNationalCode("4620203040");
        insuredPerson2.setBirthDate("1330/05/15");
        insuredPerson2.setTelephone("09134567888");
        Address address2 = new Address();
        address2.setId(insuredPerson2.getId());
        address2.setCountry("IRAN");
        address2.setProvince("Isfahan");
        address2.setCity("Isfahan");
        address2.setAlley("Parvin No.2");
        address2.setPostalCode("88166-12345");
        insuredPerson2.setAddress(address2);
        InsuredPerson.insuredPersonList.add(insuredPerson2);
        InsuredPerson.insuredPersonCounter++;
        System.out.println("Add Default Insured Persons Finished");
    }
}