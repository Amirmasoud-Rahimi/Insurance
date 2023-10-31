package ir.demisco.view.submenu.insuredpersonmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.InsuredPerson;

class SearchInsuredPerson {
    static void searchByName() {
        if (InsuredPerson.insuredPersonList.isEmpty())
            throw new NullPointerException("Insured Person List Is Empty!");
        System.out.print("Please Enter Insured Person Name: ");
        String name = BaseEntity.SCANNER.next();
        int j = 0;
        for (InsuredPerson insuredPerson : InsuredPerson.insuredPersonList) {
            if (insuredPerson.getName().equals(name)) {
                System.out.print(insuredPerson);
                j++;
            }
        }
        if (j == 0) System.out.println("Insured Person Not Found!");
    }

    static void searchByNationalCode() {
        if (InsuredPerson.insuredPersonList.isEmpty())
            throw new NullPointerException("Insured Person List Is Empty!");
        System.out.print("Please Enter Insured Person National Code: ");
        String nationalCode = BaseEntity.SCANNER.next();
        int j = 0;
        for (InsuredPerson insuredPerson : InsuredPerson.insuredPersonList) {
            if (insuredPerson.getNationalCode().equals(nationalCode)) {
                System.out.print(insuredPerson);
                j++;
            }
        }
        if (j == 0) System.out.println("Insured Person Not Found!");
    }
}