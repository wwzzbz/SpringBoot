package com.bat.wz.nosql.elasticsearch.repository;

import com.bat.wz.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Classname EsProductRepository
 * @Description TODO
 * @Date 2020/4/27 17:03
 * @Created by wz
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {
    /**
     * 搜索查询
     *
     * @param name              商品名称
     * @param subtitle          商品标题
     * @param keywords          商品关键字
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOOrKeywords(String name, String subtitle, String keywords, Pageable page);
}
