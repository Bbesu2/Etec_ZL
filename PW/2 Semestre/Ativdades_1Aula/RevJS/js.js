console.log("minha calculadora carregou.")

let num1 = Number(prompt("digite o primeiro numero: "))
let num2 = Number(prompt("digite o segundo numero: "))

let equaçao =prompt("qual a operacao que deseja fazer? \n"
            + "+ - * /");

function soma(num1,num2){
    console.log(num1+num2)
}


function subtracao(num1,num2){
    console.log(num1-num2)
}


function multiplicacao(num1,num2){
    console.log(num1*num2)
}


function divisão(num1,num2){
    console.log(num1/num2)
}

if(equaçao=="+"){
    console.log(soma);
}


else if(equaçao=="-"){
    console.log(subtracao);
}


else if(equaçao=="/"){
    console.log(divisão);
}


else if(equaçao=="*"){
    console.log(multiplicacao);
}