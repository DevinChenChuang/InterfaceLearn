package com.course.server;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/",description = "my get method")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    @ApiOperation(value = "can get cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "success get cookies !";
    }


    @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
    @ApiOperation(value = "2 can get cookies",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "0 with cookies !";
        }
        for (Cookie cookie : cookies){
            if (cookie.getName().equals("login")&&
                    cookie.getValue().equals("true")){
                return "1 with cookies !";

            }
        }
        return "2 with cookies !";
    }


    @RequestMapping(value = "/get/with/param", method = RequestMethod.GET)
    @ApiOperation(value = "3 can get cookies",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("shoes",400);
        mylist.put("noodles",5);
        mylist.put("T-Shirt",300);

        if (start==10&&end==20){
            return mylist;
        }
        return null;
    }


    @RequestMapping(value = "/get/with/param/{start}/{end}", method = RequestMethod.GET)
    @ApiOperation(value = "4 can get cookies",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("shoes",400);
        mylist.put("noodles",5);
        mylist.put("T-Shirt",300);

        if (start==10&&end==20){
            return mylist;
        }
        return null;
    }
}
