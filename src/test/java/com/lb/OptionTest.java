package com.lb;

import com.lb.dao.LbOptionDao;
import com.lb.entity.LbOption;
import org.beetl.sql.core.query.LambdaQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class OptionTest {
    @Autowired
    private LbOptionDao lbOptionDao;

    @Test
    public void countPrice() {
        LambdaQuery<LbOption> query = lbOptionDao.createLambdaQuery();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        query.andIn(LbOption::getId,list);
        System.out.println(query.count());
    }
}
