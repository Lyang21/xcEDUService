package com.xuecheng.framework.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 页码信息
 */
@ApiModel(value = "PageInfo", description = "基础请求参数")
public class PageInfo implements Serializable {

    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页", name = "pageIndex", required = true)
    private Integer pageIndex;

    /**
     * 每页返回数据数量
     */
    @ApiModelProperty(value = "分页大小", name = "pageSize", required = true)
    private Integer pageSize;

    /**
     * 时间字段
     */
    @ApiModelProperty(value = "时间字段", name = "timeField")
    private Integer timeField;

    /**
     * 起始日期
     */
    @ApiModelProperty(value = "起始日期", name = "beginDate")
    private Integer beginDate;

    /**
     * 截止日期
     */
    @ApiModelProperty(value = "截止日期", name = "endDate")
    private Integer endDate;

    /**
     * 关键词字段
     */
    @ApiModelProperty(value = "关键词字段", name = "field")
    private Integer field;

    /**
     * 搜索关键字
     */
    @ApiModelProperty(value = "搜索关键字", name = "keyword")
    private String keyword;

    /**
     * 是否显示
     */
    @ApiModelProperty(value = "是否显示", name = "isShow")
    private Integer isShow;

    /**
     * 排序字段
     */
    @ApiModelProperty(value = "排序字段", name = "orderField")
    private Integer orderField;

    /**
     * 是否降序
     */
    @ApiModelProperty(value = "是否降序", name = "isDesc")
    private Boolean isDesc;

    @ApiModelProperty(value = "计数", name = "totalCount")
    private long totalCount;

    @ApiModelProperty(value = "种类", name = "category")
    private String category;


    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTimeField() {
        return timeField;
    }

    public void setTimeField(Integer timeField) {
        this.timeField = timeField;
    }

    public Integer getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Integer beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getOrderField() {
        return orderField;
    }

    public void setOrderField(Integer orderField) {
        this.orderField = orderField;
    }

    public Boolean getDesc() {
        return isDesc;
    }

    public void setDesc(Boolean desc) {
        isDesc = desc;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public boolean pageable() {
        return pageSize > 0 && pageIndex >= 0;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
