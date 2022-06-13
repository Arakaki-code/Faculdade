Algoritmo "funcaoParametro"

funcao multi(x,y: inteiro): real
var
inicio
retorne x * y
fimfuncao

Var
n,m: inteiro
resultado: real

Inicio
      escreva("Digite primeiro numero para multiplicação: ")
      leia(n)
      escreva("Digite segundo numero para multiplicação: ")
      leia(m)
      resultado <- multi(n,m)
      escreva("Resultado de ",n," x ",m," = ", resultado)

Fimalgoritmo