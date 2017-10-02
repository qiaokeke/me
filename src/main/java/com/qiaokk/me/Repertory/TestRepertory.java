package com.qiaokk.me.Repertory;

import com.qiaokk.me.domain.TestDomain;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017/10/2 20:42
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */


public interface TestRepertory extends Repository<TestDomain,Integer>{
    TestDomain save(TestDomain testDomain);
    List<TestDomain> findAllByOrderByIdAsc();
}
