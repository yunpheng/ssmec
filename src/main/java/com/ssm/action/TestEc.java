package com.ssm.action;

import com.ssm.utils.EcDtUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/tec")
@Controller
public class TestEc {

    @RequestMapping("/bar")
    public ModelAndView toBar(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_bar");
    }

    @RequestMapping("serbar")
    public ModelAndView toSerBar(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_serbar");
    }

    @RequestMapping("/line")
    public ModelAndView toLine(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_line");
    }

    @RequestMapping("/pie")
    public ModelAndView toPie(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_pie");
    }

    @RequestMapping("/gzmap")
    public ModelAndView toGzMap(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_gzmap");
    }

    @RequestMapping("/radar")
    public ModelAndView toRadar(HttpServletRequest request) {
        return new ModelAndView("ecjsp/test_radar");
    }

    @RequestMapping(value = "/bardata",method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap<String, Object>> barData(HttpServletRequest request) {
        /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> bList = EcDtUtils.getBarRndVal();
        return bList;
    }

    @RequestMapping("serbardata")
    @ResponseBody
    public List<HashMap<String, Object>> serBarData(HttpServletRequest request) {
         /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> sbList = EcDtUtils.getSerBarRndVal();
        return sbList;
    }

    @RequestMapping("/linedata")
    @ResponseBody
    public List<HashMap<String, Object>> lineData(HttpServletRequest request) {
        /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> lList = EcDtUtils.getLineRndVal();
        return lList;
    }

    @RequestMapping("/piedata")
    @ResponseBody
    public List<HashMap<String, Object>> pieData(HttpServletRequest request) {
        /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> pList = EcDtUtils.getPieRndVal();
        return pList;
    }

    @RequestMapping("/gzmapdata")
    @ResponseBody
    public List<HashMap<String, Object>> gzMapData(HttpServletRequest request) {
        /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> gmList = EcDtUtils.getGzMapRndVal();
        return gmList;
    }

    @RequestMapping("/radardata")
    @ResponseBody
    public List<HashMap<String, Object>> radarData(HttpServletRequest request) {
        /*
        测试数据，正式环境从数据库读取
         */
        List<HashMap<String, Object>> rList = EcDtUtils.getRadarRndVal();
        return rList;
    }

}
