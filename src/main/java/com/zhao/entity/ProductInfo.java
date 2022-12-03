package com.zhao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author zhaoL
 * @Time 2022/11/14 20:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_info")
public class ProductInfo extends BaseEntity {
    /**
     * 商品id
     */
    @TableId
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品单价
     */
    private BigDecimal productPrice;
    /**
     * 商品库存
     */
    private Integer productStack;
    /**
     * 商品描述
     */
    private String productDescription;
    /**
     * 商品小图
     */
    private String productIcon;
    /**
     * 商品类目
     */
    private Integer categoryType;
    /**
     * 商品状态（0：上架，1：下架）
     */
    private Integer productStatus;
}
