package com.xuecheng.manage_cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Desc
 * @Author Lyang
 * @Date 2019/9/6
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testFindAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println("====================");
        System.out.println(all);
    }

    //分页测试
    @Test
    public void testFindPage() {
        int page = 0;//从0开始
        int size = 10;//每页记录数
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all.toString());
    }

    //自定义条件查询测试
    @Test
    public void testFindAllByExample(){
        int page = 0;//从0开始
        int size = 10;//每页记录数
        Pageable pageable = PageRequest.of(page, size);

        CmsPage cmsPage = new CmsPage();
        cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        //条件匹配器
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        //定义Example
        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example,pageable);
        List<CmsPage> content = all.getContent();
        System.out.println(content);
    }

    //修改
    @Test
    public void testUpdate() {
        Optional<CmsPage> optional = cmsPageRepository.findById("5abefd525b05aa293098fca6");
        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            cmsPage.setPageName("index2.html");
            cmsPageRepository.save(cmsPage);
        }
    }

    @Test
    public void testfindByPageName(){
        CmsPage cmsPage = cmsPageRepository.findByPageName("测试页面");
        System.out.println(cmsPage);
    }
}
