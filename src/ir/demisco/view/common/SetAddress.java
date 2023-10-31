package ir.demisco.view.common;

import ir.demisco.model.base.BaseProperty;
import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.common.Address;

public class SetAddress {
    public static Address setAddress(Address address, BaseProperty baseProperty) {
        address.setId(baseProperty.getId());
        System.out.println("\t\t<< Address >>");
        System.out.println("Address ID: " + address.getId());
        System.out.print("Please Enter Country:  ");
        address.setCountry(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Province: ");
        address.setProvince(BaseEntity.SCANNER.next());
        System.out.print("Please Enter City: ");
        address.setCity(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Alley: ");
        address.setAlley(BaseEntity.SCANNER.next());
        System.out.print("Please Enter Postal Code: ");
        address.setPostalCode(BaseEntity.SCANNER.next());
        System.out.println("Set Address Finished");
        return address;
    }
}