package com.capgemini.bankapp.service;

import java.util.List;

import com.capgemini.banapp.exception.BankAccountNotFoundException;
import com.capgemini.banapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountService {
	

	public boolean addNewBankAccount(BankAccount account);

}
