package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

public class SelectContract {
    public static Contract selectContract() throws Exception {
        if (Contract.contractList.isEmpty())
            throw new NullPointerException("Contract List Is Empty!");
        for (int i = 0; i < Contract.contractList.size(); i++)
            System.out.println(Contract.contractList.get(i).showContract());
        System.out.print("Please Choice Contract ID : ");
        Long id = BaseEntity.SCANNER.nextLong();
        if (id < 1 || id >= Contract.contractCounter)
            throw new Exception("Invalid ID!");
        for (int i = 0; i < Contract.contractList.size(); i++)
            if (Contract.contractList.get(i).getId().equals(id)) {
                return Contract.contractList.get(i);
            }
        throw new Exception("Contract Not Found!");
    }

    public static void selectContract(Claim claim) throws Exception {
        for (int i = 0; i < Contract.contractList.size(); i++)
            System.out.println(Contract.contractList.get(i).showContract());
        System.out.print("Please Enter Contract ID : ");
        Long id = BaseEntity.SCANNER.nextLong();
        if (id < 1 || id >= Contract.contractCounter)
            throw new Exception("Invalid ID!");
        for (int i = 0; i < Contract.contractList.size(); i++) {
            if (Contract.contractList.get(i).getId().equals(id)) {
                if (Contract.contractList.get(i).getInsuredPersonList().isEmpty())
                    throw new NullPointerException("Insured Person List Is Empty!");
                if (Contract.contractList.get(i).getObligationList().isEmpty())
                    throw new NullPointerException("Obligation List Is Empty!");
                claim.setContractID(Contract.contractList.get(i).getId());
                System.out.println(Contract.contractList.get(i).getInsuredPersonList());
                System.out.print("Please Enter Insured ID: ");
                long Id = BaseEntity.SCANNER.nextLong();
                if (Id < 1 || Id > Contract.contractList.get(i).getInsuredPersonList().size())
                    throw new Exception("Invalid ID!");
                claim.setInsuredID(Id);
                System.out.println(Contract.contractList.get(i).getObligationList());
                System.out.print("Please Enter Obligation ID: ");
                Long code = BaseEntity.SCANNER.nextLong();
                if (code < 1 || code > Contract.contractList.get(i).getObligationList().size())
                    throw new Exception("Invalid ID!");
                claim.setObligationID(code);
            }
        }
    }
}