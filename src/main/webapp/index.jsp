<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<dl>
    <s:iterator value="depts" var="dept">
        <dt>
            <s:property value="#dept.dname"/>
            <s:iterator value="#dept.emps" var="e">
                <dd><s:property value="#e.ename"></s:property></dd>
            </s:iterator>
        </dt>
    </s:iterator>
</dl>
</body>
</html>
