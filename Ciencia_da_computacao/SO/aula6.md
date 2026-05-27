# Tipos de processos 

###### Processos independentes
não podem afetar ou serem afetados pela execução de outros processos. Nesse caso um só processo é o suficiente para resolver o programa 

###### Processos cooperativos 
podem afetar e serem afetados pela execução de outros processos, quando é necessário mais de um processo para resolver o problema.

Para termos processos cooperativos, temos que utilizar a IPC(inter process communication)

- Vantagens 
  - Compartilhamento de informações (arquivos)
  - Velocidade de computação (sub-tarefas)
  - Modularidade (funções dos sistema)
  - Conveniência(muitas tarefas de usuário)

### IPC 
- tipos de ipc:
  - memória Compartilhada 
    - é uma estratégia na qual se expande o espaço de endereçamento de p1 e de p2 , na qual ambas têm uma região de memória que intercedem as 2 e o sistema operacional é o responsável por lidar com esse gerenciamento de memória, por meio de filas que residem no espaço de memória do kernel, com o sistema operacional sendo o responsável por entregar as mensagens. Essas filas são chamadas de portas e têm um tamanho fixo de buffer
    - pode gerar problema de race condition
    - porém é a forma de comunicação mais rápida
    - é de responsabilidade do desenvolvedor de lidar com essa região de memória
  - Troca de mensagens
    - é uma estratégia na qual utiliza principalmente 2 chamadas de sistema, o send e o receive , na qual é utilizado para que 2 processos consigam se comunicar, toda mensagem passará primeiro pelo sistema operacional 
    - é bem mais lenta por usar chamadas de sistema 
    - os processos não precisam estar na mesma máquina física, além de que é mais segura por evitar race conditions
    - Síncrona:
      - para que um processo envie uma mensagem, o outro deve estar pronta para a receber 
    - Assíncrono 
      - o processo pode enviar mensagens o quanto quiser e elas vão se acumulando num buffer até o outro processo chamar um receive e receber todas as mensagens 
    - bloqueante:
      - na hora que um processo manda um send, ele só continuará executando quando o processo que recebe os dados confirmar que recebeu os dados, ou que recebeu a fila de dados, enquanto o receive só funcionará quando tiver uma confirmação de que têm um dado para ler vindo do que envia as mensagens  
    - não bloqueante:
      - não espera nenhuma ação do outro processo   
