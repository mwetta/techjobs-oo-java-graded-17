package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //TASK 4
    @Test
    public void testSettingJobId () {
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob.getId(), secondJob.getId(), 0.0);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("Desert", testJob.getLocation().getValue());
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality () {
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(firstJob.equals(secondJob));
    }



    //Task 5



}
