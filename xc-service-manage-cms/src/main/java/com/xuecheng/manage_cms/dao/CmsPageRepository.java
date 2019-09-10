package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Desc
 * @Author Lyang
 * @Date 2019/9/6
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

}
