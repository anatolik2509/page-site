<html>
<#import "spring.ftl" as spring>
<#import "bootstrap.ftl" as bootstrap>
<head>
    <link rel="stylesheet" href="<@spring.url "/static/css/style.css"/>"/>
    <@bootstrap.import/>
</head>
<body>
<div class="center">
    <form method="post" action="<@spring.url "/signUp"/>" class="column-container">
        <input name="login" class="placeholder form-field" placeholder="login"/>
        <input name="password" class="placeholder form-field" type="password" placeholder="password"/>
        <input name="passwordRepeat" class="placeholder form-field" type="password" placeholder="repeat password">
        <input class="btn btn-success" type="submit" value="submit"/>
    </form>
</div>
</body>
</html>