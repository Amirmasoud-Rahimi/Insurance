package ir.demisco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * An insurance claim is a formal request by a policyholder to an insurance company
 * for coverage or compensation for a covered loss or policy event
 */
public class Claim {
    private String claimDate;
    private Long id, insuredID, contractID, obligationID;
    private Long amount, insurerAmount, insuredAmount, additionalAmount = 0L;
    public Obligation obligation;
    public static Integer choice;
    public static Long claimCounter = 1L;
    public static List<Claim> claimList = new ArrayList<>();

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getInsuredID() {
        return insuredID;
    }

    public void setInsuredID(Long insuredID) {
        this.insuredID = insuredID;
    }

    public void setContractID(Long contractID) {
        this.contractID = contractID;
    }

    public Long getObligationID() {
        return obligationID;
    }

    public void setObligationID(Long obligationID) {
        this.obligationID = obligationID;
    }

    public Long getAmount() { return amount; }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getInsurerAmount() {
        return insurerAmount;
    }

    public void setInsurerAmount(Long insurerAmount) {
        this.insurerAmount = insurerAmount;
    }

    public void setInsuredAmount(Long insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public void setAdditionalAmount(Long additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", insuredID=" + insuredID +
                ", contractID=" + contractID +
                ", obligationID=" + obligationID +
                ", amount=" + amount +
                ", insurerAmount=" + insurerAmount +
                ", insuredAmount=" + insuredAmount +
                ", additionalAmount=" + additionalAmount +
                ", claimDate='" + claimDate + '\'' +
                '}' + '\n';
    }

    public String showClaim() {
        return "Amount= " + amount + '\n' +
                "Insurer Amount= " + insurerAmount + '\n' +
                "Insured Amount= " + insuredAmount + '\n' +
                "Additional Amount= " + additionalAmount;
    }

    public String textClaim() {
        return "\t\t\t<< CLAIM CONTENTS >> " + '\n' +
                "id=" + id + '\n' +
                "Insured ID=" + insuredID + '\n' +
                "Contract ID=" + contractID + '\n' +
                "\t\t<< Obligation Information>>" + '\n' +
                obligation.showObligation() + '\n' +
                "Obligation ID=" + obligationID + '\n' +
                "\t\t<< Amount Report (Base: Rial) >>" + '\n' +
                "Amount=" + amount + '\n' +
                "Insurer Amount=" + insurerAmount + '\n' +
                "Insured Amount=" + insuredAmount + '\n' +
                "Additional Amount=" + additionalAmount + '\n' +
                "Claim Date='" + claimDate + '\'' + '\n';
    }
}