# Processos
é um contexto de execução de programas
no espaço de endereçamento temos algumas subdivisões 
- texto
  - tamanho fixo
  - contem o programa que o processo executa
- dados 
  - tamanho fixo 
  - variáveis globais , constantes, etc 
- heap 
  - tamanho variável 
  - região de armazenamento dinâmico de dados (malloc)
- stack 
  - tamanho variável
  - uma pilha que é manipulada e usada para lidar com chamadas de função e mudança de escopo e lida com variáveis comuns

## Ciclo de vida 

- novo
  - é quando é chamado o fork() e o execv(), na qual o processo ainda está em preparação
- pronto 
  - ao terminar a preparação, o processo entra no estado de pronto 
  - tem uma fila só para os processos de pronto 
- execução
  - quando ele consegue acesso à cpu ele entra em estado de execução e utiliza os recursos da cpu 
  - caso sua execução demore muito o SO pode fazer o processo voltar ao estado de pronto, até ele ter permissão de voltar a usar os recursos 
- finalização 
  - caso o programa termine, ele entra em estado de finalização e o sistema operacional pode recuperar os recursos
- esperando 
  - ele pode voluntariamente fazer uma chamada de sistema e começa a esperar pela resposta, sai da execução para o estado de esperando
  - tem uma fila só para os processos esperando 
- "zumbi"
  - quando o estado está encerrado, mas ainda não está finalizado,ele ainda consome recursos da cpu até ser encerrado

#### Escalonadores 
temos 2 tipos de Escalonadores

- escalonador de longo prazo (escalonador de jobs) 
  - seleciona qual processo deve ser trazido à fila de prontos 
- escalonador de curto prazo (escalonador de cpu )
  - seleciona qual processo entra na fila de execução da cpu 
