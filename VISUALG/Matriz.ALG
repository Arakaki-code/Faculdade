Algoritmo "matrix"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/04/2022
Var
numeros: vetor [1..5,1..5] de inteiro
i, j : inteiro
soma: inteiro

Inicio
soma <- 1
para i de 1 ate 5 faca
     para j de 1 ate 5 faca
          soma <- soma + 10
          numeros[i,j] <- soma
     fimpara
fimpara

escreval("------------------------------------------")
para i de 1 ate 5 faca
     para j de 1 ate 5 faca
          escreva("valor para linha ",i," e coluna ",j,": ")
          escreval(numeros[i,j])
     fimpara
fimpara
Fimalgoritmo