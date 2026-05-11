Instruções privilegiadas, são definidas e só podem funcionar se o Mode bit for 1, funcionando em modo privilegiado, se o bit for 0, roda em modo restrito.

# Interrupções 
é um sinal enviado pela cpu para avisar que um evento ocorreu , ele ele acessa uma região de memória e normalmente é o sistema operacional que tem o acesso privilegiado, o modo kernel e o modo de usuário é para os demais programas , 

## Ações das Interrupções 
- faz o processo pausar, 
- ele salva o estado, 
- lida com a Interrupção,
- retorna o estado 
- continua a execução do processo. 
- muda o modo de acesso,

## kernel mode
fica num espaço de endereçamento especial 
- lida com I/O , 
- acesso completo à memória e 
- redefine a forma como Interrupções acontecem 

## User mode 
 se o modo de usuário chamar uma Instrução privilegiada, o processador faz uma Interrupção e passa o controle pro so lidar com isso 
## System calls 
são funções que fazem parte da biblioteca do sistema operacional e que funcionam como apis do sistema operacional que seu programa pode chamar e permite que o programa acesse o hardware mesmo em modo de usuário

### Pros 
- abstração de hardware
- segurança
- portabilidade 

### Cons 
- custo de performance 
- dependência de plataforma 
- falta de garantia de preferência 

## sistema operacional cooperativo 
é um sistema sem chamadas de sistema, ele depende do programa chamar de volta o sistema, mas não há garantia de que isso vai acontecer

## Drivers
rodam em modo kernel e fazem a ponte para o sistema operacional se comunicar com o hardware, porém é perigoso, já que se tiver um bug, pode quebrar o sistema 

## Interrupção por software(trap) x Interrupção por hardware(sinal elétrico)
por software não há garantia de preferência, o processo abre mão voluntariamente da preferência e o sistema operacional pode aproveitar para realizar suas operações, por hardware é literalmente o sinal elétrico que causa a Interrupção
