package com.zhang.mvp.mode.data;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/12 9:12
 */
public class EquipmentCenterItemBean {

    private String id;
    private String siteTypeName;
    private String siteTypeImg;
    private int serialNumber;
    private String centre;
    private Object boundary;
    private String itemId;
    private Object createBy;
    private Object createTime;
    private Object updateBy;
    private Object updateTime;
    private Object remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiteTypeName() {
        return siteTypeName;
    }

    public void setSiteTypeName(String siteTypeName) {
        this.siteTypeName = siteTypeName;
    }

    public String getSiteTypeImg() {
        return siteTypeImg;
    }

    public void setSiteTypeImg(String siteTypeImg) {
        this.siteTypeImg = siteTypeImg;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public Object getBoundary() {
        return boundary;
    }

    public void setBoundary(Object boundary) {
        this.boundary = boundary;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Object getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Object createBy) {
        this.createBy = createBy;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Object updateBy) {
        this.updateBy = updateBy;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public Object getRemarks() {
        return remarks;
    }

    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }
}
