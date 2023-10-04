package uk.ac.ncl.teach.tools.acc.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



import uk.ac.ncl.teach.tools.acc.Account;

/** 
 * AccountTest - description.
 *
 */

public class AccountTest {

    /**
     *
     *
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#Account()}.
     */
    @Test
    public final void testAccount() {
        final Account acc = new Account();
        
        assertEquals(0, acc.getBalance());
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#deposit(int)}.
     */
    @Test(expected = IllegalArgumentException.class)
    public final void testDeposit() {
        final Account acc = new Account();
        
        acc.deposit(10);
        
        assertEquals(10, acc.getBalance());
        
        acc.deposit(-10);
        
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#getHolder()}.
     */
    @Test
    public final void testGetHolder() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#getNumber()}.
     */
    @Test
    public final void testGetNumber() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#getBalance()}.
     */
    @Test
    public final void testGetBalance() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#setHolder(java.lang.String)}.
     */
    @Test
    public final void testSetHolder() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#setNumber(int)}.
     */
    @Test
    public final void testSetNumber() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#transferBalance(uk.ac.ncl.teach.tools.acc.Account)}.
     */
    @Test 
    public final void testTransferBalance() {
        final Account acc = new Account();
        
        acc.transferBalance(null); 
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#withdraw(int)}.
     */
    @Test
    public final void testWithdraw() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link uk.ac.ncl.teach.tools.acc.Account#toString()}.
     */
    @Test
    public final void testToString() {
        fail("Not yet implemented"); // TODO
    }

}
