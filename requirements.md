Cada usuario de possuir id, nome e saldoBancario;
O cartao deve possuir id, usuarioId
O cartão deve verificar se existe saldoBancario suficiente para aquela transação;
Quando realizado a aquisição da viagem deve-se debitar diretamente no saldoBancario do usuario, atualizando assim o saldoBancario e o status do cartão (viagemDisponivel = true) 
O cartão deve ser usado para entrar e sair dentro das zonas, sendo assim deve-se registrar horario de entrada e de saída da viagem;
A aquisição da viagem do tipo UNICO permite que o usuário consiga viajar apenas uma vez, quando usado atualiza o status do cartão (viagemDisponivel = false);
A aquisição da viagem do tipo DIA permite que o usuário consiga viajar várias vezes durante o dia da aquisição (24h), quando passar o prazo estipulado deve-se atualizar o status do cartão (viagemDisponivel = false);
A aquisição da viagem do tipo SEMANA permite que o usuário consiga viajar várias vezes durante todos dias da semana da aquisição (168h) quando passar o prazo estipulado deve-se atualizar o status do cartão (viagemDisponivel = false);;
A aquisição da viagem dos tipo MÊS permite que o usuário consiga viajar várias vezes durante todos dias do mês da aquisição (720h) quando passar o prazo estipulado deve-se atualizar o status do cartão (viagemDisponivel = false);
Existe 2 tipo de zona ZONA_A e ZONA_B (Enum zoneType A, B)
O tipo de ZONA_B permite que o usuário consiga usar qualquer ZONA

Os valores das tarifas são:

Constant balanceType 
A_ONCE = 6.0, 
A_ONE_DAY = 10.0, 
A_ONE_WEEK = 30.0, 
A_ONE_MOUTH = 130.0

Constant balanceType 
B_ONCE = 7.0, 
B_ONE_DAY = 12.0, 
B_ONE_WEEK = 45.0, 
B_ONE_MOUTH = 170.0
 
