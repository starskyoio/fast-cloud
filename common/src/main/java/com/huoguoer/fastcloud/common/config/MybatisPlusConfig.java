package com.huoguoer.fastcloud.common.config;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import com.huoguoer.fastcloud.common.constant.Constants;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author linus
// */
//@Configuration
////@MapperScan(Constants.MAPPER_PACKAGE)
//public class MybatisPlusConfig {
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        DbType dbType = DbType.getDbType("mysql");
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(dbType));
//        return interceptor;
//    }
//}