package uk.ac.ncl.teach.ex.pract;

public class Record {

    private int id;
    private String name;

    public Record(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(!(obj instanceof Record)) {
            return false;
        }

        Record r = (Record) obj;

        return id == r.id
                && (name == null ? r.name == null:
                        name.equals(r.name));
    }

    public String toString() {
        return id + " - " + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
