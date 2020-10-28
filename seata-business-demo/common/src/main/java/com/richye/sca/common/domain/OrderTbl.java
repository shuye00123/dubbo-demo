package com.richye.sca.common.domain;

public class OrderTbl {
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

    public OrderTbl(Integer id, String userId, String commodityCode, Integer count, Integer money) {
        this.id = id;
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.count = count;
        this.money = money;
    }

    public OrderTbl() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}