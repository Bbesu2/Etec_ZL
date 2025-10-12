<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
            $notaUm = 8;
            $notaDois = 7;
            $notaTres = 10;

        $media= ($notaUm+$notaDois+$notaTres)/3;

            if($media>=7){
                echo "Aluno aprovado com média $media";}
            else{echo "Aluno reprovado com média $media";}
    ?>
</body>
</html>