package uk.ac.ncl.teach.ex.immut;

import java.util.Date;

/** 
 * MutablePerson - version of Person that does not 
 * perform defensive copying of internal fields.
 *
 */

public final class MutablePerson implements Person {
    private final Name name;
    private final Date dateOfBirth;
    
    /**
     * Create person with given name and date of birth.
     *
     * @param name the person name
     * @param dateOfBirth the person's date of birth
     * @throws NullPointerException if either <code>name</code>
     * or <code>dateOfBirth</code> is null
     */
    public MutablePerson(Name name, Date dateOfBirth) {
        if (name == null)
            throw new IllegalArgumentException(
                "null name not permitted");
        
        if (dateOfBirth == null)
            throw new IllegalArgumentException(
                "null date not permitted");
        
        this.name = name;
        
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @see Person#getName()
     */
    public Name getName() { 
        return name; 
    }
    
    /**
     * @see Person#getDateOfBirth()
     */
    public Date getDateOfBirth() { 
        return dateOfBirth;
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (!(obj instanceof MutablePerson))
            return false;
        
        final MutablePerson person = (MutablePerson) obj;
        
        return name.equals(person.name) 
                && dateOfBirth.equals(person.dateOfBirth);
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hc = 17;
        
        hc = 37 * hc + name.hashCode();
        
        return 37 * hc + dateOfBirth.hashCode();
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return name + " (" + dateOfBirth + ")";
    }
 }
