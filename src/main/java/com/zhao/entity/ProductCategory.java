package com.zhao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhaoL
 * @Time 2022/10/25 21:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_category")
public class ProductCategory extends BaseEntity{

    /**
     * 类目id
     */
    @TableId("category_id")
    private Integer categoryId;
    /**
     * 类目名字
     */
    private String categoryName;
    /**
     * 类目编号
     */
    private Integer categoryType;


}
