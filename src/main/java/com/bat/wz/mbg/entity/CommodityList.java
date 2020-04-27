package com.bat.wz.mbg.entity;

import java.io.Serializable;

public class CommodityList implements Serializable {
    private String goodId;

    private Integer classifyId;

    private String classifyDescription;

    private String goodBrand;

    private String goodName;

    private String goodPrice;

    private String storeAdd;

    private Integer monthsaleNum;

    private String colorClassification;

    private Integer commentNum;

    private String goodAfterrate;

    private String industrycompare;

    private String goodLink;

    private String storeName;

    private String storeLink;

    private Integer goodHot;

    private String storeAge;

    private String sellerCredit;

    private Integer ishasLicense;

    private Double descriptionsituation;

    private Double serviceattitude;

    private Double logisticsservice;

    private String size;

    private static final long serialVersionUID = 1L;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyDescription() {
        return classifyDescription;
    }

    public void setClassifyDescription(String classifyDescription) {
        this.classifyDescription = classifyDescription == null ? null : classifyDescription.trim();
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand == null ? null : goodBrand.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice == null ? null : goodPrice.trim();
    }

    public String getStoreAdd() {
        return storeAdd;
    }

    public void setStoreAdd(String storeAdd) {
        this.storeAdd = storeAdd == null ? null : storeAdd.trim();
    }

    public Integer getMonthsaleNum() {
        return monthsaleNum;
    }

    public void setMonthsaleNum(Integer monthsaleNum) {
        this.monthsaleNum = monthsaleNum;
    }

    public String getColorClassification() {
        return colorClassification;
    }

    public void setColorClassification(String colorClassification) {
        this.colorClassification = colorClassification == null ? null : colorClassification.trim();
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getGoodAfterrate() {
        return goodAfterrate;
    }

    public void setGoodAfterrate(String goodAfterrate) {
        this.goodAfterrate = goodAfterrate == null ? null : goodAfterrate.trim();
    }

    public String getIndustrycompare() {
        return industrycompare;
    }

    public void setIndustrycompare(String industrycompare) {
        this.industrycompare = industrycompare == null ? null : industrycompare.trim();
    }

    public String getGoodLink() {
        return goodLink;
    }

    public void setGoodLink(String goodLink) {
        this.goodLink = goodLink == null ? null : goodLink.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreLink() {
        return storeLink;
    }

    public void setStoreLink(String storeLink) {
        this.storeLink = storeLink == null ? null : storeLink.trim();
    }

    public Integer getGoodHot() {
        return goodHot;
    }

    public void setGoodHot(Integer goodHot) {
        this.goodHot = goodHot;
    }

    public String getStoreAge() {
        return storeAge;
    }

    public void setStoreAge(String storeAge) {
        this.storeAge = storeAge == null ? null : storeAge.trim();
    }

    public String getSellerCredit() {
        return sellerCredit;
    }

    public void setSellerCredit(String sellerCredit) {
        this.sellerCredit = sellerCredit == null ? null : sellerCredit.trim();
    }

    public Integer getIshasLicense() {
        return ishasLicense;
    }

    public void setIshasLicense(Integer ishasLicense) {
        this.ishasLicense = ishasLicense;
    }

    public Double getDescriptionsituation() {
        return descriptionsituation;
    }

    public void setDescriptionsituation(Double descriptionsituation) {
        this.descriptionsituation = descriptionsituation;
    }

    public Double getServiceattitude() {
        return serviceattitude;
    }

    public void setServiceattitude(Double serviceattitude) {
        this.serviceattitude = serviceattitude;
    }

    public Double getLogisticsservice() {
        return logisticsservice;
    }

    public void setLogisticsservice(Double logisticsservice) {
        this.logisticsservice = logisticsservice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodId=").append(goodId);
        sb.append(", classifyId=").append(classifyId);
        sb.append(", classifyDescription=").append(classifyDescription);
        sb.append(", goodBrand=").append(goodBrand);
        sb.append(", goodName=").append(goodName);
        sb.append(", goodPrice=").append(goodPrice);
        sb.append(", storeAdd=").append(storeAdd);
        sb.append(", monthsaleNum=").append(monthsaleNum);
        sb.append(", colorClassification=").append(colorClassification);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", goodAfterrate=").append(goodAfterrate);
        sb.append(", industrycompare=").append(industrycompare);
        sb.append(", goodLink=").append(goodLink);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeLink=").append(storeLink);
        sb.append(", goodHot=").append(goodHot);
        sb.append(", storeAge=").append(storeAge);
        sb.append(", sellerCredit=").append(sellerCredit);
        sb.append(", ishasLicense=").append(ishasLicense);
        sb.append(", descriptionsituation=").append(descriptionsituation);
        sb.append(", serviceattitude=").append(serviceattitude);
        sb.append(", logisticsservice=").append(logisticsservice);
        sb.append(", size=").append(size);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}