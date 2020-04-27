package com.bat.wz.nosql.elasticsearch.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Classname EsProduct
 * @Description TODO
 * @Date 2020/4/27 16:57
 * @Created by wz
 */

/**
 * //标示映射到Elasticsearch文档上的领域对象
 * public @interface Document {
 *   //索引库名次，mysql中数据库的概念
 * 	String indexName();
 *   //文档类型，mysql中表的概念
 * 	String type() default "";
 *   //默认分片数
 * 	short shards() default 5;
 *   //默认副本数量
 * 	short replicas() default 1;
 *
 * }
 */
@Document(indexName = "pms",type = "product",shards = 1,replicas = 0)
public class EsProduct implements Serializable {
    private static final long serialVersionUID = -1L;
    @Id//文档的id，文档可以认为是mysql中表行的概念
    private Long id;
    /**
     * Field
     * //文档中字段的类型
     * 	FieldType type() default FieldType.Auto;
     *   //是否建立倒排索引
     * 	boolean index() default true;
     *   //是否进行存储
     * 	boolean store() default false;
     *   //分词器名次
     * 	String analyzer() default "";
     *FieldType
     * 	Text,//会进行分词并建了索引的字符类型
     * 	Integer,
     * 	Long,
     * 	Date,
     * 	Float,
     * 	Double,
     * 	Boolean,
     * 	Object,
     * 	Auto,//自动判断字段类型
     * 	Nested,//嵌套对象类型
     * 	Ip,
     * 	Attachment,
     * 	Keyword//不会进行分词建立索引的类型
     *
     */
    @Field(type = FieldType.Keyword)
    private String productSn;
    private Long brandId;
    @Field(type = FieldType.Keyword)
    private String brandName;
    private Long productCategoryId;
    @Field(type = FieldType.Keyword)
    private String productCategoryName;
    private String pic;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String name;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String subTitle;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String keywords;
    private BigDecimal price;
    private Integer sale;
    private Integer newStatus;
    private Integer recommandStatus;
    private Integer stock;
    private Integer promotionType;
    private Integer sort;
//    @Field(type =FieldType.Nested)
//    private List<EsProductAttributeValue> attrValueList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
