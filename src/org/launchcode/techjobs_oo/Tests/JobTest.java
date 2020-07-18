package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job myJob;
    Job job2;


    @Before
    public void setUp() {
        myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    }
    @Test
    public void testJobName(){
        assertEquals("Product tester", myJob.getName());
    }
    //@Test
//    public void testJobEmployer(){
//        assertEquals(myJob.getEmployer(), myJob.equals("ACME"));
//    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", myJob.getName());
        assertEquals("ACME", myJob.getEmployer().toString());
        assertEquals("Desert", myJob.getLocation().toString());
        assertEquals("Quality control", myJob.getPositionType().toString());
        assertEquals("Persistence", myJob.getCoreCompetency().toString());

    }
    @Test
    public void isIdCorrect(){
        assertEquals(13, myJob.getId());
        assertEquals(14, job2.getId());
    }
    @Test
    public void isToStringGood(){
        assertEquals("Product tester", myJob.toString());
    }
    @Test
    public void testJobsForEquality(){
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        Job job4 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        assertFalse(job3.getId() == job4.getId());
    }
    @Test
    public void isEqualsTrue(){
        assertEquals(true, myJob.equals(myJob));
    }
    @Test
    public void isEqualsFalse(){
        assertEquals(false, myJob.equals("ACME"));
    }



}
