package com.chy.smdc.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class shiroconfig  {

  //shiroFilterFactoryBeam
    @Bean
  public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager getDefaultWebSecurityManager){
      ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
      bean.setSecurityManager(getDefaultWebSecurityManager);
      //添加shiro内置过滤器
        Map<String, String> filterChainDefinitionMap=new LinkedHashMap<>();
        filterChainDefinitionMap.put("/user/add","perms[user:add]");
        filterChainDefinitionMap.put("/user/update","perms[user:update]");
        filterChainDefinitionMap.put("/user/*","authc");

        bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        bean.setLoginUrl("/tologin");
        bean.setUnauthorizedUrl("/unauth");
      return   bean;
  }


    //DafaultwebSecrityManager
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("myRealm")MyRealm myRealm){
        DefaultWebSecurityManager SecurityManager = new DefaultWebSecurityManager();
        SecurityManager.setRealm(myRealm);
        return SecurityManager;
    }
    //创建realm对象
   @Bean
    public MyRealm myRealm(){
        return  new MyRealm();
    }

   @Bean
   public ShiroDialect getShiroDialect(){
        return  new ShiroDialect();
   }

}
