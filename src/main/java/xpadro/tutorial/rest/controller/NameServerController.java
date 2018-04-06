package xpadro.tutorial.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by apple on 24/03/2018.
 */
@Controller
public class NameServerController {

    @Value("${diamond.server}")
    private String diamondServer;

    @Value("${config.server}")
    private String configServer;

    @RequestMapping(value = "diamond-server/diamond",method = RequestMethod.GET)
    @ResponseBody
    public String getDiamondAddress() throws Exception{
        return diamondServer;
    }

    @RequestMapping(value = "diamond-server/basestone",method = RequestMethod.GET)
    @ResponseBody
    public String getBasestoneDiamondAddress() throws Exception{
        return diamondServer;
    }

    @RequestMapping(value = "diamond-server/status.taobao",method = RequestMethod.GET)
    @ResponseBody
    public String getDiamondStatus() throws Exception{
        return "OK";
    }

    @RequestMapping(value = "configserver/serverlist",method = RequestMethod.GET)
    @ResponseBody
    public String getConfigServerAddress() throws Exception{
        return configServer;
    }
}
