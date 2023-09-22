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
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().endsWith("\n"));
        assertTrue(testJob.toString().startsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job thirdJob = new Job("Software designer", new Employer("Thalys"), new Location("Overland Park, KS"), new PositionType("Software"), new CoreCompetency("Python"));
        assertTrue(thirdJob.toString().endsWith("\nName: Software designer\nEmployer: Thalys\nLocation: Overland Park, KS\nPosition Type: Software\nCore Competency: Python\n"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job secondJob = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertEquals("\nID: 3\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n", secondJob.toString());
    }
}
