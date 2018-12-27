package com.ys.service;

import com.ys.api.entities.ChargeRule;

import java.util.List;

/**
 * @author: saisai
 * @Date: 2018/11/19 17:12
 */
public interface ChargeRuleService {

    /**
     * 充值列表查询接口---服务提供端
     * @return
     * @throws Exception
     */
    List<ChargeRule> list() throws Exception;

    /**
     * 通过id查询数据----服务提供端
     * @param id
     * @return
     * @throws Exception
     */
    ChargeRule get(Integer id) throws Exception;
}
