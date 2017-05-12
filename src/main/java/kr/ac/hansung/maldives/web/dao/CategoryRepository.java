package kr.ac.hansung.maldives.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ac.hansung.maldives.web.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	public Category findByDepthAndName(int depth, String name);
	
	public Category findTop1ByDepthAndCategoryCodeStartingWithOrderByCategoryCodeDesc(int depth, String categoryCode);
	
	public Category findByFullName(String fullName);
	
}
