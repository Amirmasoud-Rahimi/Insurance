package ir.demisco;

import ir.demisco.service.adddefaultgroups.*;
import ir.demisco.view.mainmenu.MainMenu;

public class Main {
    public static void main(String[] args) {
        try {
            AddDefaultInsuredPerson.addDefaultInsuredPerson();
            AddDefaultInsuredGroups.addDefaultInsuredGroups();
            AddDefaultPolicyholder.addDefaultPolicyholder();
            AddDefaultObligations.addDefaultObligations();
            AddDefaultAgeGroups.addDefaultAgeGroups();
            AddDefaultContract.addDefaultContract();
            AddDefaultClaim.addDefaultClaim();
            MainMenu.mainMenu();
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}