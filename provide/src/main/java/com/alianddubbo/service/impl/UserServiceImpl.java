package com.alianddubbo.service.impl;

import com.alianddubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Joy
 * @time 2020/8/19 14:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName(Integer userId) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "id = " + userId + " |name = Joy" ;
    }
}
