# Arquitetura em camadas

## camadas de protocolo e seus modelos de serviço

### pilha de protocolos da internet 
topo-> | aplicação | transporte | rede | enlace | física |
as camadas mais embaixo prestam serviço às mais em cima


Arquitetura de camadas 
- cada camada têm sua funçãi bem definida por padrões estabelecidos 
- aplicação práticade protocolo de aplicações - http, smtp, ftp, etc 
- transporte carrega as mensagens da camada de aplicação - tcp,udp 
- rede faz o roteamento dos pacotes(datagramas) na rede (roteadores) - ip


### fluxo de informações entre camadas 
- no transmissor (Tx ou origem), cada camada adiciona um cabeçalho na mensagem 
- no receptor o cabeçalho é retirado em cada respectiva camada

### Serviços 
- o serviço orientado a conexões se baseia no sistema telefônico. Ou seja para usar o serviço, primeiro o usuário estabelece uma conexão, utiliza-a e depois a libera 
- serviço não orientado a conexão, ele é baseado no sistema de correios, Os pacotes são enviados sem estabelecimento de uma conexão, similar a um envio de uma carta

### Modelo de referência OSI 
- possui 7 camadas, possui três conceitos fundamentais
  - Serviços
  - interfaces 
  - protocolos

## Camada de aplicação
- os protocolos da camada de aplicação definem:
  - os tipos de mensagens trocadas 
  - a sintaxe dos vários tipos de mensagens 
  - a semântica

### Arquiteturas cliente 
quem inicia a conexão é o cliente, quem espera a conexão é o servidor 
#### Cliente-servidor 
- há sempre um host(hospedeiro), denominado de servidor, sempre em funcionamento 
- o servidor atende às requisições de muitos outros hosts(clientes )
- o servidor têm um endereço que é conhecido por todos os clientes 
- a disponibilidade do servidor é muito importante 
- desvantagem: custo de manutenção e implementação

#### P2P (peer to peer)
- não há dependência com relação à servidores 
- em vez de servidores dedicados, o p2p cria pares de hosts para a comunicação direta, denominado peers 
- vantagens : autoescalabilidade, descentralizado, alta relação de custo-benefício
- desvantagens : segurança, desempenho, confiabilidade 

### Sockets
as mensagens trocadas entre processos passam por uma rede, um process envia mensagem para uma rede por meio de uma interface chamada de sockets ou API

### portas
são possíveis pontos de comunicação entre hosts
têm 65.536 portas nos computadores atuais
de 0 a 1023 são padronizados

## Protocolos de transporte 
ao desenvolver uma aplicação, uma das primeiras decisões é a escolha do protocolo da camada de transporte, TCP ou UDP 

- Tcp (transmission control protocol )
  - serviço orientado a conexão
    - o tcp fa o cliente e o servidor trocarem informações de controle de camada de transporte antes que as mensagens da camada de aplicação comecem a ser transmitidas (handshake)
  - serviço confiável de transporte
    - os processos comunicantes podem contar com o tcp para a entrega de todos os dados enviados sem erro e na ordem certa 
  - também faz controle de congestionamento 
- UDP (User datagram protocol )
  - serviço não orientado a conexão
    - o udp prevê um serviço não confiável de troca de dados, ou seja quando um usuário manda uma mensagem para um socket udp, não há garantia de que a mensagem chegará ao processo receptor 
  - o udp não faz controle de congestionamento
