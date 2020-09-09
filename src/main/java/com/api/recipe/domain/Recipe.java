package com.api.recipe.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter
@Setter
public class Recipe {
	@ApiModelProperty(value = "레시피 번호", example = "1")
	private int rno;
	
	@ApiModelProperty(value = "레시피 이름", example = "맛있는 라면")
	private String name;
	
	@ApiModelProperty(value = "레시피 설명", example = "나만 알고있는 라면 레시피")
	private String explanation;
	
	@ApiModelProperty(value = "레시피 단계", example = "step1 : 냄비를 준비한다.##step2 : 물을 넣는다.##step3 : 불을켜고 물을 끓인다.")
	private String step;
}
