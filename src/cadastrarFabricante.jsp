<html>

<head>
  <meta charset="utf-8">
  <title>Cadastrar Aparelho</title>
  <link rel="stylesheet" href="estilo.css">

</head>

<body>
   <jsp:include page="menu.jsp" />
    <center><p style="color: aliceblue; position: absolute; margin-left: 40em; margin-top: 1em; ">CADASTRO DE FABRICANTE DE CELULAR</p></center>
    <div id="centro">
    <form action="salvar.jsp" method="post">
    <table width="200" border="0" align="center">
        <tr>
            <td height="40">Id do fabricante:</td>
            <td><input disabled type="text" name="id_aparelho" value=""/></td>

        </tr>
        <tr>
            <td height="40">Nome:</td>
            <td><input type="text" name="nome" value="" /></td>
        </tr>

        <tr>
            <td height="40">CNPJ:</td>
            <td><input type="number" name="cnpj" value="" /></td>
        </tr>

        </table>
        <center><input type="submit" name="teste" value="Enviar" align="top" /></center>

        </form>

        </div>

</body>
</html>
