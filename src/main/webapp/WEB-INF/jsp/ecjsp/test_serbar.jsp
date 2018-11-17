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
    <div id="line" style="width: 600px;height: 400px;"></div>
</div>--%>
<div id="serBar" style="width: 100%;height: 100%;"></div>
<script>
    var serBarChart;
    $(function () {
        serBarChart = echarts.init(document.getElementById("serBar"));

        showSerBar();
    });

    function showSerBar() {
        $.ajax({
            type: "GET",
            url: "${ctx}/tec/serbardata.json",
            dataType: 'json',
            success: function (data) {
                var serBarOpt = getSerBarOpt();
                serBarOpt.title.text = '折线图';
                var fData = fmt.formatSerBarData(data);
                serBarOpt.legend.data = fData.legData;
                serBarOpt.xAxis[0].data = fData.category;
                serBarOpt.series = fData.series;
                serBarChart.setOption(serBarOpt);
            }
        });
    }
</script>
</body>
</html>
