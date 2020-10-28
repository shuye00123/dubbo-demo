package com.richye.sca.common.domain;

public class StorageTbl {
    private Integer id;

    private String commodityCode;

    private Integer count;

    public StorageTbl(Integer id, String commodityCode, Integer count) {
        this.id = id;
        this.commodityCode = commodityCode;
        this.count = count;
    }

    public StorageTbl() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}