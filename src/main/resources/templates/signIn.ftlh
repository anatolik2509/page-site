<html>
<#import "spring.ftl" as spring>
<#import "bootstrap.ftl" as bootstrap>
<head>
    <link rel="stylesheet" href="<@spring.url "/static/css/style.css"/>"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

    <@bootstrap.import/>
</head>
<body>
<div class="center">
    <form action="<@spring.url "/signIn"/>" class="column-container">
        <input name="login" class="placeholder form-field" placeholder="login"/>
        <input name="password" class="placeholder form-field" type="password" placeholder="password"/>
        <input class="btn btn-success" type="submit" value="submit"/>
    </form>
</div>
</body>
</html>