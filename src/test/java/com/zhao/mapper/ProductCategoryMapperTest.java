package com.zhao.mapper;

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
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void test1() {
        List<ProductCategory> list = productCategoryMapper.selectList(null);
        System.out.println(list);
    }

}