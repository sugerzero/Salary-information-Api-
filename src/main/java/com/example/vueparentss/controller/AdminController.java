package com.example.vueparentss.controller;

import com.example.vueparentss.entity.Admin;
import com.example.vueparentss.service.AdminService;
import com.example.vueparentss.utils.JwtUtil;
import com.example.vueparentss.utils.MD5;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2022-02-11 19:02:59
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     *
     * 登录系统
     */

    @GetMapping("selectOne")
    public Map<String,Object> selectOne(String id, String password, String code, HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        String code1 = stringRedisTemplate.opsForValue().get("code");
//        Admin admin = this.adminService.queryById(id);
//        if (code1.equals(code) ){
//            System.out.println(admin != null);
//            if (admin != null){
//                if (admin.getPassword().equals(MD5.md5(password))){
//                    session.setAttribute("id",id);
//                    return "Success";
//                }else{
//                    return "error";
//                }
//            }else {
//                return "error";
//            }
//        }else {
//            return "error";
//        }
        String code1 = stringRedisTemplate.opsForValue().get("code");
        HashMap<String, Object> maps = new HashMap<>();
        Admin admin = this.adminService.queryById(id);
        String account = admin.getAccount();
        if (code1.equals(code) ) {
            if (admin != null) {
                if (admin.getPassword().equals(MD5.md5(password))) {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("account", id);
                    map.put("password", password);
                    String jwt = JwtUtil.getJwt(map);
                    maps.put("token", jwt);
                    maps.put("UserName", account);
                    return maps;
                } else {
                    return maps;
                }
            } else {
                return maps;
            }
        }
        return maps;
}
    /**
     * 添加数据
     * @admin Admin对象
     * return String
     *
     *注册账号
     */
    @PostMapping("/insert")
    public String insert(Admin admin){
        Admin admins = this.adminService.queryById(admin.getAccount());
        if (admins != null){
            return "用户名存在";
        }else{
            admin.setPassword(MD5.md5(admin.getPassword()));
            int insert = this.adminService.insert(admin);

            if (insert != 0 ) {
                return "添加成功";
            }else{
                return "添加失败";
            }
        }
    }


}