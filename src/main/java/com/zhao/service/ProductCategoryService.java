package com.zhao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhao.entity.ProductCategory;

import java.util.List;

/**
 * @Author zhaoL
 * @Time 2022/11/7 21:06
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    /**
     * 通过类目类型查找商品分类
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
