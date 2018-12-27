package com.ys.api.service;

import com.ys.api.entities.ChargeRule;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author: saisai
 * @Date: 2018/11/20 11:16
 */
@FeignClient(value = "MICROSERVICECLOUD-BMS",fallbackFactory = ChargeRuleServiceFallbackFactory.class)
public interface ChargeRuleClientService {


    /**
     * 充值规则---查询列表
     * @return
     */
    @RequestMapping(value = "/bms/ordering/chargeRule/list",method = RequestMethod.GET)
    Map<String,List<ChargeRule>> list();

    /**
     * 充值规则---通过id查询数据
     * @param id
     * @return
     */
    @RequestMapping(value = "/bms/ordering/chargeRule/get/{id}",method = RequestMethod.GET)
    Map<String,ChargeRule>  get(@PathVariable("id") Integer id);


}
