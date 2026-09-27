/*
 1 Variáveis, Tipos de Dados, Constantes, Operadores Aritméticos, Expressões
Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.
A = R2
Onde:
 	A representa a área do círculo
  	pi= 3.141592654
	R = Raio do círculo (deve ser fornecido pelo usuário)

        float a = 1;
        float pi = 3.141592654F;
        float r = 1;
        float area = (float) (a)*(pi)*(r*r);
        System.out.println(area);

    }
}

Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.
SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD

Onde:
SB =  Salário Base
HT = Horas Trabalhadas
	VH = Valor Hora de trabalho
	TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido
 
float vh = 15F;
        float ht = 40F;
        float sb = (float) vh * ht;
		float pd = 10F;
		float td = (float) (pd / 100)*sb;
        float sl = (float) sb - td;
        System.out.println("O salario base é: "+sb+" e o salario liquido é: "+sl );


/*
Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = ( 9 C) 5 

'Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:

C = (( F - 32)  5)9 

*/
public class ExerciciosDevDojo{
	static public void main(String[]args){
float vh = 10F;
        float celsius = 40;
		float fahrenheit = (float)((1.8 * celsius)*5);
		System.out.println("O valor de Celsius para Fahrenheit "+fahrenheit);
		float celsiu = (float)((fahrenheit)/9);
        System.out.println("O valor de Fahrenheit para Celsius "+celsiu);
	}
} 

/*
Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo. 

V = R2A

Onde:
	V = Volume
	= 3.141592654
	R = Raio da circunferência da lata
	A = Altura da lata
	OBS: O volume deve ser apresentado com a unidade de medida correto cm3.

Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:

	D=TV
	LU=D  12

	Onde: 
		D = Distância em Km
		T = Tempo gasto na viagem
		V = Velocidade
 
Ler valores para as variáveis x e y, trocar os valores das variáveis e apresentar o resultado dos valores invertidos.

Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:

P=VALOR + (VALOR (TAXA100)TEMPO)

Onde P é o valor da prestação em atraso.

Desenvolver um programa que apresente e calcule o volume de uma caixa retangular, utilize a fórmula abaixo:

V=CLA

Onde:
	V = Volume em cm3
	C = Comprimento
	L = Largura 
	A = Altura

Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado, ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.

Elaborar um programa que realize a conversão de US$ para R$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.

Elaborar um programa que realize a conversão de R$ para US$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.

Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o percentual de reajuste (PR) e calcule e apresente o novo valor de salário do funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:

	NS=SB + (SB*PR)  100


	Onde:
		NS = Novo Salário
SB = Salário Base
	PR = Percentual de Reajuste


Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o resultado das quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).

Construa um programa que calcule a velocidade em metros por segundo de um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:

V=(D1000) (T60)

Onde:
	V = Velocidade em m/s
	D = Distância
	T = Tempo

Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:

V=(43)(R3)

Onde:
V = Volume
 = 3.141592654
R = Raio

Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia uma medida em pés e calcule o equivalente em metros.

Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.

Na eletrônica existem diversas unidades de medida algumas delas são:
	
	
Unidade
Símbolo
O que mede
Símbolo Aritmético
Ampére
A
Corrente elétrica
I
Volt
V
Tensão elétrica
U
Ohm
Ω
Resistência elétrica
R
Watt
W
Potência elétrica
P



Baseado nesses símbolos, existem alguns cálculos que podemos fazer utilizando a Lei de Ohm, que diz que tendo ao menos dois valores pode-se encontrar o terceiro.

Sendo assim:

Em um circuito elétrico temos as seguintes informações:
275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo:

R=UI

Onde:
	R = Resistência em Ohms
	U = Tensão em Volts
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o usuário digite os valores 
	para Volts  e Amperes.








Em um circuito elétrico temos as seguintes informações:
275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:

U=RI

Onde:
	U = Tensão em Volts
	R = Resistência em Ohms
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o usuário digite os valores 
	para Ohms  e Amperes.

Em um circuito elétrico temos as seguintes informações:
12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:


I=UR

Onde:
	I = Corrente em Amperes
	U = Tensão em Volts
	R = Resistência em Ohms


BÔNUS: Altere o programa acima e permita que o usuário digite os valores 
	para Volts  e Ohms.

Ainda podemos realizar o cálculo de potência elétrica, desenvolva um rotina que calculo a potência de um equipamento, utilizando os dados e a fórmula a seguir:

		Dados: 
		220 V  e 25 A

		Fórmula:
		P=UI

		Onde: 
		P = Potência em Watts
		U  = Tensão em Volts
		I = Corrente em Amperes

	BÔNUS: Altere o programa acima e permita que o usuário digite os valores 
	para Volts  e Amperes.



Estruturas de Decisão

Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4), e informe o status do aluno baseado na tabela abaixo:

Média
Status
Se a média for menor que 50
REPROVADO
Se a média for igual a 50
RECUPERAÇÃO
Se a média for maior que 50
APROVADO


Desenvolva uma rotina que dados três números inteiros, apresente-os em ordem crescente

Desenvolva a leitura de cinco valores numéricos inteiros e apresente somente os que forem divisíveis por 2 ou por 3.

Escreva um programa que dados cinco valores numéricos inteiros apresente apenas o maior e o menor deles.

Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja entre 1 e 9 apresentar a mensagem “Dentro do valor permitido”e caso contrário apresentar a mensagem  “Fora do Valor Permitido”.

Leia um número inteiro qualquer  e multiplique por 2, apresentar o resultado da multiplicação  somente se o resultado for maior ou igual a 30.

Crie uma calculadora que seja capaz de realizar as quatro operações básicas. Para tal cumpra-se os seguintes requisitos:

A calculadora deve apresentar um menu e perguntar qual a operação desejada (+, -, * ou /).

A calculadora deve solicitar os dois valores numéricos, realizar a operação e exibir o resultado.







Desenvolva uma calculadora de IMC (Índice de Massa Corporal), após realizado o cálculo classificar o paciente de acordo com a tabela abaixo.



		Para realizar o cálculo de IMC utilize a fórmula abaixo:
		
		IMC=PESOALTURA2


Laços de Repetição

Elaborar um programa que apresente os quadrados dos números inteiros existentes na faixa de valores de 15 até 200.

Elaborar um programa que calcule e apresente a tabuada de um número qualquer.

Elaborar um programa que apresente o somatório dos números na faixa de 1 até 500.

Elaborar uma rotina que apresente todos os números pares na faixa de 0 até 100.

Elaborar um programa que apresente a sequência de Fibonacci até o décimo quinto termo.

Elaborar um programa que calcule o fatorial de um número inteiro

Melhorar o programa acima fazendo com que leia 5 números inteiros e calcule o fatorial dos 5 valores lidos.

Desenvolva um programa que dado um número inteiro apresente as tabuadas do 1 ao 10 desse número.



Melhore a calculadora desenvolvida anteriormente acrescentando as seguintes funcionalidades:

Sempre ao final de um cálculo a calculadora deve mostrar o menu novamente.

Acrescentar uma opção para sair da calculadora, como sugestão, quando o usuário digitar 0 (zero) por exemplo, a calculadora deve ser encerrada.

Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e senha corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha, essa condição deve-se repetir até que o usuário acerte a combinação.

Equação de Pell

A equação de Pell permite encontrar o resultado de uma operação de raiz quadrada apenas com subtrações sucessivas.

Exemplo:

27=??

Para obter a raiz quadrada de 27 procedemos da seguinte forma:

27 - 1 = 26
26 - 3 = 23
23 - 5 = 18
18 - 7 = 11
11 - 9 = 2

	Veja que 5 passos foram tomados sendo assim temos a parte inteira da raiz. Logo
	podemos dizer que 27=5.

	Desenvolva um programa que dado um número inteiro qualquer utilize a equação de
	Pell e calcule a parte inteira do resultado da raiz quadrada deste número.

	BÔNUS: Ainda utilizando a Equação de Pell existe uma forma de calcular os dígitos
	após a vírgula, tente incrementar o seu programa, acrescentando essa
	funcionalidade.





Vetores

Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da multiplicação dos números do V1 com os correspondentes em V2
	Exemplo:
	
V1
1
2
3
4
5
6
7
8
9
V2
2
3
4
5
6
7
8
9
0
VR
2
6
12
20
30
42
56
72
0


Calculando Dígito Verificador de um CPF.

O CPF (Cadastro de Pessoas Físicas) é composto por 11 dígitos ao todo, porém os 2 últimos dígitos são calculados, essa informação serve para determinarmos por exemplo, se um cpf é ou não válido.

Para calcular um CPF existem alguns passo que precisam ser seguidos, veja abaixo:

Vamos tomar como exemplo o CPF fictício 728.316.240-29, para calcular seus DVs vamos fazer as seguintes operações.

Calculando o DV 1

Dígito do CPF
7
2
8
3
1
6
2
4
0
DV1
Multiplicador
10
9
8
7
6
5
4
3
2


Resultado
70
18
64
21
6
30
8
12
0




Agora deve-se somar os resultados
70+18+64+21+6+30+8+12+0= 229

Agora deve-se calcular o módulo de 229 por 11, sendo assim:
229 % 11 = 9

E por fim deve-se subtrair esse resultado de 11, ou seja:
11 - 9 = 2

Se o resultado da subtração for maior que 9, o dígito verificador é ZERO. Caso contrário, o dígito verificador é o resultado dessa subtração. Neste caso, o primeiro dígito verificador é 2.



E temos o primeiro dígito verificador

CPF
7
2
8
3
1
6
2
4
0
2


Agora devemos calcular o segundo dígito verificador da seguinte forma


Dígito do CPF
7
2
8
3
1
6
2
4
0
2
Multiplicador
11
10
9
8
7
6
5
4
3
2
Resultado
77
20
72
24
7
36
10
16
0
4


Agora deve-se somar os resultados
77+20+72+24+7+36+10+16+0+4=266

Agora deve-se calcular o módulo de 229 por 11, sendo assim:
266 % 11 = 2

E por fim deve-se subtrair esse resultado de 11, ou seja:
11 - 2 = 9

Se o resultado da subtração for maior que 9, o dígito verificador é ZERO. Caso contrário, o dígito verificador é o resultado dessa subtração. Neste caso, o primeiro dígito verificador é 9.

E temos o segundo dígito verificador

CPF
7
2
8
3
1
6
2
4
0
2
9



Uma vez entendido o problema escreva um programa que dados os 9 primeiros dígitos de um CPF calcule os dois dígitos verificadores.
 
Métodos/Funções

Melhore a calculadora dividindo cada operação em métodos/funções

Acrescente a calculadora as operações de potência e raiz quadrada (resultado inteiro utilizando a equação de Pell)






Escreva um programa que tenha as seguinte funcionalidades

O programa deve apresentar um menu com as opções de conversão, de exibição da memória e também uma opção para encerrar o programa.
Faça a conversão de Graus Celsius para Fahrenheit 
Faça a conversão de Graus Fahrenheit para Celsius. 
O programa deve armazenar as 5 últimas operações e permitir exibir essa operação a qualquer momento.

Melhore o programa da Lei de Ohm exibindo um menu com as seguintes funcionalidades:

Calcular Tensão Elétrica
Calcular Resistência Elétrica
Calcular Corrente Elétrica 
Calcular Potência Elétrica
Sair

O programa deve realizar os cálculos e exibir os resultados, ao fim de cada cálculo deve-se retornar ao menu.

Desenvolva um programa que apresente um menu com as seguintes opções:

Realizar venda
Para realizar a venda basta informar o valor do produto e acrescentar 25% de comissão para o vendedor  e 65% de impostos e taxas e exibir o resultado total.

Calcular pagamento a vista
Basta informar o valor a pagar e conceder um desconto de que não pode ser maior que 15%. O vendedor deve poder informar o percentual de desconto.

Calcular pagamento parcelado
Basta informar o valor a pagar e quantidade de parcelas, para cada parcela acrescentar 2% ao valor a ser pago, a quantidade de parcelas não deve ser nem menor que três e nem maior que 36.










Calcular prestação em atraso
Para calcular uma prestação em atraso utilizar a seguinte fórmula:

	P=V + (V (T100)D)
	
Onde:
P = Valor da prestação a ser pago
V = Valor atual da prestação	
	T = Taxa
	D = Dias em atraso



O programa deve armazenar o total das 5 últimas vendas e permitir que se visualize o total de vendas somando os valores dessas 5 últimas.

Sair
		Essa opção deve apenas encerrar o programa.





*/
