package uk.ac.ncl.teach.tools.acc;

/** 
 * UseAccount - application to use Account class.
 *
 */

public class UseAccount {
   
    public static void main(String[] args) throws Exception {
        final Account acc = new Account();
        
        acc.setNumber(1);
        acc.setHolder("nick");
        
        acc.deposit(10);
        
        System.out.println(acc);
        
        acc.deposit(-10);
    }

}
