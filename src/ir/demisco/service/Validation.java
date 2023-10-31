package ir.demisco.service;

import ir.demisco.model.InsuredGroup;
import ir.demisco.model.AgeGroup;

public class Validation {
    public static byte franchiseValidation(byte franchise) throws Exception {
        if (franchise < 0 || franchise > 100)
            throw new Exception("Invalid Franchise!");
        return franchise;
    }

    public static byte fromAgeValidation(int age) throws Exception {
        if (age < 0 || age > 120)
            throw new Exception("Invalid Age!");
        return (byte) age;
    }

    public static byte toAgeValidation(int age, AgeGroup ageGroup) throws Exception {
        if (age < 0 || age > 120)
            throw new Exception("Invalid Age!");
        else if (age < ageGroup.getFromAge())
            throw new Exception("Invalid Age Value ( toAge < fromAge ) ! ");
        return (byte) age;
    }

    public static int toQuantityValidation(int number, InsuredGroup insuredGroup) throws Exception {
        if (number < insuredGroup.getFromQuantity())
            throw new Exception("Invalid Quantity (toQuantity < fromQuantity)");
        return number;
    }

    static String textFileAddressValidation(String address) throws Exception {
        if (address.length() < 5)
            throw new Exception("Invalid Address!");
        if (!address.substring(address.length() - 4).equals(".txt"))
            throw new Exception("Invalid Address!");
        return address;
    }

    public static String dateValidation(String date) throws Exception {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        if (year < 1278 || year > 1398)
            throw new Exception("Invalid Year!");
        if (month < 1 || month > 12)
            throw new Exception("Invalid Month!");
        if (month <= 6) {
            if (day < 1 || day > 31)
                throw new Exception("Invalid Day!");
        } else if (month < 12) {
            if (day < 1 || day > 30)
                throw new Exception("Invalid Day!");
        } else {
            if (day < 1 || day > 29)
                throw new Exception("Invalid Day!");
        }
        return date;
    }

    public static void invalidNumber() {
        System.out.println("\t\t<< Invalid Number! >>");
        System.out.println(" Please Try Again ");
    }
}