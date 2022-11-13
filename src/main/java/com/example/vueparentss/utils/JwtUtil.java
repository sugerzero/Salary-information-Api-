package com.example.vueparentss.utils;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

import java.util.Calendar;
import java.util.Map;


public class JwtUtil {
    private static  String  SING = "sakjdgf[]'''.[]aoifhl";
//    创建token
    public static String getJwt(Map<String,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        String sign = builder.withExpiresAt(instance.getTime()).sign(Algorithm.HMAC256(SING));
        return sign;
    }
//    验证token
    public static DecodedJWT setJwt(String token){
        return JWT.require(Algorithm.HMAC256(SING)).build().verify(token);
    }
}
