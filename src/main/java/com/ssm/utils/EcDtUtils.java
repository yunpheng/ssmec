package com.ssm.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EcDtUtils {

    public static List<String> splStr2List(String str, String spl) {
        String[] strs = null;
        List<String> strList = null;
        if (str != null) {
            strs = str.split(spl);
            if (strs != null) {
                strList = new ArrayList<String>();
                for (String st : strs) {
                    strList.add(st != null ? st.trim() : "");
                }
            }
        }
        return strList;
    }

    public static List<HashMap<String, Object>> getBarRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = splStr2List("周日, 周一, 周二, 周三, 周四, 周五, 周六", ",");
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

    public static List<HashMap<String, Object>> getSerBarRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> groups = splStr2List("周日, 周一, 周二, 周三, 周四, 周五, 周六", ",");
        List<String> names = splStr2List("吃饭, 喝水, 学习, 打游戏, 运动", ",");
        for (String group : groups) {
            for (String name : names) {
                HashMap<String, Object> vals = new HashMap<String, Object>();
                vals.put("group", group);
                vals.put("name", name);
                vals.put("value", Math.round(Math.random() * 100));
                list.add(vals);
            }
        }
        return list;
    }

    public static List<HashMap<String, Object>> getLineRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> groups = splStr2List("周日, 周一, 周二, 周三, 周四, 周五, 周六", ",");
        List<String> names = splStr2List("吃饭, 喝水, 学习, 打游戏, 运动", ",");
        for (String grp : groups) {
            for (String nam : names) {
                HashMap<String, Object> vals = new HashMap<String, Object>();
                vals.put("group", grp);
                vals.put("name", nam);
                vals.put("value", Math.round(Math.random() * 100));
                list.add(vals);
            }
        }
        return list;
    }

    public static List<HashMap<String, Object>> getPieRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = splStr2List("A, B, C, D, E, F, G", ",");
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

    public static List<HashMap<String, Object>> getGzMapRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = splStr2List("遵义市, 黔东南苗族侗族自治州, 毕节市, 黔南布依族苗族自治州, 铜仁市, "
                + "黔西南布依族苗族自治州, 六盘水市, 安顺市, 贵阳市", ",");
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

    public static List<HashMap<String, Object>> getRadarRndVal() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = splStr2List("攻击, 防御, 天赋, 生存, 体力", ",");
        String group = "属性";
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("group", group);
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

}
