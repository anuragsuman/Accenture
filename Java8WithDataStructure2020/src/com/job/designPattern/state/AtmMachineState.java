package com.job.designPattern.state;

public interface AtmMachineState {

  public void insertDebitCard();
  
  public void ejectDebitCard();
  
  public void enterPinAndWithdrawMoney();
}
