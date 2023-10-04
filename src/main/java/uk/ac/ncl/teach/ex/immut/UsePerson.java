package uk.ac.ncl.teach.ex.immut;

import java.util.Date;

/** 
 * UsePerson - demonstrate benefits of immutability by showing
 * uncontrolled modification of internal state when using 
 * MutablePerson implementation of Person and prevention of 
 * such modification when using ImmutablePerson implementation.
 *
 */

public final class UsePerson {
    /**
     * Main method, requires no arguments.
     *
     * @param args args are ignored
     */
    public static void main(String[] args) {
        final Date dob = new Date();
        final Name name = new Name("Nick", "Cook");
        
        // change implementation used to ImmutablePerson 
        // to demonstrate benefits of immutability
        final Person p 
            = new ImmutablePerson(name, dob);
        
        System.out.println(p);
        
        dob.setTime(0L);
        
        System.out.println("Modify through dob constructor param?");
        System.out.println("    " + p);
        
        name.setFirstName("Brian");
        
        System.out.println("Modify through name constructor param?");
        System.out.println("    " + p);
        
        final Name internalName = p.getName();
        
        internalName.setLastName("Smith");
        
        System.out.println("Modify through ref to name member field?");
        System.out.println("    " + p);
        
        Date dob2 = p.getDateOfBirth();
        
        dob2.setTime(600000000L);
        
        System.out.println("Modify through ref to dob member field?");
        System.out.println("    " + p);
    }
    
    

}
