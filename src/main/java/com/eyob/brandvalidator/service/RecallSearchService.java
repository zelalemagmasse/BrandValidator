package com.eyob.brandvalidator.service;

import java.util.List;

import com.eyob.brandvalidator.model.recall.Recall;

public interface RecallSearchService {

	public List<Recall> fechRecallSearchResult(String productDescription);
}
