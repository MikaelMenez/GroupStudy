# Threads 
são fluxos de execução dentro de um mesmo processo
elas se comunicam por memória compartilhada, por isso são extremamente sensíveis à condição de corrida
ele deve manter seu estado da cpu e seu próprio stack pointer, além de que deve ter seu contador de programa
ele não é uma função, ele apenas aponta para uma parte da região de texto
é a unidade básica de utilização da cpu
usamos o comando clone() como a chamada de sistema POSIX para criar threads
têm o conceito de join() que irá juntar as informações de threads diferentes
## Multi-thread
- muitos para uma
  - muitas threads do usuário mapeadas para uma única thread do núcleo(kernel)
  - não se aproveita de multiprocessadores
- um para um
  - cada thread do usuário é criada uma thread de kernel
  - restringe o número de threads
- muitos para muitos 
  - permite que muitas threads de usuário sejam mapeadas em muitas threads do kernel, menor ou igual 
- modelo em dois níveis 
  - similar ao M:N porém permite que uma thread do usuário seja associado a uma thread do núcleo
  
## bibliotecas de threads
são bibliotecas que geram uma api para a criação de threads
- pthreads 
  - da um controle de maior baixo nível sobre o controle de threads 
- OpenMP

## pthreads (Pool de threads)
cria uma piscina de threads que podem ser reutilizadas 
é mais rápido requisitar uma thread já existente do que criar uma nova thread
permite que o número de threads seja limitado ao tamanho da pool 

## OpenMP
cria uma thread para cada core, distribui as tarefas entre as threads e é usada para paralelisar loops com um sistema parecido ao trait de rust, ao compilar o próprio compilador lida com as threads para você
