package ir.demisco.service;

import ir.demisco.model.base.BaseEntity;
import ir.demisco.model.OutputFile;
import ir.demisco.model.Contract;
import ir.demisco.model.Claim;

import java.io.FileOutputStream;

public class ConvertToText {
    public static void textContract(Contract contract) throws Exception {
        System.out.println("Please Enter Destination Address (Example 'e:/contract.txt'): ");
        String address = Validation.textFileAddressValidation(BaseEntity.SCANNER.next());
        OutputFile.outputStream = new FileOutputStream(address);
        OutputFile.outputStream.write(contract.textContract().getBytes());
        System.out.println("Write " + address + "Finished ");
    }

    public static void textClaim(Claim claim) throws Exception {
        System.out.println("Please Enter Destination Address (Example 'e:/claim.txt'): ");
        String address = Validation.textFileAddressValidation(BaseEntity.SCANNER.next());
        OutputFile.outputStream = new FileOutputStream(address);
        OutputFile.outputStream.write(claim.textClaim().getBytes());
        System.out.println("Write " + address + "Finished ");
    }
}