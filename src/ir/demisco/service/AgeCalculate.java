package ir.demisco.service;

import ir.demisco.model.InsuredPerson;

class AgeCalculate {
    static int ageCalculate(InsuredPerson insuredPerson, String todayDate) {
        String birthDate = insuredPerson.getBirthDate();
        int nowYear = Integer.parseInt(todayDate.substring(0, 4));
        int nowMonth = Integer.parseInt(todayDate.substring(5, 7));
        int nowDay = Integer.parseInt(todayDate.substring(8, 10));
        int birthYear = Integer.parseInt(birthDate.substring(0, 4));
        int birthMonth = Integer.parseInt(birthDate.substring(5, 7));
        int birthDay = Integer.parseInt(birthDate.substring(8, 10));
        int day = 0, month, year;
        if (birthDay <= nowDay)
            day = nowDay - birthDay;
        else {
            nowMonth = nowMonth - 1;
            if (nowMonth <= 6) {
                nowDay = nowDay + 31;
                day = nowDay - birthDay;
            } else if (nowMonth <= 11) {
                nowDay = nowDay + 30;
                day = nowDay - birthDay;
            } else if (nowMonth == 12) {
                nowDay = nowDay + 29;
                day = nowDay - birthDay;
            }
        }
        if (birthMonth <= nowMonth)
            month = nowMonth - birthMonth;
        else {
            nowYear = nowYear - 1;
            nowMonth = nowMonth + 12;
            month = nowMonth - birthMonth;
        }
        year = nowYear - birthYear;
        System.out.println(" >> Year: " + year + " , " + "Month: " + month + " , " + "Day: " + day);
        return year;
    }
}