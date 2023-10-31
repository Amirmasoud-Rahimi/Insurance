package ir.demisco.model.base;

import ir.demisco.model.common.Address;

/**
 * Class Policyholder and Class InsuredPerson extends BaseProperty
 * @see ir.demisco.model.Policyholder
 * @see ir.demisco.model.InsuredPerson
 */
public abstract class BaseProperty {
    private String name, family, nationalCode, birthDate, telephone;
    private Address address;
    private Long id;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getNationalCode() { return nationalCode; }

    public void setNationalCode(String nationalCode) { this.nationalCode = nationalCode; }

    public String getFamily() { return family; }

    public void setFamily(String family) { this.family = family; }

    public String getBirthDate() { return birthDate; }

    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    protected String getTelephone() { return telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", telephone='" + telephone + '\'' +
                ", " + address;
    }
}