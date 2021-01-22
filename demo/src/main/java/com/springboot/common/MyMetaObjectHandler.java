package com.springboot.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author: Ydz
 * @Description:处理数据库创建和修改日期自动更新
 * @Date: 2021/1/22
 **/
@Slf4j
@Component // 一定不要忘记把处理器加到IOC容器中！
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill.....");
        // setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject
//        this.setFieldValByName("gmt_create", LocalDateTime.now(), metaObject);
//        this.setFieldValByName("gmt_modified", LocalDateTime.now(), metaObject);
        this.setFieldValByName("gmt_create", new Date(),metaObject);
        this.setFieldValByName("gmt_modified",new Date(),metaObject);
    }

    // 更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill.....");
//        this.setFieldValByName("gmt_modified", LocalDateTime.now(), metaObject);
        this.setFieldValByName("gmt_modified",new Date(),metaObject);
    }
}
