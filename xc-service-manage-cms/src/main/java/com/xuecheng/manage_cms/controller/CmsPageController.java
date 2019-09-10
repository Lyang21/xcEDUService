package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.utils.PageInfo;
import com.xuecheng.manage_cms.service.PageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc
 * @Author Lyang
 * @Date 2019/9/6
 */
@RestController
@RequestMapping("/cmsPage")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    PageService pageService;

    @Override
    @ApiOperation(value = "cmsPage列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public QueryResponseResult findList(@ModelAttribute PageInfo pageInfo, QueryPageRequest queryPageRequest) {

//        //暂时采用测试数据，测试接口是否可以正常运行
//        QueryResult queryResult = new QueryResult();
//        queryResult.setTotal(2);
//        //静态数据列表
//        List list = new ArrayList();
//        CmsPage cmsPage = new CmsPage();
//        cmsPage.setPageName("测试页面");
//        list.add(cmsPage);
//        queryResult.setList(list);
//        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
//
//        return queryResponseResult;


        return pageService.findList(pageInfo.getPageIndex(),pageInfo.getPageSize(),queryPageRequest);
    }
}
