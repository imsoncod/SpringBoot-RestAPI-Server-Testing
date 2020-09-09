package com.api.recipe.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.recipe.domain.Recipe;
import com.api.recipe.service.RecipeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "v1/api/recipe")
@Controller
public class RecipeController {
	@Autowired
	private RecipeService mRecipeService;
	
	/**
	 * 레시피 데이터 조회
	 * 
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "레시피 데이터 조회", notes = "레시피 데이터를 조회합니다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "레시피 데이터 조회 성공"),
		@ApiResponse(code = 400, message = "잘못된 접근"),
		@ApiResponse(code = 500, message = "서버 에러")
	})
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Recipe> getRecipeList() throws Exception{
		
		List<Recipe> mRecipeList = mRecipeService.getRecipeList();
		
		return mRecipeList;
	}
	
	
	/**
	 * 레시피 데이터 추가
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "레시피 데이터 추가", notes = "레시피 데이터를 추가합니다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "레시피 데이터 추가 성공"),
		@ApiResponse(code = 400, message = "잘못된 접근"),
		@ApiResponse(code = 500, message = "서버 에러")
	})
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public int createRecipe(@RequestBody Recipe recipe) throws Exception{
		
		/*
		
		String name = map.get("name").toString();
		String explanation = map.get("explanation").toString();
		
		//key "step" Hashmap to String
		ObjectMapper mapper = new ObjectMapper();
		JSONPObject json = new JSONPObject("JSON.parse", map.get("step"));
		String jsonStr = mapper.writeValueAsString(json);

		//Json부분 문자열 추출
		Pattern pattern = Pattern.compile("[{](.*?)[}]");
		java.util.regex.Matcher matcher = pattern.matcher(jsonStr);
		matcher.find(1);
		
		String step = matcher.group(1);
		
		//레시피 추가
		Recipe vo = new Recipe();
		vo.setName(name);
		vo.setExplanation(explanation);
		vo.setStep(step);
		
		*/
		
		mRecipeService.createRecipe(recipe);
		
		return 200;
	}
	
	/**
	 * 레시피 데이터 수정
	 * 
	 * @param map
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "레시피 데이터 수정", notes = "레시피 데이터를 수정합니다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "레시피 데이터 수정 성공"),
		@ApiResponse(code = 400, message = "잘못된 접근"),
		@ApiResponse(code = 500, message = "서버 에러")
	})
	@RequestMapping(value = "{rno}", method = RequestMethod.PUT)
	@ResponseBody
	public int updateRecipe(@PathVariable int rno, @RequestBody Recipe recipe) throws Exception{
		/*

		String name = map.get("name").toString();
		String explanation = map.get("explanation").toString();
		
		//key "step" Hashmap to String
		ObjectMapper mapper = new ObjectMapper();
		JSONPObject json = new JSONPObject("JSON.parse", map.get("step"));
		String jsonStr = mapper.writeValueAsString(json);

		//Json부분 문자열 추출
		Pattern pattern = Pattern.compile("[{](.*?)[}]");
		java.util.regex.Matcher matcher = pattern.matcher(jsonStr);
		matcher.find(1);
		
		String step = matcher.group(1);
		
		//레시피 수정
		Recipe vo = new Recipe();
		vo.setRno(rno);
		vo.setName(name);
		vo.setExplanation(explanation);
		vo.setStep(step);
		
		*/
		
		mRecipeService.updateRecipe(recipe);
		
		return 200;
	}
	
	/**
	 * 레시피 데이터 삭제
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "레시피 데이터 삭제", notes = "레시피 데이터를 삭제합니다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "레시피 데이터 삭제 성공"),
		@ApiResponse(code = 400, message = "잘못된 접근"),
		@ApiResponse(code = 500, message = "서버 에러")
	})
	@RequestMapping(value = "{rno}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteRecipe(@PathVariable int rno) throws Exception{
		
		mRecipeService.deleteRecipe(rno);
		
		return 200;
	}
}
