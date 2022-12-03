package com.zhao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author zhaoL
 * @Time 2022/11/14 21:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    private String createBy;
    private String updateBy;
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
     * 逻辑删除（0：未删除，1：已删除）
     */
    private Integer deleteFlag;
}
