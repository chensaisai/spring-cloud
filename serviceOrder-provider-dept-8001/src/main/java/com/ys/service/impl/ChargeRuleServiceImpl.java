package com.ys.service.impl;

import com.ys.api.entities.ChargeRule;
import com.ys.dao.ChargeRuleDao;
import com.ys.service.ChargeRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: saisai
 * @Date: 2018/11/20 11:55
 */
@Service
public class ChargeRuleServiceImpl implements ChargeRuleService {


    @Resource
    private ChargeRuleDao dao;

    @Override
    public List<ChargeRule> list() throws Exception{
        List<ChargeRule> chargeRuleList = null;
        try {
            chargeRuleList = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chargeRuleList;
    }

    @Override
    public ChargeRule get(Integer id) throws Exception{
        ChargeRule chargeRule = null;
        try {
            chargeRule = dao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chargeRule;
    }
}
