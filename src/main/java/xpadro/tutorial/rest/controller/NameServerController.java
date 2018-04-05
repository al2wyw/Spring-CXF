package xpadro.tutorial.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;

/**
 * Created by apple on 24/03/2018.
 */
@Controller
public class NameServerController {

    @RequestMapping(value = "diamond-server/diamond",method = RequestMethod.GET)
    @ResponseBody
    public String getDiamondAddress() throws Exception{
        return "192.168.1.104";
    }

    @RequestMapping(value = "diamond-server/status.taobao",method = RequestMethod.GET)
    @ResponseBody
    public String getDiamondStatus() throws Exception{
        return "OK";
    }

    @RequestMapping(value = "configserver/serverlist",method = RequestMethod.GET)
    @ResponseBody
    public String getConfigServerAddress() throws Exception{
        return "192.168.1.104";
    }
}
