package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobGroup;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class XxlJobGroupDaoTest {

    @Resource
    private XxlJobGroupDAO xxlJobGroupDAO;

    @Test
    public void test(){
        List<XxlJobGroup> list = xxlJobGroupDAO.findAll();

        List<XxlJobGroup> list2 = xxlJobGroupDAO.findByAddressType(0);

        XxlJobGroup group = new XxlJobGroup();
        group.setAppname("setAppName");
        group.setTitle("setTitle");
        group.setAddressType(0);
        group.setAddressList("setAddressList");
        group.setUpdateTime(new Date());

        int ret = xxlJobGroupDAO.save(group);

        XxlJobGroup group2 = xxlJobGroupDAO.load(group.getId());
        group2.setAppname("setAppName2");
        group2.setTitle("setTitle2");
        group2.setAddressType(2);
        group2.setAddressList("setAddressList2");
        group2.setUpdateTime(new Date());

        int ret2 = xxlJobGroupDAO.update(group2);

        int ret3 = xxlJobGroupDAO.remove(group.getId());
    }

}
