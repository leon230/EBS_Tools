<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="cg" uri="customTLD.tld" %>

<html xmlns:th="http://www.thymeleaf.org">
<body>

<div th:if="${message}">
    <h2 th:text="${message}"/>
</div>

<div>
    <form method="POST" enctype="multipart/form-data" action="/">
        <table>
            <tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
            <tr><td></td><td><input type="submit" value="Upload" /></td></tr>
        </table>
    </form>
</div>

<div>

    <ul>
        <li th:each="file : ${files}">
            <a th:href="${file}" th:text="${file}" />
        </li>
    </ul>
</div>

</body>
</html>