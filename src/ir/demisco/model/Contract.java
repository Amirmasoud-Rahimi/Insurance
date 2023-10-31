package ir.demisco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * An insurance contract is a document representing the agreement
 * between an insurance company and the insured
 */
public class Contract {
    private Long id, policyholderID, monthlyPremium, totalYearlyPremium;
    private List<InsuredPerson> insuredPersonList;
    private List<InsuredGroup> insuredGroupList;
    private List<Obligation> obligationList;
    private List<AgeGroup> ageGroupList;
    private String startDate, endDate;
    public static Integer choice, iChoice;
    public static Long contractCounter = 1L;
    public static List<Contract> contractList = new ArrayList<>();

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public void setPolicyholderID(Long policyholderID) { this.policyholderID = policyholderID; }

    public Long getMonthlyPremium() { return monthlyPremium; }

    public void setMonthlyPremium(Long monthlyPremium) { this.monthlyPremium = monthlyPremium; }

    public Long getTotalYearlyPremium() { return totalYearlyPremium; }

    public void setTotalYearlyPremium(Long totalYearlyPremium) { this.totalYearlyPremium = totalYearlyPremium; }

    public List<InsuredPerson> getInsuredPersonList() { return insuredPersonList; }

    public void setInsuredPersonList(List<InsuredPerson> insuredPersonList) { this.insuredPersonList = insuredPersonList; }

    public List<InsuredGroup> getInsuredGroupList() { return insuredGroupList; }

    public void setInsuredGroupList(List<InsuredGroup> insuredGroupList) { this.insuredGroupList = insuredGroupList; }

    public List<Obligation> getObligationList() { return obligationList; }

    public void setObligationList(List<Obligation> obligationList) { this.obligationList = obligationList; }

    public List<AgeGroup> getAgeGroupList() { return ageGroupList; }

    public void setAgeGroupList(List<AgeGroup> ageGroupList) { this.ageGroupList = ageGroupList; }

    public void setStartDate(String startDate) { this.startDate = startDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", policyholderID=" + policyholderID +
                ", monthlyPremium=" + monthlyPremium +
                ", totalYearlyPremium=" + totalYearlyPremium +
                ", obligationList=" + obligationList +
                ", ageGroupList=" + ageGroupList +
                ", insuredGroupList=" + insuredGroupList +
                ", insuredPersonList=" + insuredPersonList +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}' + '\n';
    }

    public String showContract() {
        return "Contract{" +
                "id=" + id +
                ", policyholderID=" + policyholderID +
                ", monthlyPremium=" + monthlyPremium +
                ", totalYearlyPremium=" + totalYearlyPremium +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}' + '\n';
    }

    public String textContract() {
        return "\t\t\t<< CONTRACT CONTENTS >>" + '\n' +
                "id= " + id + '\n' +
                "Policyholder ID= " + policyholderID + '\n' +
                "Monthly Premium= " + monthlyPremium + '\n' +
                "Total Yearly Premium= " + totalYearlyPremium + '\n' +
                "Start Date= '" + startDate + '\'' + '\n' +
                "End Date= '" + endDate + '\'' + '\n' +
                "\t\t\t<< OBLIGATION LIST >>" + '\n' +
                "obligationList= " + obligationList + '\n' +
                "\t\t\t<< AGE GROUP LIST >>" + '\n' +
                "ageGroupList= " + ageGroupList + '\n' +
                "\t\t\t<< INSURED GROUP LIST >>" + '\n' +
                "insuredGroupList= " + insuredGroupList + '\n' +
                "\t\t\t<< INSURED PERSON LIST >>" + '\n' +
                "insuredPersonList= " + insuredPersonList + '\n' +
                '}' + '\n';
    }
}