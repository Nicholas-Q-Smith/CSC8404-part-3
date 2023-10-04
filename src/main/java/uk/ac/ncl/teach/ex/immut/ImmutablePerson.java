package uk.ac.ncl.teach.ex.immut;

import java.util.Date;

/** 
 * Person - immutable version of Person that prevents 
 * modification of internal state through references
 * to private member fields.
 *
 */

public final class ImmutablePerson implements Person {
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
    public ImmutablePerson(Name name, Date dateOfBirth) { 
        if (name == null) 
            throw new IllegalArgumentException("name is null");
        
        if (dateOfBirth == null)
            throw new IllegalArgumentException("date of birth is null");
        
        this.name = new Name(name.getFirstName(), 
                        name.getLastName());
        
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }
    
    /**
     * @see uk.ac.ncl.teach.ex.immut.Person#getName()
     */
    public Name getName() {
        return new Name(name.getFirstName(), 
            name.getLastName());
    }

    /**
     * @see uk.ac.ncl.teach.ex.immut.Person#getDateOfBirth()
     */
    public Date getDateOfBirth() {
        // could return new Date(dateOfBirth.getTime())
        return (Date) dateOfBirth.clone();
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (!(obj instanceof ImmutablePerson))
            return false;
        
        final ImmutablePerson person = (ImmutablePerson) obj;
        
        return name.equals(person.name) 
                && dateOfBirth.equals(person.dateOfBirth);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hc = 17;
        
        hc = 37 * hc + name.hashCode();
        
        return 37 * hc + dateOfBirth.hashCode();
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name + " (" + dateOfBirth + ")";
    }    
}
