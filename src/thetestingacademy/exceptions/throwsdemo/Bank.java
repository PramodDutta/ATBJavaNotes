package thetestingacademy.exceptions.throwsdemo;

import thetestingacademy.exceptions.customexcep.CustomException;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank value) throws CustomException { // This method can thorws some Exception Yes?
        System.out.println("Total ");
        if(!(value.currency.equals("USD"))){
            //throw new RuntimeException("Currencies don't Match!");
            //throw new Exception("USD and INR sum is not supported");

            // How JVM will know that USD + INR is not possible?
            //
            //Integer [] i = new Integer[-1];
            throw new CustomException("USD and INR sum is not supported");
        }
        Integer sum = this.amount+value.amount;
        return sum;
    }
}
