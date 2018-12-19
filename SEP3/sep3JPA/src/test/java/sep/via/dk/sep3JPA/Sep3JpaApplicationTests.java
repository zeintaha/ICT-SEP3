package sep.via.dk.sep3JPA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureMockRestServiceServer

public class Sep3JpaApplicationTests {
	   @Autowired
	    private MockMvc mockMvc;
	   
	  @Test
	    public void addMovie() throws Exception {
	        String mockMovieJson = "{\"title\":\"Test movie\",\"description\":\"A test description.\",\"director\":\"fadi\",\"duration\":\"duration test\",\"urlTrailer\":\"urlTrailer test\",\"urlFullMovie\":\"urlFullMovie test\",\"urlImage\":\"urlImage test\",\"category\":\"category test\"}";

	        //Create a post request with an accept header for application\json
	        RequestBuilder requestBuilder = MockMvcRequestBuilders
	                .post("/sep3/movie/")
	                .accept(MediaType.APPLICATION_JSON).content(mockMovieJson)
	                .contentType(MediaType.APPLICATION_JSON);

	        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

	        MockHttpServletResponse response = result.getResponse();

	        //Assert that the return status is CREATED
	        assertEquals(HttpStatus.CREATED.value(), response.getStatus());
	        
	        assertEquals("https://localhost/movie/1",
	                response.getHeader(HttpHeaders.LOCATION));
      
	    }
	  
	  
	  
}
