package com.liugh;

import com.liugh.bean.Log;
import com.liugh.bean.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component(value = "factory")
public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        System.out.println("...getObject..");;
        return new Log();
//      return new UserFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("---getObjectType---");
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
