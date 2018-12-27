package com.ys.api.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: saisai
 * @Date: 2018/11/20 11:13
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class ChargeRule implements Serializable {

    private Integer id;
    private Integer cafeId;
    private Double amount;
    private Double giftAmount;
    private Date startDate;
    private Date endDate;
    private Integer createBy;
    private Date createDate;
    private Integer updateBy;
    private Date updateDate;
    private String status;
}
