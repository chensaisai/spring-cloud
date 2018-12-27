package com.ys.api.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ys.api.entities.ChargeRule;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author: saisai
 * @Date: 2018/12/25 12:01
 */
@Component
public class ChargeRuleServiceFallbackFactory implements FallbackFactory<ChargeRuleClientService> {

    @Override
    public ChargeRuleClientService create(Throwable throwable) {
        return new ChargeRuleClientService() {
            @Override
            public Map<String,List<ChargeRule>> list() {
                Map<String, List<ChargeRule>> resultMap = Maps.newHashMap();
                List<ChargeRule> chargeRuleList = Lists.newArrayList();
                ChargeRule chargeRule = new ChargeRule();
                chargeRule.setStatus("查询失败，未查询到此列表信息，服务暂时不可用，请稍后再做访问");
                chargeRuleList.add(chargeRule);
                resultMap.put("Message",chargeRuleList);
                System.out.println(throwable.getMessage());
                return resultMap;
            }

            @Override
            public Map<String,ChargeRule> get(Integer id) {
                Map<String, ChargeRule> resultMap = Maps.newHashMap();
                resultMap.put("Message", new ChargeRule().setStatus("未查询到该id" + id + "对应的数据信息,服务暂时不可用，请稍后再做访问"));
                return resultMap;
            }
        };
    }
}
