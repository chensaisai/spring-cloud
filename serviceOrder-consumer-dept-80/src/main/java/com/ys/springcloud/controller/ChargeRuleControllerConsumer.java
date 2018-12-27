package com.ys.springcloud.controller;

import com.ys.api.entities.ChargeRule;
import com.ys.api.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:06
 */
@RestController
public class ChargeRuleControllerConsumer {


    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-BMS";
//    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用restTemplate访问restful接口非常的简单粗暴无脑。（URL，requestMap，ResponseBean.class）
     * 这三个参数分别表示   rest请求地址  请求参数  http响应转换被转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * @return
     */
    @RequestMapping(value = "/consumer/chargeRule/list")
    public BaseResponse<List<ChargeRule>> list() {

        BaseResponse<List<ChargeRule>> response = new BaseResponse<>();

        try {
            List<ChargeRule> chargeRuleList =  restTemplate.getForObject(REST_URL_PREFIX + "/bms/ordering/chargeRule/list", List.class);
            response.setRawData(chargeRuleList);
            response.setSuccess(true);
            response.setMsgContent("查询充值规则列表成功");
        } catch (RestClientException e) {
            e.printStackTrace();
            response.setSuccess(false);
            response.setMsgCode("查询充值规则列表出错");
        }


        return response;
//        return restTemplate.getForObject(REST_URL_PREFIX + "/bms/ordering/chargeRules/list", List.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/chargeRule/discovery")
    public Object discovery() {
        Object obj = restTemplate.getForObject(REST_URL_PREFIX + "/bms/ordering/chargeRule/discovery", Object.class);
        System.out.println(obj.toString());
        return obj;
    }



}
