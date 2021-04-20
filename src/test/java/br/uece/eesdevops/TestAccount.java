package br.uece.eesdevops;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.uece.eesdevops.entity.Account;

public class TestAccount {

	Account account = new Account();

	@Test
	public void hasUser() {
		Assert.assertEquals(true, account.getId() > 0);
	}
	
	@Test
	public void debitBalance() {
		account.setBankBalance(200.0);
		account.debitBankBalance(6.0);
		account.getBankBalance();

		Assert.assertEquals(true, account.getBankBalance()>6.0);
		Assert.fail("Saldo Insuficiente");
	}
}
