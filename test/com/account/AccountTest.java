/**
 * 
 */
package com.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author USER
 *
 */
class AccountTest {
		Account account;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() {
		account = new Account();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void accountObjectIsNotNullTest() {
		assertNotNull(account);
	}
	@Test
	void accountObjectCanRecieveDepositTest() {
		account.depositMoney(2500);
		assertEquals(2500, account.getAccountBalance());
		
		account.depositMoney(5_000);
		assertEquals(7500, account.getAccountBalance());
	}
	
	@Test
	void accountWillNotTakeNegativeAmountTest() {
		account.depositMoney(5000);
		account.depositMoney(-1500);
		int accountBalance = account.getAccountBalance();
		assertEquals(5000, accountBalance);
	}
}
