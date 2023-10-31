package ir.demisco.service.adddefaultgroups;

import ir.demisco.model.*;

public class AddDefaultContract {
    public static void addDefaultContract() {
        Contract contract = new Contract();
        contract.setId(Contract.contractCounter);
        contract.setPolicyholderID(1L);
        contract.setStartDate("1398/09/30");
        contract.setEndDate("1399/09/29");
        contract.setObligationList(Obligation.obligationList);
        contract.setAgeGroupList(AgeGroup.ageGroupList);
        contract.setInsuredGroupList(InsuredGroup.insuredGroupList);
        contract.setInsuredPersonList(InsuredPerson.insuredPersonList);
        Contract.contractList.add(contract);
        Contract.contractCounter++;
        System.out.println("Add Default Contract Finished");
    }
}