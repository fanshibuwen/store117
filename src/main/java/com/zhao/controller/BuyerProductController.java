package com.zhao.controller;

import com.zhao.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhaoL
 * @Time 2022/12/2 20:53
 */
@RestController
@RequestMapping("/buyer")
public class BuyerProductController {


    @RequestMapping("/list")
    public AjaxResult list() {

        return null;
    }
}
