package ir.demisco.view.submenu.contractmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.*;

class NewContract {
    static void newContract() throws Exception {
        System.out.println("\t\t<< Create New Contract >>");
        Contract contract = new Contract();
        contract.setId(Contract.contractCounter);
        System.out.println("Contract ID: " + contract.getId());
        contract.setPolicyholderID(SetPolicyholder.setPolicyholder());
        System.out.print("Please Enter Start Date(Example: 1398/08/30): ");
        contract.setStartDate(BaseEntity.SCANNER.next());
        System.out.print("Please Enter End Date(Example: 1399/08/29): ");
        contract.setEndDate(BaseEntity.SCANNER.next());
        contract.setObligationList(SearchList.searchObligationList(Obligation.obligationList));
        contract.setAgeGroupList(SearchList.searchAgeGroupList(AgeGroup.ageGroupList));
        contract.setInsuredGroupList(SearchList.searchInsuredGroupList(InsuredGroup.insuredGroupList));
        contract.setInsuredPersonList(SearchList.searchInsuredPersonList(InsuredPerson.insuredPersonList));
        Contract.contractList.add(contract);
        Contract.contractCounter++;
    }
}