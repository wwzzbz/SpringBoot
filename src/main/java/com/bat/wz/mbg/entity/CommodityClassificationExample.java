package com.bat.wz.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class CommodityClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityClassificationExample() {
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

        public Criteria andGoodKindsNameIsNull() {
            addCriterion("Good_kinds_Name is null");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameIsNotNull() {
            addCriterion("Good_kinds_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameEqualTo(String value) {
            addCriterion("Good_kinds_Name =", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameNotEqualTo(String value) {
            addCriterion("Good_kinds_Name <>", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameGreaterThan(String value) {
            addCriterion("Good_kinds_Name >", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Good_kinds_Name >=", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameLessThan(String value) {
            addCriterion("Good_kinds_Name <", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameLessThanOrEqualTo(String value) {
            addCriterion("Good_kinds_Name <=", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameLike(String value) {
            addCriterion("Good_kinds_Name like", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameNotLike(String value) {
            addCriterion("Good_kinds_Name not like", value, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameIn(List<String> values) {
            addCriterion("Good_kinds_Name in", values, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameNotIn(List<String> values) {
            addCriterion("Good_kinds_Name not in", values, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameBetween(String value1, String value2) {
            addCriterion("Good_kinds_Name between", value1, value2, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andGoodKindsNameNotBetween(String value1, String value2) {
            addCriterion("Good_kinds_Name not between", value1, value2, "goodKindsName");
            return (Criteria) this;
        }

        public Criteria andUpperIdIsNull() {
            addCriterion("Upper_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpperIdIsNotNull() {
            addCriterion("Upper_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpperIdEqualTo(Integer value) {
            addCriterion("Upper_ID =", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotEqualTo(Integer value) {
            addCriterion("Upper_ID <>", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdGreaterThan(Integer value) {
            addCriterion("Upper_ID >", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Upper_ID >=", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdLessThan(Integer value) {
            addCriterion("Upper_ID <", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdLessThanOrEqualTo(Integer value) {
            addCriterion("Upper_ID <=", value, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdIn(List<Integer> values) {
            addCriterion("Upper_ID in", values, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotIn(List<Integer> values) {
            addCriterion("Upper_ID not in", values, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdBetween(Integer value1, Integer value2) {
            addCriterion("Upper_ID between", value1, value2, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Upper_ID not between", value1, value2, "upperId");
            return (Criteria) this;
        }

        public Criteria andUpperNameIsNull() {
            addCriterion("Upper_Name is null");
            return (Criteria) this;
        }

        public Criteria andUpperNameIsNotNull() {
            addCriterion("Upper_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUpperNameEqualTo(String value) {
            addCriterion("Upper_Name =", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameNotEqualTo(String value) {
            addCriterion("Upper_Name <>", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameGreaterThan(String value) {
            addCriterion("Upper_Name >", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameGreaterThanOrEqualTo(String value) {
            addCriterion("Upper_Name >=", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameLessThan(String value) {
            addCriterion("Upper_Name <", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameLessThanOrEqualTo(String value) {
            addCriterion("Upper_Name <=", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameLike(String value) {
            addCriterion("Upper_Name like", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameNotLike(String value) {
            addCriterion("Upper_Name not like", value, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameIn(List<String> values) {
            addCriterion("Upper_Name in", values, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameNotIn(List<String> values) {
            addCriterion("Upper_Name not in", values, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameBetween(String value1, String value2) {
            addCriterion("Upper_Name between", value1, value2, "upperName");
            return (Criteria) this;
        }

        public Criteria andUpperNameNotBetween(String value1, String value2) {
            addCriterion("Upper_Name not between", value1, value2, "upperName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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