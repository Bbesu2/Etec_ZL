let string = "texto";
let int = 15;
let float = 13.7;
let boolean = true;

function var_Dump(variable) {
  console.log("Valor:", variable);
  console.log("Tipo:", typeof variable,variable.length);
  console.log("            ");
}

var_Dump(string);
var_Dump(int);
var_Dump(float);
var_Dump(boolean);