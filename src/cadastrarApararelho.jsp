<html>

<head>
  <meta charset="utf-8">
  <title>Cadastrar Aparelho</title>
  <link rel="stylesheet" href="estilo.css">

</head>

<body>
   <jsp:include page="menu.jsp" />
    <center><p style="color: aliceblue; position: absolute; margin-left: 40em; margin-top: 1em; ">CADASTRO DE APARELHO CELULAR</p></center>
    <div id="centro">
    <form action="salvar.jsp" method="post">
    <table width="200" border="0" align="center">
        <tr>
            <tr>
            <td height="40">Id do aparelho:</td>
            <td><select>
                <option></option>
                <option></option>
            </select></td>
        </tr>


        </tr>
        <tr>
            <td height="40">Modelo:</td>
            <td><input type="text" name="nome" value="" /></td>
        </tr>

        <tr>
            <td height="40">Altura:</td>
            <td><input type="number" name="altura" value="" /></td>
        </tr>

        <tr>
            <td height="40">Largura:</td>
            <td><input type="number" name="largura" value="" /></td>
        </tr>

        <tr>
            <td height="40">Espessura:</td>
            <td><input type="number" name="espessura" value="" /></td>
        </tr>

        <tr>
            <td height="40">Peso:</td>
            <td><input type="number" name="peso" value="" /></td>
        </tr>
        <tr>
            <td height="40">Preço:</td>
            <td><input type="number" name="preco" value="" /></td>
        </tr>
        <tr>
            <td height="40">Quantidade:</td>
            <td><input type="number" name="qtde" value="" /></td>
        </tr>
        <tr>
            <td height="40">Desconto:</td>
            <td><input type="number" name="desconto" value="" /></td>
        </tr>

        </table>
        <center><input type="submit" name="teste" value="Enviar" align="top" /></center>

        </form>

        </div>

</body>
</html>
