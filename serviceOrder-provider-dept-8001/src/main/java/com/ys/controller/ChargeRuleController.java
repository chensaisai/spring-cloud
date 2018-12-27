package com.ys.controller;

import com.google.common.collect.Maps;
import com.ys.api.entities.ChargeRule;
import com.ys.service.ChargeRuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author: saisai
 * @Date: 2018/11/19 17:11
 */
@RestController
@RequestMapping(value = "/bms/ordering/chargeRule")
@Api(value = "充值规则接口" ,description = "充值规则接口", produces = "produces",consumes = "consumes")
public class ChargeRuleController extends BaseController {

    @Autowired
    private ChargeRuleService service;

    @Resource
    private DiscoveryClient client;

    /**
     * 充值规则列表
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ApiOperation(value = "充值规则列表查询接口", nickname = "充值规则列表查询接口")
    public Map<String,List<ChargeRule>> list() {
        Map<String, List<ChargeRule>> resultMap = Maps.newHashMap();
        List<ChargeRule> chargeRuleList = null;
        try {
            //查询充值规则列表
            chargeRuleList = service.list();
            resultMap.put("chargeRuleList", chargeRuleList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }


    /**
     * 通过Id查询数据
     * @param id
     * @return
     */
    @RequestMapping(value = "get/{id}")
    public Map<String,ChargeRule> get(@PathVariable("id") Integer id) throws Exception{
        Map<String, ChargeRule> resultMap = Maps.newHashMap();
        ChargeRule chargeRule = null;
        try {
            chargeRule = service.get(id);
            resultMap.put("ChargeRule", chargeRule);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }


    /**
     * 服务发现
     *
     * @return
     */
    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);
        System.out.println("123");

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-BMS");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
