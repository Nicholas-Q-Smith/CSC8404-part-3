package uk.ac.ncl.teach.ex.cmp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/** 
 * InstrumentedSet - composition based implementation of a Set
 * that counts  the number of attempted insertions in a set. 
 * Taken from Effective Java by Joshua Bloch 
 * ISBN 0-201-31005-8 - see Item 14.
 *
 * Copyright (C) 2001 Sun Microsystems Inc.
 * @version $Revision: 1423 $<br />
 * $Date: 2010-10-11 14:20:22 +0100 (Mon, 11 Oct 2010) $<br />
 */ 
public final class InstrumentedSet<E> implements Set<E> {
    private final Set<E> s;
    private int addCount;
    
    /**
     * Instantiate instrumented set with the set to be instrumented.
     *
     * @param s the set to instrument
     */
    public InstrumentedSet(Set<E> s) {
        this.s = s;
    }

    /**
     * Increment count of attempted additions and attemtps to add 
     * the element to the set according java.util.Set semantics.
     * @see java.util.Set#add(java.lang.Object)
     */
    public boolean add(E e) {
        addCount++;
        return s.add(e);
    }

    /**
     * Increase the count of attempted additions by the size of 
     * the given collection and attemtps to add 
     * the elements to the set according java.util.Set semantics.
     * @see java.util.Set#addAll(java.util.Collection)
     */
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        
        return s.addAll(c);
    }
    
    /**
     * Returns the number of attempted additions to the set.
     *
     * @return the number of attempted additions to the set
     */
    public int getAddCount() {
        return addCount;
    }

    /**
     * @see java.util.Set#clear()
     */
    public void clear() {
        s.clear();
    }

    /**
     * @see java.util.Set#contains(java.lang.Object)
     */
    public boolean contains(Object e) {
        return s.contains(e);
    }

    /**
     * @see java.util.Set#containsAll(java.util.Collection)
     */
    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);
    }

    /**
     * @see java.util.Set#isEmpty()
     */
    public boolean isEmpty() {
        return s.isEmpty();
    }

    /**
     * @see java.util.Set#iterator()
     */
    public Iterator<E> iterator() {
        return s.iterator();
    }

    /**
     * @see java.util.Set#remove(java.lang.Object)
     */
    public boolean remove(Object e) {
        return s.remove(e);
    }

    /**
     * @see java.util.Set#removeAll(java.util.Collection)
     */
    public boolean removeAll(Collection<?> c) {
        return s.removeAll(c);
    }

    /**
     * @see java.util.Set#retainAll(java.util.Collection)
     */
    public boolean retainAll(Collection<?> c) {
        return s.retainAll(c);
    }

    /**
     * @see java.util.Set#size()
     */
    public int size() {
        return s.size();
    }

    /**
     * @see java.util.Set#toArray()
     */
    public Object[] toArray() {
        return s.toArray();
    }

    /**
     * @see java.util.Set#toArray(T[])
     */
    public <T> T[] toArray(T[] a) {
        return s.toArray(a);
    }

}
