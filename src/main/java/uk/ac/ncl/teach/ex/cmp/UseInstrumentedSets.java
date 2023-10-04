package uk.ac.ncl.teach.ex.cmp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/** 
 * UseInstrumentedSets - test instrumented  sets.
 *
 */ 
public class UseInstrumentedSets {
    public static void main(String[] args) {
        useInstrumentedHashSet();
        
        // useInstrumentedSet();
    }

    private static void useInstrumentedHashSet() {
        final InstrumentedHashSet<String> s 
            = new InstrumentedHashSet<String>();

        s.add("beep");

        System.out.println(
            "Added 1 element to InstrumentedHashSet");
        System.out.println("InstrumentedHashSet size = " 
            + s.size());
        System.out.println(
            "InstrumentedHashSet addCount = " 
            + s.getAddCount());        

        s.addAll(Arrays.asList("snap", "crackle", "pop"));

        System.out.println(
            "Added 3 elements to InstrumentedHashSet");
        System.out.println("InstrumentedHashSet size = " 
            + s.size());

        System.out.println(
            "InstrumentedHashSet addCount = " 
            + s.getAddCount());
    }
    
    private static void useInstrumentedSet() {
        final InstrumentedSet<String> ihs
            = new InstrumentedSet<String>(new HashSet<String>());

        ihs.addAll(Arrays.asList("snap", "crackle", "pop"));

        System.out.println(
            "Added 3 elements to " +
            "InstrumentedSet (wrapper for HashSet)");
        System.out.println("InstrumentedSet size = " 
            + ihs.size());

        System.out.println(
            "InstrumentedSet addCount = " 
            + ihs.getAddCount());

        final InstrumentedSet<String> its
            = new InstrumentedSet<String>(new TreeSet<String>());

        its.addAll(Arrays.asList("snap", "crackle", "pop"));

        System.out.println(
            "Added 3 elements to " +
            "InstrumentedSet (wrapper for TreeSet)");
        System.out.println("InstrumentedSet size = " 
            + its.size());

        System.out.println(
            "InstrumentedSet addCount = " 
            + its.getAddCount());
    }
}
