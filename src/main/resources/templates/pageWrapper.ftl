<#macro wrap title>
    <html>
    <head>
        <title>${title}</title>
        <#import 'bootstrap.ftl' as bootstrap>
        <#import 'spring.ftl' as spring>
        <@bootstrap.import/>
        <link rel="stylesheet" href="<@spring.url "/static/css/style.css"/>"/>
    </head>
    <body>
    <#nested>
    </body>
    </html>
</#macro>