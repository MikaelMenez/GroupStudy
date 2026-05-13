# Serviços
o sistema operacional oferece serviços para o modo usuário, como 
- execução de programa
- operações de I/O 
- comunicação 
- sistemas de arquivos 
- alocação de recursos 
- detecção de erros 
- proteção e segurança
- contabilidade


# Tipos de kernel 

## Kernel monolítico 
é um grande bloco de código que implementa os serviços em modo kernel 

## Micro Kernel 
no modo kernel funciona apenas as funções básicas, enquanto outras funções funcionam em modo de usuário, é mais modular que o monolítico, a comunicação entre processos é feita pelo kernel , nessa abordagem todo o sistema operacinal 

## Kernel híbrido 
aplica a lógica do microkernel, mas separa as outras funções em módulos separados, para permitir que algumas partes do sistema operacional não pesem mais do que o necessário do boot 


no sistema operacional temos uma árvore de processos com uma raiz da árvore chamado de init, se ele for encerrado, toda a árvore se quebra, o único processo que não é criado pelo usuário e sim pelo kernel 
o kernel é a primeira camada acima do hardware, ele se comunica diretamente com o hardware, garantindo segurança 
o sistema operacional é formado pelo kernel e aplicações adjacentes como o shell, servidor ssh, etc.., só o kernel funciona em modo privilegiado.
