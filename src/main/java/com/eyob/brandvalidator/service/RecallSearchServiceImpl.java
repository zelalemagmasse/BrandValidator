package com.eyob.brandvalidator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eyob.brandvalidator.exceptionHandler.RestTemplateResponseErrorHandler;
import com.eyob.brandvalidator.model.recall.Recall;
import com.eyob.brandvalidator.model.recall.Results;



@Service
public class RecallSearchServiceImpl implements RecallSearchService {
    private RestTemplate restTemplate;  
	
       
       @Autowired
       public RecallSearchServiceImpl(RestTemplateBuilder restTemplateBuilder) {
    	    restTemplate = restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
       }
       
       @Override
	   public List<Recall> fechRecallSearchResult(String productDescription) {
	        	        
	        Results results = restTemplate.getForObject("https://api.fda.gov/food/enforcement.json?search=product_description:" + productDescription +"+AND+report_date:[20180101+TO+20201231]", Results.class);
	        return results.getRecalls();
	    }
	   
	  
}
