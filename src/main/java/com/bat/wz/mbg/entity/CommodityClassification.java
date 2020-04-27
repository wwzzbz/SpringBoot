package com.bat.wz.mbg.entity;

import java.io.Serializable;

public class CommodityClassification implements Serializable {
    private Integer classifyId;

    private String goodKindsName;

    private Integer upperId;

    private String upperName;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getGoodKindsName() {
        return goodKindsName;
    }

    public void setGoodKindsName(String goodKindsName) {
        this.goodKindsName = goodKindsName == null ? null : goodKindsName.trim();
    }

    public Integer getUpperId() {
        return upperId;
    }

    public void setUpperId(Integer upperId) {
        this.upperId = upperId;
    }

    public String getUpperName() {
        return upperName;
    }

    public void setUpperName(String upperName) {
        this.upperName = upperName == null ? null : upperName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classifyId=").append(classifyId);
        sb.append(", goodKindsName=").append(goodKindsName);
        sb.append(", upperId=").append(upperId);
        sb.append(", upperName=").append(upperName);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}