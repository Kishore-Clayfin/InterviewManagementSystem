package com.ims.service;

import java.util.List;

import com.ims.model.DomainCategory;

public interface IDomainCategoryService 
{

	DomainCategory saveDomainCategory(DomainCategory domainCategory);

	List<DomainCategory> viewDomainCategoryList();

	DomainCategory updateDomainCategory(Integer domSubCatId);

	void deleteDomainCategory(Integer domSubCatId);
}
