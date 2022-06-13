Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/04/2022
Var
notas: vetor [1..5] de real
alunos: vetor [1..5] de caractere
contador1 : inteiro
media: real
soma: real

Inicio
soma <- 0
para contador1 de 1 ate 5 faca
     escreva("Digite Nome do(a) ", contador1, " aluno(a): ")
     leia(alunos[contador1])
     escreva("Digite Nota do(a) ",alunos[contador1], ": ")
     leia(notas[contador1])
     escreval("------------------------------------------")
     soma <- soma + notas[contador1]
fimpara

media <- soma / 5
para contador1 de 1 ate 5 faca
     escreval("índice:",contador1, " Aluno(a): ",alunos[contador1]," Nota: ", notas[contador1])
fimpara
escreval("------------------------------------------")
escreval("Resultado da média das notas da TURMA: ", media)


Fimalgoritmo