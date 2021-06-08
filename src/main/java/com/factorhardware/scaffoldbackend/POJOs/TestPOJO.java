package com.factorhardware.scaffoldbackend.POJOs;

import java.math.BigDecimal;

public class TestPOJO {

    private Integer loanNumber;
    private BigDecimal dollarAmount;

    public TestPOJO() {

    }

    public void setLoanNumber(Integer loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setDollarAmount(BigDecimal dollarAmount) {
        this.dollarAmount = dollarAmount;
    }


    public Integer getLoanNumber() {
        return loanNumber;
    }

    public BigDecimal getDollarAmount() {
        return dollarAmount;
    }


}
