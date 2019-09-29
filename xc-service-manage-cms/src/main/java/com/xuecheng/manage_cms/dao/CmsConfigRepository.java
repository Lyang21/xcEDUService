package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Desc
 * @Author Lyang
 * @Date 2019/9/18
 */
public interface CmsConfigRepository  extends MongoRepository<CmsConfig,String> {


}
