package com.jk.enjoylife.Service;

import com.jk.enjoylife.Dao.JkMapper;
import com.jk.enjoylife.Entity.Jk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JkService {
    @Autowired
    JkMapper jkMapper;

    public List<Jk> insert1(){
     return   jkMapper.selectall();

    }
}
