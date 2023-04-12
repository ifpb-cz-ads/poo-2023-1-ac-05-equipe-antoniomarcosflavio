#### 1 - Descreva os quatro elementos básicos de repetição controlada por contador.
* Inicialização do contador: É a declaração e inicialização da variável de contador que será usada para controlar a repetição.  
* Condição de continuação: É uma expressão booleana que define a condição que deve ser verdadeira para que a repetição continue. Enquanto a condição for verdadeira, o loop continuará a executar.  
* Atualização do contador: É a atualização da variável de contador após cada iteração do loop. Geralmente é feita para avançar o contador em uma determinada direção.  
* Corpo do loop: É o bloco de código que é executado repetidamente enquanto a condição de continuação for verdadeira. É dentro do corpo do loop que o código que deve ser repetido é colocado. 
#### 2 - Compare e contraste as instruções de repetição while e for.
As instruções de repetição while e for são usadas em Java para implementar loops, que permitem que um bloco de código seja executado repetidamente enquanto uma determinada condição for verdadeira.  

A instrução while é recomendada quando você precisa repetir um bloco de código com base em uma condição complexa ou quando o número de iterações não é conhecido antecipadamente. Já no que tange a instrução for, é recomendada quando você precisa repetir um bloco de código um número fixo de vezes.

A instrução while é mais flexível e adequada quando você precisa de mais controle sobre as condições de teste e atualizações de loop, enquanto a instrução for é mais conveniente e adequada quando você precisa de uma contagem fixa de iterações ou precisa iterar sobre uma sequência ou coleção de elementos.

#### 3 - Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.
O comando "while "é mais adequado quando a condição de teste precisa ser verificada antes de executar o bloco de código dentro do loop. Se a condição for falsa desde o início, o bloco de código dentro do loop nunca será executado. Já no tocante ao do...while, é mais adequado quando você deseja que o bloco de código dentro do loop seja executado pelo menos uma vez, mesmo que a condição seja falsa desde o início. A condição de teste é verificada após a execução do bloco de código.  

Um exemplo que pode ser citado é: um cenário em que você deseja solicitar ao usuário que insira um valor inteiro positivo e continue solicitando até que um valor válido seja inserido. Nesse caso a melhor opção seria o loop do...while.

#### 4 - Compare e contraste as instruções break e continue.
A instrução "break" é usada para interromper a execução de um loop de forma abrupta, saindo do loop mais próximo em que a instrução "break" é encontrada. O loop inteiro é interrompido, e o código subsequente ao loop é executado.  

Já a instrução "continue" é usada para pular a iteração atual de um loop e passar para a próxima iteração do loop. Ou seja, quando uma instrução continue é executada dentro de um loop, o restante do código dentro do loop é ignorado para a iteração atual e a próxima iteração do loop é iniciada.

#### 5 - Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:
##### A)  
``` java
For (i = 100, i >= 1, i++)
  System.out.println(i)
```
No código acima podemos identificar alguns erros, sejam eles:  

A separação dos elementos do loop for deve ser feita com ';' e não com ',';  

O tipo da variável de controle deve ser especificado;  

Java é uma linguagem case sensitive, portanto a declaração do loop for deve ser feita com letra minúscula ou não será reconhecida

O loop nunca será encerrado devido ao fato da variável estar sendo incrementanda, de modo que a condição de parada do for nunca será falsa;

~~~java
for (int i = 100; i >= 1; i--)
    System.out.println(i);
~~~
A correção acima garantirá que o código imprima os números de 100 a 1, de forma decrescente, como esperado.  
##### B) O seguinte código deve imprimir se o inteiro value for par ou ímpar:
~~~java
switch (value % 2) {
  case 0:
  System.out.println("Inteiro par");
  case 1:
  System.out.println("Inteiro ímpar");
}
~~~
O código acima não possuí a palavra reservada "break" logo após o bloco de código do case na estrutura switch, portanto no caso de o resultado ser 0 o programa imprimiria que o inteiro é par mas também imprimiria que o inteiro é ímpar, uma vez que, sem o break, ele executaria todas as instruções subsequentes.
~~~java
switch (value % 2) {
    case 0:
        System.out.println("Inteiro par");
        break; // Adiciona a instrução "break" para sair do switch
    case 1:
        System.out.println("Inteiro ímpar");
        break; // Adiciona a instrução "break" para sair do switch
}
~~~  
A correção acima garantirá que o código funcione conforme o esperado.
##### C) O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:
~~~java
for(i =19; i >=1; i +=2) System.out.println(i);
~~~
O código acima tem o mesmo erro da alternativa anterior, uma vez que a variável de controle está sendo incrementada, a condição de parada do for nunca será satisfeita  
~~~java
for(int i = 19; i >= 1; i -=2)
  System.out.println(i);
~~~
Com essas mudanças podemos garantir que o programa exibirá os números impares de 19 até 1, de forma decrescente.
##### D) O código seguinte deve dar saída dos inteiros pares de 2 a 100:
~~~java
counter = 2;
do {
  System.out.println(counter);
  counter += 2;
} while (counter < 100); 
~~~
Este código está incorreto pois ele irá imprimir apenas até o número 98. Para corrigir este erro basta colocar dentro da condicional que a variável de controle vá até <= 100. O código correto seria:
~~~java
counter = 2;
do {
  System.out.println(counter);
  counter += 2;
} while (counter <= 100); 
~~~

#### 6 - O que o seguinte programa faz?  
O programa mostrado vai imprimir um retangulo com 5 colunas e 10 linhas, formado de '@'.
