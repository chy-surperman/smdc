package com.chy.smdc.service.impl;

import com.chy.smdc.bean.Permission;
import com.chy.smdc.dao.PermissionMapper;
import com.chy.smdc.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;


    public List<Permission> getAllMenu() {
        List<Permission> list = permissionMapper.getAllMenu();
        List<Permission> rootPermission = new ArrayList<>();
        for (Permission info:list){
            if (info.getPid() == 0) {
                rootPermission.add(info);
            }
        }
        for (Permission info:rootPermission){
            List<Permission> childrenList= getChildrenMeun(info.getId(),list);
            info.setChildren(childrenList);
        }
        return rootPermission;
    }

    public List<Permission> getPermission() {
        List<Permission> list = permissionMapper.queryAll();

        //创建一个集合用于保存所有的主菜单
        List<Permission> rootPermission = new ArrayList<>();
        //遍历所有菜单集合,如果是主菜单的话直接放入rootPermission集合
        for (Permission info:list){
            //判断为0是因为我的主菜单标识是0
            if (info.getPid() == 0) {
                rootPermission.add(info);
            }
        }
        //这个是遍历所有主菜单,分别获取所有主菜单的所有子菜单
        for (Permission info:rootPermission){
            //获取所有子菜单 递归
            List<Permission> childrenList= getChildrenMeun(info.getId(),list);
            //这个是实体类中的子菜单集合
            info.setChildren(childrenList);
        }
        return rootPermission;
    }

    private List<Permission> getChildrenMeun(int id, List<Permission> allMeun){
        //用于保存子菜单
        List<Permission> childrenList=new ArrayList<>();
        for (Permission info: allMeun){
            //判断当前的菜单标识是否等于主菜单的id
            if (info.getPid() == id) {
                //如果是的话 就放入主菜单对象的子菜单集合
                childrenList.add(info);
            }
        }
        //这里就是递归了，遍历所有的子菜单
        for (Permission info:childrenList){
            info.setChildren(getChildrenMeun(info.getId(),allMeun));
        }
        //如果子菜单为空的话，那就说明某菜单下没有子菜单了，直接返回空,子菜单为空的话就不会继续
        //迭代了
        if(childrenList!=null && childrenList.size()==0){
            return null;
        }
        return  childrenList;
    }
}
