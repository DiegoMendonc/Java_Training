Algoritmo "ProcedimentoExemploDeSoma"
Procedimento multi(x, y: real)          //Multiplicação

Var
aux: real

Inicio
aux <- x * y
res <- aux
Escreva("O resultado da operação é de: ")
Fimprocedimento

Procedimento sub(x, y: real)         // subtração

Var
aux: real

Inicio
aux <- x - y
res <- aux
Escreva("O resultado da operação é de: ")
Fimprocedimento

Procedimento soma(x, y: real)

Var
aux: real

Inicio
aux <- x + y
res <- aux
Escreva("O resultado da operação é de: ")
Fimprocedimento

Procedimento divi(x, y: real)

Var
aux: real

Inicio
aux <- x / y
res <- aux
Escreva("O resultado da operação é de: ")
Fimprocedimento
Var
// Seção de Declarações das variáveis 
res, n, m: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Bem-vindos ao programa random.")
Escreva("Favor digite o primeiro número para multi: ")
Leia(n)
Escreva("Favor digite o segundo número para multi: ")
Leia(m)

soma(n,m)
Escreva(res)

Fimalgoritmo