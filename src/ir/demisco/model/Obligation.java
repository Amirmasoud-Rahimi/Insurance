package ir.demisco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amirmasoud Rahimi
 * Obligation : When a policyholder files a claim under his or her own insurance policy,
 * the insurer has certain obligations to the insured and
 * has a duty to act with good faith in handling that claim.
 */
public class Obligation {
    private Long id, ceiling;
    private String name, serviceName;
    private Byte franchise;
    private Double premiumRate;
    public Long totalInsurerAmount = 0L;
    public static Integer choice;
    public static Long obligationCounter = 1L;
    public static List<Obligation> obligationList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCeiling() {
        return ceiling;
    }

    public void setCeiling(Long ceiling) {
        this.ceiling = ceiling;
    }

    public Byte getFranchise() {
        return franchise;
    }

    public void setFranchise(Byte franchise) {
        this.franchise = franchise;
    }

    public Double getPremiumRate() {
        return premiumRate;
    }

    public void setPremiumRate(Double premiumRate) {
        this.premiumRate = premiumRate;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Obligation{" +
                "id=" + id +
                ", ceiling=" + ceiling + " Rial" +
                ", name='" + name + '\'' +
                ", premiumRate='" + premiumRate + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", franchise=" + franchise + '%' +
                '}' + '\n';
    }

    public String showObligation() {
        return "\t\t<< " + name + " >>" + '\n' +
                "Service Name= " + serviceName + '\n' +
                "Ceiling= " + ceiling + " Rial" + '\n' +
                "Franchise= " + franchise + '%';
    }
}