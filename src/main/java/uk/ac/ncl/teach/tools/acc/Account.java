package uk.ac.ncl.teach.tools.acc;

/** 
 * Account - example Account class to demonstrate java tools.
 *
 */

public final class Account {
    private String holder;
    private int number;
    private int balance;
    
    /**
     * Default (no-argument) constructor.
     *
     */
    public Account() { }
    
    /** 
     * Deposit the given amount into the account.
     *
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the <code>amount</code> < 0
     */
    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("invalid amount: " + amount);
        }
        
        balance += amount;
    }

    /**
     * Get the <code>holder</code> field.
     *
     * @return Returns the <code>holder</code> field
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Get the <code>number</code> field.
     *
     * @return Returns the <code>number</code> field
     */
    public int getNumber() {
        return number;
    }

    /**
     * Get the <code>balance</code> field.
     *
     * @return Returns the <code>balance</code> field
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Set the <code>holder</code> field.
     *
     * @param holder Set the <code>holder</code> field 
     * to <code>holder</code>
     * @throws NullPointerException if <code>holder</code> is 
     * <code>null</code>
     * @throws IllegalArgumentException if <code>holder</code> is empty
     */
    public void setHolder(String holder) {
        if (holder.length() == 0)
            throw new IllegalArgumentException("empty holder");
        
        this.holder = holder;
    }

    /**
     * Set the <code>number</code> field.
     *
     * @param number Set the <code>number</code> field 
     * to <code>number</code>
     * @throws IllegalArgumentException if <code>number</code> < 1
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
     * Transfer the balance of <code>fromAccount</code> to this account.
     *
     * @param fromAccount the account to tranfer the balance from
     * @throws IllegalArgumentException if <code>fromAccount</code> is in the 
     * red
     */
    public void transferBalance(Account fromAccount) {        
        if (fromAccount.balance < 0)
            throw new IllegalArgumentException(
                "account in red: " + fromAccount);
        
        balance += fromAccount.balance;
        
        fromAccount.balance = 0;        
    }
    
    /**
     * Withdraw the given amount from the account and return the amount 
     * withrdraw which will be 0 if there are insufficient funds in the 
     * account.
     * 
     * @param amount the amount to withdraw
     * @return the amount withdrawn which will be 0 if there are 
     * insufficient funds (amount is greater than current balance)
     */
    public int withdraw(int amount) {
        if (amount > balance) {
            return 0;
        }
        
        balance = balance - amount;
        
        return amount;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "account: " + number 
                + ", holder: " + holder 
                + ", balance: " + balance;
    }
    
    
}
