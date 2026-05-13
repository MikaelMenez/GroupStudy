# Arquiteturas de agentes
são modelos de design do agente, que determina como ele processa informações e toma decisões.
- ele precisa de percepções: a forma como ele recebe os dados dos sensores
- processamento, a Arquitetura processa esses dados com base em seu estado interno, regras e objetivos
- ação, ele executa a decisão no ambiente por meio dos atuadores

ele é caracterizado pela ausência ou presença de memória e pela forma como ele toma a decisão, se é por uma tabela pré definida, por busca de metas ou por cálculo de utilidade

## Agente de tabela 
é o nível mais primitivo, ele possui uma tabela mapeando cada sequência  de percepções possíveis para uma ação específica, ela é episódica, determinística, estático e discreto, lógica de "se vi A, faço B", é limitada pois não serve para ambientes complexos, já que é impossível criar a tabela para tal contexto 

## Agente reativo simples 
não tem memória, baseando se apenas na percepção atual, usa a lógica de "se o carro da frente freiar, freie", é útil para ambientes totalmente observáveis, episódicos 

## Agente reativo com estado interno 
ele mantém uma memória para preencher partes do ambiente que ele não consegue identificar no momento. Exemplo: um robô aspirador que lembra dos cômodos da casa.

## Agente cognitivo baseado em objetivo 
ele possui informações sobre o objetivo a ser alcançado e toma decisões focando em alcançar o objetivo, bom para ambientes dinâmicos, já que ele se pergunta se a ação que ele vai tomar o deixa mais perto do seu objetivo, podendo tomar decisões diferentes caso o objetivo mude 

## Agente otimizador baseado na utilidade 
esse agente é focado em otimizar e buscar a maior eficiência, ele usa uma função de utilidade para dar nota a cada estado

## Agente adaptativo com aprendizagem 
ele pode operar em ambientes desconhecidos e se tornar mais competente do que seu conhecimento inicial permitiria, ele têm o elemento de aprendizado para fazer melhorias no sistema, o elemento de desempenho que ele usa para tomar decisões, o elemento da criticidade que lhe dá feedback sobre as suas ações e o gerador de problemas que sugere novas experiências para aprender coisas novas
