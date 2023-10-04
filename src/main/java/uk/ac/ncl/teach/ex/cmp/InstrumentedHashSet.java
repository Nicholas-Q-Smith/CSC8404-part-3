package uk.ac.ncl.teach.ex.cmp;

import java.util.Collection;
import java.util.HashSet;

/** 
 * InstrumentedHashSet - broken extension of HashSet to 
 * count number of attempted additions a set. 
 * Taken from Effective Java by Joshua Bloch
 * ISBN 0-201-31005-8 - see Item 14.
 *
 * Copyright (C) 2001 Sun Microsystems Inc.
 * @version $Revision: 1421 $<br />
 * $Date: 2010-10-11 14:02:41 +0100 (Mon, 11 Oct 2010) $
 */ 
public class InstrumentedHashSet<E> extends HashSet<E> {
    private static final long serialVersionUID = 2603646057159890760L;
    // the number of attempted element insertions
    private int addCount = 0;
    
    /**
     * @see java.util.HashSet#HashSet()
     */
    public InstrumentedHashSet() { }
    
    /**
     * @see java.util.HashSet#HashSet()
     */
    public InstrumentedHashSet(Collection<? extends E> c) {
        super(c);
    }
    
    /**
     * @see java.util.HashSet#HashSet()
     */
    public InstrumentedHashSet(int initCap) {
        super(initCap);
    }

    /**
     * @see java.util.HashSet#HashSet()
     */
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }
    
    /**
     * Increments insertion count and attempts to add element.
     * @see java.util.HashSet#add()
     */
    public boolean add(E o) {
        addCount++;
        return super.add(o);
    }

    /**
     * Increments insertion count by number of elements in c 
     * and attempts to add elements.
     * @see java.util.HashSet#addAll()
     */
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    
    /**
     * Returns the count of attempted insertions.
     * 
     * @return the number of attempted insertions.
     */
    public int getAddCount() { return addCount; }
}
