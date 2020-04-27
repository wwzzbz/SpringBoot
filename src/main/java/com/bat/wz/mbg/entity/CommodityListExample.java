package com.bat.wz.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class CommodityListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("Good_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("Good_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(String value) {
            addCriterion("Good_ID =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(String value) {
            addCriterion("Good_ID <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(String value) {
            addCriterion("Good_ID >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(String value) {
            addCriterion("Good_ID >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(String value) {
            addCriterion("Good_ID <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(String value) {
            addCriterion("Good_ID <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLike(String value) {
            addCriterion("Good_ID like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotLike(String value) {
            addCriterion("Good_ID not like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<String> values) {
            addCriterion("Good_ID in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<String> values) {
            addCriterion("Good_ID not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(String value1, String value2) {
            addCriterion("Good_ID between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(String value1, String value2) {
            addCriterion("Good_ID not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNull() {
            addCriterion("Classify_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("Classify_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Integer value) {
            addCriterion("Classify_ID =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Integer value) {
            addCriterion("Classify_ID <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Integer value) {
            addCriterion("Classify_ID >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Classify_ID >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Integer value) {
            addCriterion("Classify_ID <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Classify_ID <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Integer> values) {
            addCriterion("Classify_ID in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Integer> values) {
            addCriterion("Classify_ID not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("Classify_ID between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Classify_ID not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionIsNull() {
            addCriterion("Classify_Description is null");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionIsNotNull() {
            addCriterion("Classify_Description is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionEqualTo(String value) {
            addCriterion("Classify_Description =", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionNotEqualTo(String value) {
            addCriterion("Classify_Description <>", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionGreaterThan(String value) {
            addCriterion("Classify_Description >", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Classify_Description >=", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionLessThan(String value) {
            addCriterion("Classify_Description <", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Classify_Description <=", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionLike(String value) {
            addCriterion("Classify_Description like", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionNotLike(String value) {
            addCriterion("Classify_Description not like", value, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionIn(List<String> values) {
            addCriterion("Classify_Description in", values, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionNotIn(List<String> values) {
            addCriterion("Classify_Description not in", values, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionBetween(String value1, String value2) {
            addCriterion("Classify_Description between", value1, value2, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andClassifyDescriptionNotBetween(String value1, String value2) {
            addCriterion("Classify_Description not between", value1, value2, "classifyDescription");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNull() {
            addCriterion("Good_Brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNotNull() {
            addCriterion("Good_Brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandEqualTo(String value) {
            addCriterion("Good_Brand =", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotEqualTo(String value) {
            addCriterion("Good_Brand <>", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThan(String value) {
            addCriterion("Good_Brand >", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThanOrEqualTo(String value) {
            addCriterion("Good_Brand >=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThan(String value) {
            addCriterion("Good_Brand <", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThanOrEqualTo(String value) {
            addCriterion("Good_Brand <=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLike(String value) {
            addCriterion("Good_Brand like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotLike(String value) {
            addCriterion("Good_Brand not like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIn(List<String> values) {
            addCriterion("Good_Brand in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotIn(List<String> values) {
            addCriterion("Good_Brand not in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandBetween(String value1, String value2) {
            addCriterion("Good_Brand between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotBetween(String value1, String value2) {
            addCriterion("Good_Brand not between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("Good_Name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("Good_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("Good_Name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("Good_Name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("Good_Name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("Good_Name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("Good_Name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("Good_Name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("Good_Name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("Good_Name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("Good_Name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("Good_Name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("Good_Name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("Good_Name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("Good_Price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("Good_Price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(String value) {
            addCriterion("Good_Price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(String value) {
            addCriterion("Good_Price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(String value) {
            addCriterion("Good_Price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Good_Price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(String value) {
            addCriterion("Good_Price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(String value) {
            addCriterion("Good_Price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLike(String value) {
            addCriterion("Good_Price like", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotLike(String value) {
            addCriterion("Good_Price not like", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<String> values) {
            addCriterion("Good_Price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<String> values) {
            addCriterion("Good_Price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(String value1, String value2) {
            addCriterion("Good_Price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(String value1, String value2) {
            addCriterion("Good_Price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andStoreAddIsNull() {
            addCriterion("Store_Add is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddIsNotNull() {
            addCriterion("Store_Add is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddEqualTo(String value) {
            addCriterion("Store_Add =", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddNotEqualTo(String value) {
            addCriterion("Store_Add <>", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddGreaterThan(String value) {
            addCriterion("Store_Add >", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddGreaterThanOrEqualTo(String value) {
            addCriterion("Store_Add >=", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddLessThan(String value) {
            addCriterion("Store_Add <", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddLessThanOrEqualTo(String value) {
            addCriterion("Store_Add <=", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddLike(String value) {
            addCriterion("Store_Add like", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddNotLike(String value) {
            addCriterion("Store_Add not like", value, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddIn(List<String> values) {
            addCriterion("Store_Add in", values, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddNotIn(List<String> values) {
            addCriterion("Store_Add not in", values, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddBetween(String value1, String value2) {
            addCriterion("Store_Add between", value1, value2, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andStoreAddNotBetween(String value1, String value2) {
            addCriterion("Store_Add not between", value1, value2, "storeAdd");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumIsNull() {
            addCriterion("Monthsale_Num is null");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumIsNotNull() {
            addCriterion("Monthsale_Num is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumEqualTo(Integer value) {
            addCriterion("Monthsale_Num =", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumNotEqualTo(Integer value) {
            addCriterion("Monthsale_Num <>", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumGreaterThan(Integer value) {
            addCriterion("Monthsale_Num >", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Monthsale_Num >=", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumLessThan(Integer value) {
            addCriterion("Monthsale_Num <", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("Monthsale_Num <=", value, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumIn(List<Integer> values) {
            addCriterion("Monthsale_Num in", values, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumNotIn(List<Integer> values) {
            addCriterion("Monthsale_Num not in", values, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumBetween(Integer value1, Integer value2) {
            addCriterion("Monthsale_Num between", value1, value2, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andMonthsaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Monthsale_Num not between", value1, value2, "monthsaleNum");
            return (Criteria) this;
        }

        public Criteria andColorClassificationIsNull() {
            addCriterion("Color_Classification is null");
            return (Criteria) this;
        }

        public Criteria andColorClassificationIsNotNull() {
            addCriterion("Color_Classification is not null");
            return (Criteria) this;
        }

        public Criteria andColorClassificationEqualTo(String value) {
            addCriterion("Color_Classification =", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationNotEqualTo(String value) {
            addCriterion("Color_Classification <>", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationGreaterThan(String value) {
            addCriterion("Color_Classification >", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("Color_Classification >=", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationLessThan(String value) {
            addCriterion("Color_Classification <", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationLessThanOrEqualTo(String value) {
            addCriterion("Color_Classification <=", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationLike(String value) {
            addCriterion("Color_Classification like", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationNotLike(String value) {
            addCriterion("Color_Classification not like", value, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationIn(List<String> values) {
            addCriterion("Color_Classification in", values, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationNotIn(List<String> values) {
            addCriterion("Color_Classification not in", values, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationBetween(String value1, String value2) {
            addCriterion("Color_Classification between", value1, value2, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andColorClassificationNotBetween(String value1, String value2) {
            addCriterion("Color_Classification not between", value1, value2, "colorClassification");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("Comment_Num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("Comment_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("Comment_Num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("Comment_Num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("Comment_Num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Comment_Num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("Comment_Num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("Comment_Num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("Comment_Num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("Comment_Num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("Comment_Num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Comment_Num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateIsNull() {
            addCriterion("Good_AfterRate is null");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateIsNotNull() {
            addCriterion("Good_AfterRate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateEqualTo(String value) {
            addCriterion("Good_AfterRate =", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateNotEqualTo(String value) {
            addCriterion("Good_AfterRate <>", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateGreaterThan(String value) {
            addCriterion("Good_AfterRate >", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateGreaterThanOrEqualTo(String value) {
            addCriterion("Good_AfterRate >=", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateLessThan(String value) {
            addCriterion("Good_AfterRate <", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateLessThanOrEqualTo(String value) {
            addCriterion("Good_AfterRate <=", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateLike(String value) {
            addCriterion("Good_AfterRate like", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateNotLike(String value) {
            addCriterion("Good_AfterRate not like", value, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateIn(List<String> values) {
            addCriterion("Good_AfterRate in", values, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateNotIn(List<String> values) {
            addCriterion("Good_AfterRate not in", values, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateBetween(String value1, String value2) {
            addCriterion("Good_AfterRate between", value1, value2, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andGoodAfterrateNotBetween(String value1, String value2) {
            addCriterion("Good_AfterRate not between", value1, value2, "goodAfterrate");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareIsNull() {
            addCriterion("IndustryCompare is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareIsNotNull() {
            addCriterion("IndustryCompare is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareEqualTo(String value) {
            addCriterion("IndustryCompare =", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareNotEqualTo(String value) {
            addCriterion("IndustryCompare <>", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareGreaterThan(String value) {
            addCriterion("IndustryCompare >", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareGreaterThanOrEqualTo(String value) {
            addCriterion("IndustryCompare >=", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareLessThan(String value) {
            addCriterion("IndustryCompare <", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareLessThanOrEqualTo(String value) {
            addCriterion("IndustryCompare <=", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareLike(String value) {
            addCriterion("IndustryCompare like", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareNotLike(String value) {
            addCriterion("IndustryCompare not like", value, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareIn(List<String> values) {
            addCriterion("IndustryCompare in", values, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareNotIn(List<String> values) {
            addCriterion("IndustryCompare not in", values, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareBetween(String value1, String value2) {
            addCriterion("IndustryCompare between", value1, value2, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andIndustrycompareNotBetween(String value1, String value2) {
            addCriterion("IndustryCompare not between", value1, value2, "industrycompare");
            return (Criteria) this;
        }

        public Criteria andGoodLinkIsNull() {
            addCriterion("Good_Link is null");
            return (Criteria) this;
        }

        public Criteria andGoodLinkIsNotNull() {
            addCriterion("Good_Link is not null");
            return (Criteria) this;
        }

        public Criteria andGoodLinkEqualTo(String value) {
            addCriterion("Good_Link =", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkNotEqualTo(String value) {
            addCriterion("Good_Link <>", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkGreaterThan(String value) {
            addCriterion("Good_Link >", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkGreaterThanOrEqualTo(String value) {
            addCriterion("Good_Link >=", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkLessThan(String value) {
            addCriterion("Good_Link <", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkLessThanOrEqualTo(String value) {
            addCriterion("Good_Link <=", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkLike(String value) {
            addCriterion("Good_Link like", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkNotLike(String value) {
            addCriterion("Good_Link not like", value, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkIn(List<String> values) {
            addCriterion("Good_Link in", values, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkNotIn(List<String> values) {
            addCriterion("Good_Link not in", values, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkBetween(String value1, String value2) {
            addCriterion("Good_Link between", value1, value2, "goodLink");
            return (Criteria) this;
        }

        public Criteria andGoodLinkNotBetween(String value1, String value2) {
            addCriterion("Good_Link not between", value1, value2, "goodLink");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("Store_Name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("Store_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("Store_Name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("Store_Name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("Store_Name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("Store_Name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("Store_Name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("Store_Name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("Store_Name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("Store_Name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("Store_Name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("Store_Name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("Store_Name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("Store_Name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreLinkIsNull() {
            addCriterion("Store_Link is null");
            return (Criteria) this;
        }

        public Criteria andStoreLinkIsNotNull() {
            addCriterion("Store_Link is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLinkEqualTo(String value) {
            addCriterion("Store_Link =", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkNotEqualTo(String value) {
            addCriterion("Store_Link <>", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkGreaterThan(String value) {
            addCriterion("Store_Link >", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkGreaterThanOrEqualTo(String value) {
            addCriterion("Store_Link >=", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkLessThan(String value) {
            addCriterion("Store_Link <", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkLessThanOrEqualTo(String value) {
            addCriterion("Store_Link <=", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkLike(String value) {
            addCriterion("Store_Link like", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkNotLike(String value) {
            addCriterion("Store_Link not like", value, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkIn(List<String> values) {
            addCriterion("Store_Link in", values, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkNotIn(List<String> values) {
            addCriterion("Store_Link not in", values, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkBetween(String value1, String value2) {
            addCriterion("Store_Link between", value1, value2, "storeLink");
            return (Criteria) this;
        }

        public Criteria andStoreLinkNotBetween(String value1, String value2) {
            addCriterion("Store_Link not between", value1, value2, "storeLink");
            return (Criteria) this;
        }

        public Criteria andGoodHotIsNull() {
            addCriterion("Good_Hot is null");
            return (Criteria) this;
        }

        public Criteria andGoodHotIsNotNull() {
            addCriterion("Good_Hot is not null");
            return (Criteria) this;
        }

        public Criteria andGoodHotEqualTo(Integer value) {
            addCriterion("Good_Hot =", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotNotEqualTo(Integer value) {
            addCriterion("Good_Hot <>", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotGreaterThan(Integer value) {
            addCriterion("Good_Hot >", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("Good_Hot >=", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotLessThan(Integer value) {
            addCriterion("Good_Hot <", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotLessThanOrEqualTo(Integer value) {
            addCriterion("Good_Hot <=", value, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotIn(List<Integer> values) {
            addCriterion("Good_Hot in", values, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotNotIn(List<Integer> values) {
            addCriterion("Good_Hot not in", values, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotBetween(Integer value1, Integer value2) {
            addCriterion("Good_Hot between", value1, value2, "goodHot");
            return (Criteria) this;
        }

        public Criteria andGoodHotNotBetween(Integer value1, Integer value2) {
            addCriterion("Good_Hot not between", value1, value2, "goodHot");
            return (Criteria) this;
        }

        public Criteria andStoreAgeIsNull() {
            addCriterion("Store_Age is null");
            return (Criteria) this;
        }

        public Criteria andStoreAgeIsNotNull() {
            addCriterion("Store_Age is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAgeEqualTo(String value) {
            addCriterion("Store_Age =", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeNotEqualTo(String value) {
            addCriterion("Store_Age <>", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeGreaterThan(String value) {
            addCriterion("Store_Age >", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeGreaterThanOrEqualTo(String value) {
            addCriterion("Store_Age >=", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeLessThan(String value) {
            addCriterion("Store_Age <", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeLessThanOrEqualTo(String value) {
            addCriterion("Store_Age <=", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeLike(String value) {
            addCriterion("Store_Age like", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeNotLike(String value) {
            addCriterion("Store_Age not like", value, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeIn(List<String> values) {
            addCriterion("Store_Age in", values, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeNotIn(List<String> values) {
            addCriterion("Store_Age not in", values, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeBetween(String value1, String value2) {
            addCriterion("Store_Age between", value1, value2, "storeAge");
            return (Criteria) this;
        }

        public Criteria andStoreAgeNotBetween(String value1, String value2) {
            addCriterion("Store_Age not between", value1, value2, "storeAge");
            return (Criteria) this;
        }

        public Criteria andSellerCreditIsNull() {
            addCriterion("Seller_Credit is null");
            return (Criteria) this;
        }

        public Criteria andSellerCreditIsNotNull() {
            addCriterion("Seller_Credit is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCreditEqualTo(String value) {
            addCriterion("Seller_Credit =", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditNotEqualTo(String value) {
            addCriterion("Seller_Credit <>", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditGreaterThan(String value) {
            addCriterion("Seller_Credit >", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditGreaterThanOrEqualTo(String value) {
            addCriterion("Seller_Credit >=", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLessThan(String value) {
            addCriterion("Seller_Credit <", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLessThanOrEqualTo(String value) {
            addCriterion("Seller_Credit <=", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLike(String value) {
            addCriterion("Seller_Credit like", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditNotLike(String value) {
            addCriterion("Seller_Credit not like", value, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditIn(List<String> values) {
            addCriterion("Seller_Credit in", values, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditNotIn(List<String> values) {
            addCriterion("Seller_Credit not in", values, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditBetween(String value1, String value2) {
            addCriterion("Seller_Credit between", value1, value2, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andSellerCreditNotBetween(String value1, String value2) {
            addCriterion("Seller_Credit not between", value1, value2, "sellerCredit");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseIsNull() {
            addCriterion("Ishas_License is null");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseIsNotNull() {
            addCriterion("Ishas_License is not null");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseEqualTo(Integer value) {
            addCriterion("Ishas_License =", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseNotEqualTo(Integer value) {
            addCriterion("Ishas_License <>", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseGreaterThan(Integer value) {
            addCriterion("Ishas_License >", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ishas_License >=", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseLessThan(Integer value) {
            addCriterion("Ishas_License <", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseLessThanOrEqualTo(Integer value) {
            addCriterion("Ishas_License <=", value, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseIn(List<Integer> values) {
            addCriterion("Ishas_License in", values, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseNotIn(List<Integer> values) {
            addCriterion("Ishas_License not in", values, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseBetween(Integer value1, Integer value2) {
            addCriterion("Ishas_License between", value1, value2, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andIshasLicenseNotBetween(Integer value1, Integer value2) {
            addCriterion("Ishas_License not between", value1, value2, "ishasLicense");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationIsNull() {
            addCriterion("DescriptionSituation is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationIsNotNull() {
            addCriterion("DescriptionSituation is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationEqualTo(Double value) {
            addCriterion("DescriptionSituation =", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationNotEqualTo(Double value) {
            addCriterion("DescriptionSituation <>", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationGreaterThan(Double value) {
            addCriterion("DescriptionSituation >", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationGreaterThanOrEqualTo(Double value) {
            addCriterion("DescriptionSituation >=", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationLessThan(Double value) {
            addCriterion("DescriptionSituation <", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationLessThanOrEqualTo(Double value) {
            addCriterion("DescriptionSituation <=", value, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationIn(List<Double> values) {
            addCriterion("DescriptionSituation in", values, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationNotIn(List<Double> values) {
            addCriterion("DescriptionSituation not in", values, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationBetween(Double value1, Double value2) {
            addCriterion("DescriptionSituation between", value1, value2, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andDescriptionsituationNotBetween(Double value1, Double value2) {
            addCriterion("DescriptionSituation not between", value1, value2, "descriptionsituation");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeIsNull() {
            addCriterion("ServiceAttitude is null");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeIsNotNull() {
            addCriterion("ServiceAttitude is not null");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeEqualTo(Double value) {
            addCriterion("ServiceAttitude =", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeNotEqualTo(Double value) {
            addCriterion("ServiceAttitude <>", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeGreaterThan(Double value) {
            addCriterion("ServiceAttitude >", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("ServiceAttitude >=", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeLessThan(Double value) {
            addCriterion("ServiceAttitude <", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeLessThanOrEqualTo(Double value) {
            addCriterion("ServiceAttitude <=", value, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeIn(List<Double> values) {
            addCriterion("ServiceAttitude in", values, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeNotIn(List<Double> values) {
            addCriterion("ServiceAttitude not in", values, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeBetween(Double value1, Double value2) {
            addCriterion("ServiceAttitude between", value1, value2, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andServiceattitudeNotBetween(Double value1, Double value2) {
            addCriterion("ServiceAttitude not between", value1, value2, "serviceattitude");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceIsNull() {
            addCriterion("LogisticsService is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceIsNotNull() {
            addCriterion("LogisticsService is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceEqualTo(Double value) {
            addCriterion("LogisticsService =", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceNotEqualTo(Double value) {
            addCriterion("LogisticsService <>", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceGreaterThan(Double value) {
            addCriterion("LogisticsService >", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceGreaterThanOrEqualTo(Double value) {
            addCriterion("LogisticsService >=", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceLessThan(Double value) {
            addCriterion("LogisticsService <", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceLessThanOrEqualTo(Double value) {
            addCriterion("LogisticsService <=", value, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceIn(List<Double> values) {
            addCriterion("LogisticsService in", values, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceNotIn(List<Double> values) {
            addCriterion("LogisticsService not in", values, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceBetween(Double value1, Double value2) {
            addCriterion("LogisticsService between", value1, value2, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andLogisticsserviceNotBetween(Double value1, Double value2) {
            addCriterion("LogisticsService not between", value1, value2, "logisticsservice");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}