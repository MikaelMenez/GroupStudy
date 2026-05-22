# Http (Hyper text transfer protocol)
- é definido nas RFC 
- é executado em 2 programas(processos ou aplicações) cliente e servidor, que usam o http para se comunicarem 
- o http define como clientes requisitam aplicações aos servidores web 
- o http usa o TCP como seu protocolo de transporte subjacente, primeiramente se faz uma conexão TCP, definindo a interface do socket
- o http não armazena informações sobre as requisições dos clientes, uma mesma página ou objeto pode ser requisitado várias vezes repetidas , o tornando um protocolo sem estado 
- decisão que o desenvolvedor deve tomar:
  - cada par de requisição/resposta(dentre de várias que ocorre na comunicação) devem ser enviadas por uma conexão tcp distinta ou todas as requisição/resposta devem ser enviadas na mesma conexão TCP
- Na primeira abordagem, usa-se conexões não persistentes e na segunda persistentes
