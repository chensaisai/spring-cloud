package com.ys.springcloud.controller;

import com.google.common.collect.Maps;
import com.ys.api.entities.ChargeRule;
import com.ys.api.service.ChargeRuleClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:06
 */
@RestController
@RequestMapping(value = "consumer/chargeRule")
public class ChargeRuleControllerConsumer {


    @Resource
    private ChargeRuleClientService chargeRuleClientService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,List<ChargeRule>> list() throws Exception{
        Map<String, List<ChargeRule>> resultList = Maps.newHashMap();
        try {
            resultList= this.chargeRuleClientService.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }


    /**
     * 通过id查询数据----客户端
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/get/{id}")
    public Map<String,ChargeRule> get(@PathVariable("id") Integer id) throws Exception{
        Map<String, ChargeRule> chargeRule = Maps.newHashMap();
        try {
            chargeRule = chargeRuleClientService.get(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chargeRule;
    }



   // 测试@EnableDiscoveryClient,消费端可以调用服务发现
   /* @RequestMapping(value = "/consumer/chargeRule/discovery")
    public Object discovery() {
        Object obj = restTemplate.getForObject(REST_URL_PREFIX + "/bms/ordering/chargeRule/discovery", Object.class);
        System.out.println(obj.toString());
        return obj;
    }*/



}
