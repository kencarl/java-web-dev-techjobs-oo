package org.launchcode.techjobs_oo;

public class JobFields {
    public int id;
    public static int nextId = 1;

    public JobFields() {
        id = nextId;
        nextId++;
    }

//    public JobFields(int id, int nextId){
//        id = id;
//        nextId = nextId;
//    }
}
