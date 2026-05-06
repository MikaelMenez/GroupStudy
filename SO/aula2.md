# concorrência 

não é preciso ter mais de um processador para se ter a concorrência, onde o processador cria a ilusão de simultaniedade.

os programas são divididas em pequenas frações de programas(chamadas de batch) e intercaladas para dar a sensação de que vários programas estão sendo executados simultaneamente. já que cada fração é feita bem rápido, não notamos a lentidão. O sistema operacional consegue adicionar comandos de salto(jump) usando o scheduler(implementado como uma fila ) para dizer ao processador o que ele deve executar e quando. Ela registra no registrador de endereço o que executar e copia essa instrução no registrador de instrução que o executa.

o sistema operacional salta para o programa que têm instruções que salta para o sistema operacional novamente, principalmente em operações de I/O , depois ele salva o estado e joga na fila novamente, até que o dispatcher inicie a execução e o libere. Porém um processo pode bloquear esse estado e gerando uma falha de segurança, porém não podemos permitir isso, o software não consegue resolver isso. Porém no hardware podemos implementar um timer no processador para saber se um programa está demorando muito e o interromper se necessário.

as interrupções do programa é o que justamente permite esse sistema de retroalimentação entre o sistema operacional chamar o programa e vice-versa. Essas interrupções são sinais elétricos de hardware, quando um programa é interrompido ele chama o interrupt handler que salva o estado do programa e continua a lidar com os programas no scheduler

Porém, se tivermos muitos programas abertos, para cada programa recuperar o controle, demora bastante,já que temos a ilusão de simultaniedade. para resolvermos isso, nós podemos adicionar mais cpus,para termos vários processos verdadeiramente simultâneos, ou aumentar a velocidade da cpu para voltar a ilusão de simultaniedade

## chamadas de sistema 
somente o sistema operacional se comunica com o hardware e para a aplicação poder acessar o hardware, ele tem que fazer chamadas de sistema para se comunicar com o SO e o SO se comunica com o hardware, sendo basicamente uma api do sistema

## concorrência x paralelismo

concorrência é quando vários processos disputando recursos da cpu, enquanto paralelismo, você executa tarefas simultaneamente, ainda disputa recursos, mas pode se utilizar cpu's diferentes

## Entrada e saída
é realizado pela cpu, mas é gerenciado pelo sistema operacional

## DMA (direct memory acess)
o dma é outro dispositivo entre a cpu e a memória secundária, ele se comunica com o controlador de disco, ele roda em paralelo e carrega a memória secundária para a memória principal quando necessário e quando for terminado, ele gera uma interrupção para a cpu e entrega o endereço da memória principal, otimizando o processo de busca na memória secundária, já que a cpu não se preocupa com operações de I/O e agiliza os outros programas
