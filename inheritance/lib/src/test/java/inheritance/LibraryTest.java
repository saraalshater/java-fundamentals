/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }



        @Test void RestaurantTest() {
            Restaurant restaurant = new Restaurant("kfc",4,10);

            assertEquals("Restaurant -> {name='kfc', rate=4.0, $}", restaurant.toString());
        }


        @Test void ReviewTest() {
            Review review = new Review("Very Good", "sara", 4);

            assertEquals("{body='Very Good', author='sara', ****}" , review.toString());
        }
        @Test void addReviewsTest(){
            Restaurant restaurant = new Restaurant("kfc",4,10);

            Review review1 = new Review ("Good","sara", 4);
            Review review2 = new Review("Perfect","leen", 5);
            Review review3 = new Review("Not Delicious","Noor",2);

            restaurant.addReview(review1);
            restaurant.addReview(review2);
            restaurant.addReview(review3);

            assertEquals("[{body='Good', author='sara', ****}, {body='Perfect', author='leen', *****}, {body='Not Delicious', author='Noor', **}]", restaurant.getReviews().toString());
        }
    }



