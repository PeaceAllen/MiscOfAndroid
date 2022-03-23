package com.fjz.misc.android.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "configurations")
public class Configurations {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String key;

    private String value;
}
