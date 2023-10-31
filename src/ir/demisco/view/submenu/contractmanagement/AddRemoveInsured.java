package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.view.common.SetAddress;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.common.Address;
import ir.demisco.model.InsuredPerson;
import ir.demisco.service.Validation;

class AddRemoveInsured {
    static void addInsuredPerson() throws Exception {
        InsuredPerson insuredPerson = new InsuredPerson();
        insuredPerson.setId(InsuredPerson.insuredPersonCounter);
        System.out.println("Insured Person ID: " + insuredPerson.getId());
        System.out.print("Please Enter Insured Person Name: ");
        insuredPerson.setName(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Insured Person Family: ");
        insuredPerson.setFamily(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Insured Person National Code: ");
        insuredPerson.setNationalCode(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Insured Person BirthDate: ");
        insuredPerson.setBirthDate(Validation.dateValidation(BaseEntity.SCANNER.next()));
        System.out.print("Please Enter Insured Person Telephone: ");
        insuredPerson.setTelephone(BaseEntity.SCANNER.next());
        Address address = new Address();
        insuredPerson.setAddress(SetAddress.setAddress(address, insuredPerson));
        InsuredPerson.insuredPersonList.add(insuredPerson);
        InsuredPerson.insuredPersonCounter++;
        System.out.println("Add Insured Person Finished");
    }

    static void removeInsuredPerson() throws Exception {
        int j = 0;
        if (InsuredPerson.insuredPersonList.size() == 0)
            throw new NullPointerException("Insured Person List Is Empty!");
        System.out.println(InsuredPerson.insuredPersonList);
        System.out.print("Please Enter Insured Person ID: ");
        Long code = BaseEntity.SCANNER.nextLong();
        if (code < 1 || code >= InsuredPerson.insuredPersonCounter)
            throw new Exception("Invalid ID!");
        for (int i = InsuredPerson.insuredPersonList.size() - 1; i >= 0; i--) {
            if (InsuredPerson.insuredPersonList.get(i).getId().equals(code)) {
                InsuredPerson.insuredPersonList.remove(i);
                System.out.println("Insured Person Remove");
                j++;
            }
        }
        if (j == 0) System.out.println("Insured Person Not Found!");
    }
}