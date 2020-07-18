package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        String employerInfo;
        String locationInfo;
        String positionInfo;
        String competencyInfo;

        if (getEmployer().toString() == "" ){
            employerInfo = "Data not available";
        } else employerInfo = getEmployer().toString();
        if (getLocation().toString()== ""){
            locationInfo = "Data not available";
        } else locationInfo = getLocation().toString();
        if (getPositionType().toString() == ""){
            positionInfo = "Data not available";
        } else positionInfo = getPositionType().toString();
        if (getCoreCompetency().toString() == "") {
            competencyInfo = "Data not available";
        } else competencyInfo = getCoreCompetency().toString();


        return "\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName()+ "\n" +
                "Employer: " + employerInfo + "\n"+
                "Location: " + locationInfo + "\n" +
                "Position Type: " + positionInfo + "\n"+
                "Core Competency: " + competencyInfo + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        if (name == ""){
            return "Data not available";
        } else
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
