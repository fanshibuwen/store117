package com.zhao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.test.context.DynamicPropertySource;

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
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * 逻辑删除
     */
    private Integer deleteFlag;

}
