package com.zhao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author zhaoL
 * @Time 2022/10/25 21:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_category")
public class ProductCategory {

    /**
     * 类目id
     */
    private Integer categoryId;
    /**
     * 类目名字
     */
    private String categoryName;
    /**
     * 类目编号
     */
    private Integer categoryType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 逻辑删除
     */
    private Integer deleteFlag;

}
