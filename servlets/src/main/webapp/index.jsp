<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<br/>

<a href="hello-servlet?a=123&b=123">Testa</a>
<br/>
<br/>

<form name="teste" action="hello-servlet">
    <fieldset>
        <legend>Formulário de Envio Metodo GET</legend>
        Nome: <input type="text" name="nome" /> <br/>
        E-mail: <input type="text" name="email" /> <br/>
        Confirmação de e-mail: <input type="text" name="email" /> <br/>
        Senha: <input type="password" name="senha" /><br/>
        Gênero: <input type="radio" name="genero" value="Masculino" /> Masculino
        <input type="radio" name="genero" value="Feminino" /> Feminino <br/>
        Receber notícias: <input type="checkbox" name="receber" value="ok" /><br/>
        <button type="submit">Enviar</button>
    </fieldset>
</form>

<form name="teste" action="hello-servlet" method="post">
    <fieldset>
        <legend>Formulário de Envio Metodo POST</legend>
        Nome: <input type="text" name="nome" /> <br/>
        E-mail: <input type="text" name="email" /> <br/>
        Confirmação de e-mail: <input type="text" name="email" /> <br/>
        Senha: <input type="password" name="senha" /><br/>
        Gênero: <input type="radio" name="genero" value="Masculino" /> Masculino
        <input type="radio" name="genero" value="Feminino" /> Feminino <br/>
        Receber notícias: <input type="checkbox" name="receber" value="ok" /><br/>
        <button type="submit">Enviar</button>
    </fieldset>
</form>
</body>
</html>