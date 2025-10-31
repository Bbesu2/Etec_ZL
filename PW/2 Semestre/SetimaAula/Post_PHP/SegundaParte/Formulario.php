<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro Simples</title>
</head>
<body>

<?php
if (isset($_GET['erro'])):?>
<p style="color:red">
    <?php echo htmlspecialchars(string: $_GET['erro']);?>
</p>
<?php endif?>


<form action="Processa.php" method="POST">
<label>Nome: <br>
    <input type="text" name="nome">
</label> <br><br>

<label>Idade: <br>
    <input type="text" name="idade">
</label> <br><br>

<label>CPF: <br>
    <input type="text" name="cpf">
</label> <br><br>

<label>RG: <br>
    <input type="text" name="rg">
</label> <br><br>

<input type="submit" value="Enviar">
</form>

</body>
</html>