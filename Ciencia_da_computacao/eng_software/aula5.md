# Validação de software 
é o processo de 
- evidenciar que sistema está em conformidade com a especificação 
- Demonstrar que sistema atende às expectativas do cliente 

também denominado verificação e Validação (V&V)
  - verificação: estamos construindo o produto de maneira correta? 
  - Validação: estamos construindo o produto correto?

Envolve processos de inspeção, revisão e teste de software
- inspeção e revisão analisam e verificam requisitos do sistema, modelos de projeto, código e até os próprios teste 
  - estática 
- teste envolve a execução de código com dados simulados ou reais 
  - dinâmica


**teste é a técnica de Validação e verificação mais comum**

## Testes 

- abordagem incremental
  - cada incremento deve ser testado enquanto é desenvolvido
  - testes devem ser baseados nos requisitos do incremento 
  - testes podem ser desenvolvidos paralelamente aos requisitos, antes do desenvolvimento 
    - ajuda testadores e desenvolvedores na compreensão dos requisitos
    - não gera atrasos enquanto casos de teste são criados 
- abordagem dirigida ao plano 
  - teste é dirigido por um conjunto de planos de testes 
  - equipe independente de trabalhadores trabalha nos planos de testes 
  - planos são elaborados a partir das especificações e projeto do sistema

### Teste de componente 

é aquele feito pelo desenvolvedor, à medida que o desenvolve, ou também conhecido de teste unitário 

### Teste de sistema
o software como um todo é testado,mostra que o sistema satisfaz recursos funcionais e não funcionais , avalia propriedades emergentes da integração de componentes 

### Teste de usuário 
sistema de software é testado pelo usuário final com dados reais, Mostra que sistema satisfaz às necessidades do usuário. Pode revelar erros e omissões na especificação de requisitos 


# Evolução de software 
- Software é inerentemente flexível e pode mudar
  - contexto de negócios pode mudar 
  - requisitos mudam à medida que contexto de negócios muda 
  - software que suporta processos de negócio deve evoluir e mudar 
- Fronteira entre processos de desenvolvimento e evolução é nebulosa e cada vez mais irrelevante 
  - historicamente, sempre existiu uma clara divisão
    - desenvolvimento percebido como uma atividade criativa e desafiadora 
    - evolução vista como uma atividade monótona, maçante e desinteressante 
  - hoje faz mais sentido ver como continuum
    - mudanças podem acontecer durante ou após o desenvolvimento

## Mudança 
é inevitável em todos os grandes projetos de software 
- mudanças levam a requisitos novos e modificiados 
  - pressões externas, competição e prioridade da gestão 
- novas tecnologias representam possibilidades de novas abordagens de projeto e implementação
- mudanças de plataformas requerem mudanças nos sistemas
mudança impõe retrabalho e custos adicionais

### Abordagens para redução de custos de retrabalho
- antecipação de mudanças 
  - incluir atividades capazes de antecipar possíveis mudanças antes que significante retrabalho seja necessário
    - prototipação pode mostrar características chave do sistema aos clientes 
- tolerância às mudanças 
  - adotar abordagens de desenvolvimento que possam acomodar mudanças com custos relativamente baixos
    - desenvolvimento e entrega incremental permitem que mudanças propostas possam ser aplicadas em incrementos futuros 
    - refatoração melhora a estrutura e organização do sistema
