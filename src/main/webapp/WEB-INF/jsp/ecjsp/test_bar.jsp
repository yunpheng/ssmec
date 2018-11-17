<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'map.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="${ctx }/ui/js/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx }/ui/echarts/echarts-3.2.3/dist/echarts.js"></script>
    <script type="text/javascript" src="${ctx }/ui/echarts/config/configopts.js"></script>
</head>

<body>
<%--<div style="width: 600px;height: 400px;background-color: #00CC33;">
    <div id="bar" style="width: 600px;height: 400px;"></div>
</div>--%>
<div id="bar" style="width: 100%;height: 100%;"></div>
<script>
    var barChart;
    $(function () {
        barChart = echarts.init(document.getElementById("bar"));

        showBar();
    });

    function showBar() {
        $.ajax({
            type: "GET",
            url: "${ctx}/tec/bardata.json",
            dataType: 'json',
            success: function (data) {
                var barOpt = getBarOpt();
                barOpt.title.text = '柱形图';
                barOpt.xAxis[0].name = '日期';
                barOpt.yAxis[0].name = '数量';
                barOpt.series[0].name = '柱形图';
                var fData = fmt.formatBarData(data);
                barOpt.xAxis[0].data = fData.xAxData;
                barOpt.series[0].data = fData.serData;
                barChart.setOption(barOpt);
            }
        });
    }
</script>
</body>
</html>
