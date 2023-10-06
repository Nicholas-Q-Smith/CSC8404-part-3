package uk.ac.ncl.teach.ex.pract;

import uk.ac.ncl.teach.ex.cmp.InstrumentedSet;

import java.util.HashSet;
import java.util.Set;

public class RecordDemo {
    public static HashSet<Record> records = new HashSet<>();

    public static void main(String[] args) {
        Record r1 = new Record(1, "first");
        Record r2 = new Record(1, "first");


        records.add(r1);


        records.add(r2);



        for(Record r : records) {
            System.out.println(r1 + " + " + r2 + " have equality= " + r1.equals(r2));
        }
    }

}
