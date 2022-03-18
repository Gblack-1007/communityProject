package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: 顾嘉伟
 * @Version: 1.0
 */
@Repository("alphaDaoHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
