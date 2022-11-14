package com.zhao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhao.entity.ProductCategory;
import com.zhao.mapper.ProductCategoryMapper;
import com.zhao.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author zhaoL
 * @Time 2022/11/7 21:09
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper,ProductCategory> implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> result = new ArrayList<>();
        for (int i = 0; i < categoryTypeList.size(); i++) {
            LambdaQueryWrapper<ProductCategory> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(ProductCategory::getCategoryType, categoryTypeList.get(i));
            List<ProductCategory> productCategories = productCategoryMapper.selectList(queryWrapper);
            result.addAll(productCategories);

        }
        return result;
    }
}
