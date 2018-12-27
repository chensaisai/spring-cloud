package com.ys.dao;

import com.ys.api.entities.ChargeRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: saisai
 * @Date: 2018/11/19 17:12
 */
@Mapper
public interface ChargeRuleDao {

    /**
     * 充值规则查询列表
     * @return
     * @throws Exception
     */
    List<ChargeRule> findAll() throws Exception;

    /**
     * 通过Id查询充值规则数据
     * @param id
     * @return
     * @throws Exception
     */
    ChargeRule findById(Integer id) throws Exception;
}
