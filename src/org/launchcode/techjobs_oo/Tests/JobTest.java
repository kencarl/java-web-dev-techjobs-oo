package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

    @Test
    public void testJobName(){
        assertEquals("Product tester", myJob.getName());
    }
//    @Test
//    public void testJobEmployer(){
//        assertEquals(myJob.getEmployer(), myJob.equals("ACME"));
//    }
    @Test
    public void isIdCorrect(){
        assertEquals(1, myJob.getId());
    }
    @Test
    public void isToStringGood(){
        assertEquals("Product tester", myJob.toString());
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
