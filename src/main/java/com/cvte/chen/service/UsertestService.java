package com.cvte.chen.service;

import com.cvte.chen.dao.UsertestMapper;
import com.cvte.chen.entity.Usertest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */

@Service
public class UsertestService {
    @Resource
    UsertestMapper usertestMapper;

    public boolean selectByExample(Usertest test){
        if(usertestMapper.selectByExample(test).size() >0)
            return true;
        else
            return false;
    }

    public  int insert(Usertest record){
        return usertestMapper.insert(record);
    }

    public List<Usertest> selectAll( ){
        return usertestMapper.selectAll();
    }

    /**
     * 注解式事务配置
     * @param record
     * @param record2
     */
    @Transactional
    public void testTran(Usertest record,Usertest record2){
        usertestMapper.insert(record);
        usertestMapper.insert(record2);
    }
}
