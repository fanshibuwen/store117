package com.zhao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhao.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Author zhaoL
 * @Time 2022/10/26 21:16
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void test1() {
        List<ProductCategory> list = productCategoryMapper.selectList(null);
        for (ProductCategory productCategory : list) {
            System.err.println(productCategory);
        }
    }

    @Test
    public void test2() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        productCategoryMapper.insert(productCategory);
    }

    @Test
    public void test3() {
        ProductCategory productCategory = productCategoryMapper.selectById(1);

        LambdaQueryWrapper<ProductCategory> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ProductCategory::getCategoryId,1);
        ProductCategory productCategory1 = productCategoryMapper.selectOne(wrapper);
        System.err.println(productCategory);
        System.err.println(productCategory1);
    }

    @Test
    public void test4() {
        ProductCategory productCategory = productCategoryMapper.selectById(2);
        productCategory.setCategoryType(3);
        productCategoryMapper.updateById(productCategory);
    }

}