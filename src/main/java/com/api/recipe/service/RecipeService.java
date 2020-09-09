package com.api.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.recipe.domain.Recipe;
import com.api.recipe.mapper.RecipeMapper;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeMapper mRecipeMapper;
	
	/**
	 * 레시피 데이터 조회
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Recipe> getRecipeList() throws Exception{
		return mRecipeMapper.getRecipeList();
	}
	
	/**
	 * 레시피 데이터 추가
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int createRecipe(Recipe vo) throws Exception{
		return mRecipeMapper.createRecipe(vo);
	}
	
	/**
	 * 레시피 데이터 수정
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int updateRecipe(Recipe vo) throws Exception{
		return mRecipeMapper.updateRecipe(vo);
	}
	
	/**
	 * 레시피 데이터 삭제
	 * 
	 * @param rno
	 * @return
	 * @throws Excpetion
	 */
	public int deleteRecipe(int rno) throws Exception{
		return mRecipeMapper.deleteRecipe(rno);
	}
}
