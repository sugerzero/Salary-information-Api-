package com.example.vueparentss.components;

import com.example.vueparentss.utils.ImageCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestController("/")
public class ImageCodeController {


    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @GetMapping("/code")
    public String ImagCode( HttpServletResponse response){

        String securityCode = ImageCodeUtil.getSecurityCode();

        stringRedisTemplate.opsForValue().set("code",securityCode,5, TimeUnit.HOURS );
        BufferedImage image = ImageCodeUtil.createImage(securityCode);

        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            ImageIO.write(image,"png",outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "Success";
    }


}
