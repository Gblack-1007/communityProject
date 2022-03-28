package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: 顾嘉伟
 * @Version: 1.0
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}