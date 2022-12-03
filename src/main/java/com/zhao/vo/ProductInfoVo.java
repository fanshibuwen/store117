package com.zhao.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author zhaoL
 * @Time 2022/11/26 8:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoVo {
    @JsonProperty("id")
    private String productInfoId;
    @JsonProperty("name")
    private String productInfoName;
    @JsonProperty("price")
    private BigDecimal productInfoPrice;
    @JsonProperty("description")
    private String productInfoDescription;
    @JsonProperty("icon")
    private String productInfoIcon;
}
