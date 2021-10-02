package basiclibrary;/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import basiclibrary.Library;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    @DisplayName("some library method should return true")
    void someLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test
    @DisplayName("roll a dice should return array of 6 elements")
    void roll(){
        Library classUnderTest = new Library();
        assertEquals(6,classUnderTest.roll(6).length, "roll should return array of length 6");

    }
    @Test
    @DisplayName("contains Duplicates Method should return true or false")
    void containsDuplicates(){
        Library classUnderTest = new Library();
        int[] truthArr= {1,1,2,3};
        int[] falseArr={1,2,3,4};
        assertTrue(classUnderTest.containsDuplicates(truthArr), "containsDuplicatesMethod should return 'true'");
        assertFalse(classUnderTest.containsDuplicates(falseArr), "containsDuplicatesMethod should return 'false'");

    }
    @Test
    @DisplayName("average should return the average of array equal to 10")
    public void averageMethod() {
        Library classUnderTest = new Library();
        double[] avgArr = {10, 3, 3, 4,20,20,10,10};
        assertEquals(10, classUnderTest.calculateAverage(avgArr), "average should return the average of array equal to 5");
    }
    @Test
    @DisplayName("lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}")
    public void lowestAverage() {
        Library classUnderTest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] expectedArray = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(expectedArray, classUnderTest.lowestAverage(weeklyMonthTemperatures),
                "lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}");
    }}


