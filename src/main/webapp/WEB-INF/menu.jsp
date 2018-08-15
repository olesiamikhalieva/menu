<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet"
          media="screen">
    <link href="css/nestednav.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Menu</h1>
    <div id="main-nav" class="navbar navbar-inverse">
        <div class="navbar-inner">
            <div class="dropdown">
                <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Sport
                    <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li class="dropdown-submenu">
                        <a class="test" tabindex="-1" href="#">Setting<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">Create</a></li>
                            <li><a tabindex="-1" href="#">Delete</a></li>
                            <li><a tabindex="-1" href="#">Update</a></li>
                        </ul>
                    </li>
                    <c:forEach var="level" items="${level_2_list}">
                        <li><a tabindex="-1" href="#">${level.name}</a></li>
                    </c:forEach>
                    <%--<li><a tabindex="-1" href="#">Box</a></li>--%>
                    <%--<li><a tabindex="-1" href="#">Skate</a></li>--%>
                    <li class="dropdown-submenu">
                        <a class="test" tabindex="-1" href="#">Swim<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="dropdown-submenu">
                                <a class="test" tabindex="-1" href="#">Setting<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a tabindex="-1" href="#">Create</a></li>
                                    <li><a tabindex="-1" href="#">Delete</a></li>
                                    <li><a tabindex="-1" href="#">Update</a></li>
                                </ul>
                            </li>
                            <li><a tabindex="-1" href="#">Butterfly</a></li>
                            <li><a tabindex="-1" href="#">Krol</a></li>
                            <li class="dropdown-submenu">
                                <a class="test" href="#">SuperSwim <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">Setting<span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="#">Create</a></li>
                                            <li><a tabindex="-1" href="#">Delete</a></li>
                                            <li><a tabindex="-1" href="#">Update</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Super1</a></li>
                                    <li><a href="#">Super2</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="js/jquery.nestednav.js"></script>


</body>
</html>
