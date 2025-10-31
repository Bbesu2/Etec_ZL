<?php

// conecao com banco de dados
$host = 'localhost';
$dbname = 'cadastrosimples';
$usuario = 'root'; // usuario MySQL
$senha = ''; // senha do usuario MySQL

try{
    $pdo = new PDO(dsn: "mysql:host=$host;dbname=$dbname;charset=utf8", username: $usuario, password: $senha);
    $pdo->setAttribute(attribute: PDO::ATTR_ERRMODE, value: PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Erro na conexao com o banco de dados: ". $e->getMessage());
}

// Funcao para limpar os dados

function clear($s): string {
    return htmlspecialchars(string: trim(string: $s), flags: ENT_QUOTES, encoding: 'UTF-8');
}

//verifica se o formulario foi enviado
if ($_SERVER['REQUEST_METHOD'] === 'POST'){
     
    $nome = clear($_POST['nome'] ?? '');
        $idade = clear($_POST['idade'] ?? '');

            $cpf = clear($_POST['cpf'] ?? '');

                $rg = clear($_POST['rg'] ?? '');

    // Validadeções basicas
    $erros = [];

    if ($nome === '') $erros[] = "nome é obrigatorio.";
        if ($idade === '' || !ctype_digit(text: $idade)) $erros[] = "idade invalida.";
        $cpf_digits = preg_replace(pattern: '/\D/', replacement: '', subject: $cpf);
        if(strlen(string: $cpf_digits) !==11) $erros[] = "CPF invalido.";
         $rg_digits = preg_replace(pattern: '/\D/', replacement: '', subject: $rg);
         if(strlen(string: $rg_digits)<5) $erros[] = 'RG invalido.';

    if(!empty($erros)) {
        $erro_msg = implode(separator: '<br>', array: $erros);
        header(header: "location: formulario.php?erro=" . urlencode(string: $erro_msg));
        exit;
    }

    // insere os dados no banco

    try{
        $stmt = $pdo->prepare(query: "INSERT INTO pessoas(nome, idade, cpf, rg) VALUES (?, ?, ?, ?)");
        $stmt->execute(params:[$nome,$idade,$cpf_digits,$rg_digits]);
        
        echo "<h2>Cadastro realizadeo com sucesso!</h2>";
        echo "<p><strong>Nome:</Strong> $nome</p>";
        echo "<p><strong>Idade:</Strong> $idade</p>";
        echo "<p><strong>CPF:</Strong> $cpf_digits</p>";
        echo "<p><strong>RG:</Strong> $rg_digits</p>";
        echo '<p> <a href="Formulario.php">Voltar</a> </p>';
    } catch (PDOException $e){
        die("Erro ao inserir dados: " . $e->getMessage());
    }

}
