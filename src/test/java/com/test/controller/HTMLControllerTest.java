package com.test.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { HTMLController.class })
@AutoConfigureMockMvc
public class HTMLControllerTest {

	@Autowired
	private MockMvc mockMVC;

	@Test
	public void testLandingPage() throws Exception {

		String uri = "/";

		// Get a MVC Result obj from the mock call
		MvcResult mvcResult = mockMVC.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		// Assert that you recieved a 200 status back
		assertEquals(200, mvcResult.getResponse().getStatus());
		System.out.print(mvcResult.getResponse().getContentAsByteArray());

	}

}
