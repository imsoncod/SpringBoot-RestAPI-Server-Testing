package com.api.recipe.mapper;

import java.util.List;

import com.api.recipe.domain.Recipe;

public interface RecipeMapper {
	
	/** 
	 * 레시피 데이터 조회
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Recipe> getRecipeList() throws Exception;
	
	
	/**
	 * 레시피 데이터 추가
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int createRecipe(Recipe vo) throws Exception;
	
	/**
	 * 레시피 데이터 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int updateRecipe(Recipe vo) throws Exception;
	
	/**
	 * 레시피 데이터 삭제
	 * 
	 * @param rno
	 * @return
	 * @throws Exception
	 */
	public int deleteRecipe(int rno) throws Exception;
}
