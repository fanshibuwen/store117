package com.zhao.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author zhaoL
 * @Time 2022/11/26 8:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryVo {
    /**
     * 此注解的意思是修改返回给前端的数据名称
     */
    @JsonProperty("name")
    private String productCategoryName;
    @JsonProperty("type")
    private Integer productCategoryType;
    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;
}
