package br.uece.eesdevops;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.uece.eesdevops.entity.Account;

public class TestPasscard {
	
	@Test
	public void hasBalance() {
		Account user = new Account();
		Assert.assertEquals(true, user.getBankBalance()>6);
	}

}
