package com.chilx.jw.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * dao基类 所以新增dao必须继承该类
 *
 * @author chilx
 * @date 2020/10/28
 **/
@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>{
}
