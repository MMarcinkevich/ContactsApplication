package com.ivankatunou;

/**
 * Created by st on 15.02.2017.
 */
public class MobilePhone extends Phone {

    String operator;

    MobilePhone(String number, String operator) {
        super.number = number;
        this.operator = operator;
    }

    @Override
    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        super.number = number;
    }

    void setOperator(String operator) {
        this.operator = operator;
    }

    String getOperator() {
        return operator;
    }
}
