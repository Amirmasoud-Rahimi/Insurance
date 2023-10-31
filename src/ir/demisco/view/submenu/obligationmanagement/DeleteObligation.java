package ir.demisco.view.submenu.obligationmanagement;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.Obligation;

import java.util.List;

class DeleteObligation {
    static void deleteObligation(List<Obligation> obligations) throws Exception {
        int j = 0;
        if (obligations.isEmpty())
            throw new NullPointerException("Obligation List Is Empty!");
        System.out.println(obligations);
        System.out.print("Please Enter Obligation ID:");
        Long obligationId = BaseEntity.SCANNER.nextLong();
        if (obligationId < 1 || obligationId >= Obligation.obligationCounter)
            throw new Exception("Invalid ID!");
        for (int i = obligations.size() - 1; i >= 0; i--) {
            if (obligations.get(i).getId().equals(obligationId)) {
                obligations.remove(i);
                System.out.println("Delete Obligation Finished");
                j++;
            }
        }
        if (j == 0) System.out.println("Obligation Not Found!");
    }
}