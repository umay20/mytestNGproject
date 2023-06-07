import org.junit.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CountriesTestJunit {
      /*
        Given
          User connects to the database
        When
          User sends the query to get the region ids from "countries" table
        Then
          Verify that the number of region ids greater than 1 is 17.
        And
          User closes the connection
       */

    @Test
    public void countriesTest() {
//        User connects to the database
        JdbcUtils.connectToDatabase("localhost","postgres","postgres","Malvern");
        JdbcUtils.createStatement();

//        User sends the query to get the region ids from "countries" table
        List<Object> regionIdList =JdbcUtils.getColumnList("countries","region_id");
        System.out.println("list = " + regionIdList);

//        Verify that the number of region ids greater than 1 is 17.
        int listSize = (int) regionIdList.stream().filter(t -> (int) t > 1).count();
        assertEquals(17, listSize);

//        User closes the connection
        JdbcUtils.closeConnectionAndStatement();

    }
}