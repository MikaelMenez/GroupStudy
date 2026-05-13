# Internet 
foi criada para interligar sistemas autômatos e é a união de equipamentos, padrões e protocolos para promover a troca de informações

## Internet x Web 
a web é um subconjunto de aplicações que utilizam principalmente o http, foi o que popularizou a Internet ao público 

## Protocolos de rede 
é um conjunto de regras com rigor científico que serve para estabelecer a forma como a comunicação ocorrerá 
- define o formato e a ordem das mensagens trocadas entre duas ou mais entidades comunicantes. Bem como ações realizadas na trasmissão e/ou no recebimento de uma mensagem ou outro evento 

# A rede : periferia e o núcleo 
- interação/comunicação entre sistemas finais 
- a informação pode passar por múltiplas redes ou caminhos na Internet

## Redes de acesso 
- acesso doméstico : xDSL,cabo , ftth e sem fio fixo 5g 
- acesso na empresa: ethernet e wifi 
- acesso sem fio em longa distância: 3g, LTE 4g e 5g

### xDSL
- o telefone e a conexão com a internet podem compartilhar a dsl ao mesmo tempo 
- download: 24 a 52 mbps 
- upload: 3.5 a 15 mbps  
- padrão mais recente( ITU, 2014 ) prevê até 1gbps somando upload e download
- desempenho é diretamente dependente da distância entre a central telefônica e a casa do assinante (max 3km)

### Internet à cabo 
- utiliza a infraestrutura de tv a cabo da operadora de televisão 
- similar ao dsl, usa um modem específico
- download: 40mbps a 1.2gbps 
- upload: 30 a 100 mbps

### FTTH ( fiber to the home )
- redes AON : redes óticas ativas 
- redes PON : redes óticas passivas
- cada usuário tem um ONT ( Optical network terminator )
- cada distribuidor conecta cerca de 100 clientes 
- um distribuidor se liga a um OLT ( Optical Line terminator) na central da operadora 
- No OLT é feita a conversão eletro-óptica do sinal, o qual é enviado para a internet 
- A ONT na casa do cliente se liga a um roteador residencial (wifi)

### Redes 5g 
- com a implantação das redes 5G, o acesso residencial a internet também pode ser fornecido com 5g 
- um roteador sem fio wifi é integrado ou conectado a um modem 5g 
- acesso sem fio fixo 5g 
- a grande vantagem é a eliminação de cabeamento

## o núcleo 
- usa comutação de pacotes para fazer a trasmissão da informação (roteadores e switches)
- comutação de pacotes x comutação de circuitos

### comutação de pacote armazena-envia
se o tamanho do pacote for L buts e a taxa de trasmissão for R bit/s, então o tempo para enviar um pacote é L/R segundos
