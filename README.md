# caixa-java
Atividade Prática: Caixa Eletrônico Inteligente
🎯 Objetivo
Criar um programa em Java que simule um Caixa Eletrônico. O sistema deve iniciar com uma quantidade limitada de cédulas de R$ 100, R$ 50, R$ 20 e R$ 10. Ao solicitar um saque, o programa deve verificar se há cédulas suficientes no estoque para atender ao valor solicitado, priorizando sempre as notas de maior valor para minimizar a quantidade de papel entregue.

📝 Enunciado da Atividade
Escreva uma classe Java chamada CaixaEletronico que atenda aos seguintes requisitos:

Estoque Inicial: O caixa deve iniciar com uma quantidade fixa de cada nota. Por exemplo:

+ 5 notas de R$ 100

+ 10 notas de R$ 50

+ 10 notas de R$ 20

+ 20 notas de R$ 10

Menu de Opções: O programa deve rodar em um loop mostrando o seguinte menu:

+ 1- Verificar Saldo/Estoque (Exibe a quantidade disponível de cada nota e o valor total no caixa)

+ 2- Realizar Saque (Solicita o valor do saque e tenta realizá-lo)

+ 3- Sair

Regras para o Saque:

+ O valor solicitado deve ser múltiplo de 10 (já que a menor nota é de R$ 10).

+ O sistema deve calcular a menor quantidade de notas possível para aquele valor.

+ Validação Crítica: Se o caixa não tiver notas suficientes de um determinado valor para completar a transação, ele não deve realizar o saque de forma parcial. A transação deve ser recusada por falta de cédulas adequadas, mantendo o estoque intacto.

+ Se o saque for bem-sucedido, a quantidade de notas correspondente deve ser subtraída do estoque do caixa.
