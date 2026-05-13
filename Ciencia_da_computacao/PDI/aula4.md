# Relacionamentos entre pixels
um pixel vai ser referenciado poruma letra minúscula, como p e q 

## Vizinhança 
cada pixel tem no máximo 4 vizinhos ortogonais , a vizinhança-4 , sendo p = (x,y) sua Vizinhança é definida como o conjunto dos pixels [(x+1,y),(x-1,y),(x,y+1),(x,y-1)] quando possível

cada pixel também tem sua vizinhança diagonal com no máximo 4 pixels , sendo p = (x,y), sua vizinhança é definida com o conjunto dos pixels 
[(x+1,y+1),(x-1,y-1),(x-1,y+1),(x+1,y-1)] quando possível

a vizinhança-8 é definida como a união dessas 2 vizinhanças anteriores e são todos os pixels que podem ser alcançadas variando o x e/ou o y em 1.

## Adjacência 
Primeiro é definido o subconjunto V do conjunto da intensidade, 

- Adjacência-4 , são adjacentes todos os pixels cuja intensidade pertence a V que pertencem a vizinhança-4
- Adjacência-8 , são adjacentes todos os pixels cuja intensidade pertence a V que pertencem a vizinhança-8 
- Adjacência-m , é uma modificação da Adjacência-8 que elimina ambiguidades, na qual a vizinhança diagonal não deve conter como vizinhos ortogonais que intercedem o primeiro pixel não devem ter  valores pertencentes a V

## Caminho
começa em (x0,y0) e termina em (s,t)
qualquer pixel que faça parte do caminho é adjacente ao pixel anterior, com excessão do pixel inicial, com o comprimento n (número de pixels no caminho), se o ponto inicial é o mesmo que no final , dizemos que ele é fechado, os caminhos diferem de acordo com a Adjacência escolhida, na Adjacência-m há um caminho único 

## Conexão
se S é um subconjunto de pixels na imagem, podemos dizer que os pixels p e q são conexos em s se tiver ao menos um caminho entre eles, se todos os pixels do conjunto S se conectarem.

## Região 
se o subconjunto S for conexo, podemos chamar eles de região, toda região tem subregiões adjacentes a ele, quando

## Medidas de distância 
seja p=(x,y), q(s,t) e z=(v,w)
a distância será sempre maior ou igual a 0, a distância de um pixel para ele mesmo é zero, a distância de p para q é a mesma de q para p , temos também o axioma euclidiano, que diz que a menor distância entre 2 pontos é uma reta

- distância euclidiana, d= sqrt((x-s)²+(y-t)²), gera uma circunferência
- distância d-4 ou city block , considera apenas distância ortogonais, d=|x-s|+|y-t|, gera um losango 
- distância d-8 , chessboard, considera a adjacencia-8, d= max(d=|x-s|+|y-t|), gera um retangulo
- distância-m , considera a Adjacência-m


## Arranjo matricial
é similar a uma matriz comum, mas sua multiplicação é diferente, multiplicamos a11*b11, a12*b12, ...
em pdi representamos imagens como arranjos matriciais, trabalhamos com ela termo a termo, só podemos operar termo a termo se tivermos arranjos estritramente do mesmo tamanho


# Transformações de intensidade e filtragem espacial 

## Domínio do espaço 
a saída do processo é g, tal que g(x,y)=T[f(x,y) ], onde f é a imagem de entrada, T é o operador em f definido em uma vizinhança do ponto 
## Domínio da frequência
