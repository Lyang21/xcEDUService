package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.utils.PageInfo;
import io.swagger.annotations.Api;

/**
 * @Desc
 * @Author Lyang
 * @Date 2019/9/6
 */
@Api(value="cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {

    //页面查询
    public QueryResponseResult findList(PageInfo pageInfo, QueryPageRequest queryPageRequest);
}
