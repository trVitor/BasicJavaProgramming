function soma() {
var n1, n2;
n1 = parseInt(document.getElementById("primeiroNumero").value);
n2 = parseInt(document.getElementById("segundoNumero").value);
soma = n1 + n2;
document.getElementById("resposta").innerHTML = soma;
}
