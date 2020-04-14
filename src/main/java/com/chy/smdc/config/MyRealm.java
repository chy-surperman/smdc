package com.chy.smdc.config;

import com.chy.smdc.bean.User;
import com.chy.smdc.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    UserServiceImpl UserServiceimpl;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("----授权");

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        System.out.println(user.getPassword());
        simpleAuthorizationInfo.addStringPermission("user:add");
        return simpleAuthorizationInfo;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("----认证");
        UsernamePasswordToken authenticationToken1 = (UsernamePasswordToken) authenticationToken;
        System.out.println(authenticationToken1.getUsername());


        User userByUsername = UserServiceimpl.getUserByUsername(authenticationToken1.getUsername());
        System.out.println(userByUsername);
        if (userByUsername == null){
            return  null;
        }
        return new SimpleAuthenticationInfo(userByUsername,userByUsername.getPassword(),"");
    }
}
