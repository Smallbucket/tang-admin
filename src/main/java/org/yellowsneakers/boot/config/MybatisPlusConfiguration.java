/*
 * Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yellowsneakers.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.yellowsneakers.boot.runner.AppConstants;
import org.yellowsneakers.core.mybatisplus.RubberMetaObjectHandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

/**
 * MyBatis plus 配置
 * @author tang
 * @since  1.0
 */
@Configuration
@MapperScan("org.yellowsneakers.business.**.mapper.**")
public class MybatisPlusConfiguration {

	/**
	 * mybatis-plus分页插件
	 * @return
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
	public MetaObjectHandler metaObjectHandler() {
		return new RubberMetaObjectHandler();
	}

    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({AppConstants.DEV_CDOE, AppConstants.TEST_CODE})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

}

