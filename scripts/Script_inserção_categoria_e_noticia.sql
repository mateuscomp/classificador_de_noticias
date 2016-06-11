# Script para inserção de categoria de notícia
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (1, 'Esporte');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (2, 'Lazer');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (3, 'Novela');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (4, 'Politica');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (5, 'Cotidiano');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (6, 'Economia');
INSERT INTO `classificador`.`categoria` (`id`, `nome`) VALUES (7, 'Tecnologia');
# Script para inserção de notícia
INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Palmeiras campeão do Brasileirão', 1000, 'http://www.globoesporte.com.br/?get=985', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Paraíba tem as melhores praias no Brasil', 5000, 'http://www.ego.com.br/?get=35', 2);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('O cravo brigou com a rosa', 100, 'http://www.ocravoearosa.com.br/?get=16', 3);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Temer sofre pressão de senadores e reclama das exigências deles', 55, 'http://www1.folha.uol.com.br/colunas/monicabergamo/2016/06/1779312-temer-sofre-pressao-de-senadores-e-reclama-das-exigencias-deles.shtml', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('O que pensam os gays que apoiam Bolsonaro e rechaçam Jean Wyllys', 42, 'http://noticias.uol.com.br/ultimas-noticias/bbc/2016/06/08/o-que-pensam-os-gays-que-apoiam-bolsonaro-e-rechacam-jean-wyllys.htm', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Rock in Rio pede R$ 8,8 milhões via lei Rouanet para show sem público', 20, 'http://www1.folha.uol.com.br/ilustrada/2016/06/1779327-rock-in-rio-pede-r-88-milhoes-via-lei-rouanet-para-show-sem-publico.shtml', 2);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Ganso espera oferta salarial do SPFC e promete prioridade até fevereiro', 06, 'http://blogdoperrone.blogosfera.uol.com.br/2016/06/ganso-espera-oferta-salarial-do-spfc-e-promete-prioridade-ate-fevereiro/', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Dilma fará viagem a Campinas em jato fretado; PT vai pagar', 45, 'http://g1.globo.com/politica/noticia/2016/06/sem-poder-viajar-de-fab-dilma-decide-fretar-jato-para-fazer-viagem.html', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Justin Bieber lança videoclipe de Company', 02, 'http://g1.globo.com/musica/noticia/2016/06/justin-bieber-lanca-videoclipe-de-company-assista.html', 2);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Ganhador da Mega na BA ainda não sacou R$ 19 mi, 15 dias após sorteio', 180, 'http://g1.globo.com/bahia/noticia/2016/06/ganhador-da-mega-na-ba-ainda-nao-sacou-r-19-mi-15-dias-apos-sorteio.html', 2);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Papa recebe membros de escola canina de busca e salvamento marinho', 07, 'http://g1.globo.com/mundo/noticia/2016/06/papa-recebe-membros-de-escola-canina-de-busca-e-salvamento-marinho.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Sharapova é suspensa por 2 anos por doping no Australia Open', 07, 'http://esportes.terra.com.br/tenis/sharapova-e-suspensa-por-2-anos-pela-federacao-internacional-de-tenis,c5d8868d984e01ff75059aad742d08209ggxtf0c.html', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Cicarelli e Junior ironizam rótulos de ‘fracassada’ e ‘gay enrustido’', 12, 'http://diversao.terra.com.br/tv/sala-de-tv/blog/2016/06/08/cicarelli-e-junior-ironizam-rotulos-de-%E2%80%98fracassada%E2%80%99-e-%E2%80%98gay-enrustido%E2%80%99-2/', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Príncipe Harry é flagrado beijando cantora Ellie Goulding', 21, 'http://noticias.terra.com.br/mundo/europa/principe-harry-e-flagrado-beijando-cantora-ellie-goulding-aponta-the-sun,9cedfb31e907ae3d982fa56e562de6d17qy9jdz2.html', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Receita apreende R$ 70 milhões em produtos em operação contra pirataria', 88, 'http://g1.globo.com/sao-paulo/noticia/2016/06/receita-apreende-r-70-milhoes-em-produtos-em-operacao-contra-pirataria.html', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Caminhão invade casa e deixa dois mortos em Salvador', 30, 'http://g1.globo.com/bahia/noticia/2016/06/acidente-com-veiculo-deixa-feridos-presos-nas-ferragens-em-salvador.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Médica é achada morta, amordaçada e amarrada, em banheiro de casa no DF', 10, 'http://g1.globo.com/distrito-federal/noticia/2016/06/medica-e-achada-morta-amordacada-e-amarrada-em-banheiro-de-casa-no-df.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Após liberar Réver ao Fla, Inter acerta a contratação de Leandro Almeida', 223, 'http://globoesporte.globo.com/rs/futebol/noticia/2016/06/apos-liberar-rever-inter-negocia-e-fica-perto-de-contratar-leandro-almeida.html', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Google supera Apple e volta ao topo do ranking de marcas mais valiosas', 43, 'http://g1.globo.com/economia/midia-e-marketing/noticia/2016/06/google-supera-apple-e-volta-ao-topo-do-ranking-de-marcas-mais-valiosas.html', 6);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Gerusa descobre que tem leucemia', 2, 'http://gshow.globo.com/novelas/eta-mundo-bom/vem-por-ai/noticia/2016/06/gerusa-descobre-que-tem-leucemia.html', 3);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Pancrácio descobre a verdade sobre Sandra!', 29, 'http://gshow.globo.com/novelas/eta-mundo-bom/vem-por-ai/noticia/2016/06/pancracio-descobre-verdade-sobre-sandra.html', 3);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Forbes: Cristiano Ronaldo se torna o esportista mais bem pago do planeta', 71, 'http://globoesporte.globo.com/futebol/futebol-internacional/futebol-espanhol/noticia/2016/06/forbes-cristiano-ronaldo-se-torna-o-esportista-mais-bem-pago-do-planeta.html', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('WhatsApp pode ganhar suporte a GIFs em próximas atualizações', 12, 'http://www.techtudo.com.br/noticias/noticia/2016/06/whatsapp-pode-ganhar-suporte-gifs-em-proximas-atualizacoes.html', 7);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Descoberto possível ancestral do "hobbit", hominídeo baixinho da Indonésia', 09, 'http://noticias.uol.com.br/ciencia/ultimas-noticias/redacao/2016/06/08/descoberto-possivel-anscestral-do-hobbit-hominidio-baixinho-da-indonesia.htm', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Filme mostra passagem de Janis Joplin pelo Brasil, mas Serguei fica de fora', 10, 'http://cinema.uol.com.br/noticias/redacao/2016/06/08/documentario-de-janis-mostra-passagem-pelo-brasil-mas-serguei-fica-de-fora.htm', 2);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Após 23 anos, José Aparecido conta segredo e admite um erro na final de 93', 215, 'http://esporte.uol.com.br/futebol/ultimas-noticias/2016/06/08/apos-23-anos-juiz-de-palmeiras-x-corinthians-conta-segredo-e-erro-na-final.htm', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Neymar teve ajuda de especialista para conhecer celebridades nos EUA', 36, 'http://uolesporte.blogosfera.uol.com.br/2016/06/08/neymar-teve-ajuda-de-especialista-para-conhecer-celebridades-nos-eua/', 1);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Como Xangai está punindo filhos que não cuidam de pais idosos', 03, 'http://noticias.terra.com.br/mundo/videos/como-xangai-esta-punindo-filhos-que-nao-cuidam-de-pais-idosos,8113261.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Ana Hickmann aparece sem maquiagem e chama atenção na web', 17, 'http://www.reporterdiario.com.br/noticia/2187579/ana-hickmann-aparece-sem-maquiagem-e-chama-atencao-na-web/?utm_source=feedburner&utm_medium=feed&utm_campaign=Feed%3A+jornalreporterdiario+%28Jornal+Rep%C3%B3rter+Di%C3%A1rio+-+RSS%29&ref=yfp', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('5 coisas que você deveria excluir do seu Facebook agora mesmo', 25, 'https://br.noticias.yahoo.com/5-coisas-que-voc%C3%AA-deveria-excluir-do-seu-facebook-085411779.html', 7);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Japonês da Federal é preso em Curitiba', 234, 'https://br.noticias.yahoo.com/japon-s-da-federal-preso-1446355425640502.html', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Sasha Meneghel usa vestido de estilista brasileira avaliado em R$ 30 mil', 54, 'https://br.vida-estilo.yahoo.com/sasha-meneghel-usa-vestido-de-estilista-brasileira-152521153.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Lula venceria 1º turno em todos os cenários, diz CNT/MDA', 610, 'http://noticias.terra.com.br/brasil/politica/eleicoes/lula-venceria-1-turno-em-os-todos-cenarios-apontados-por-pequisa-cntmda,3835b44a386a15085bdcee554757b8deemsxuq6v.html', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Sobe o número de mortos em grave acidente na rodovia Mogi-Bertioga', 333, 'http://g1.globo.com/sp/santos-regiao/noticia/2016/06/sobe-o-numero-de-mortos-em-grave-acidente-na-rodovia-mogi-bertioga.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Casa onde aconteceu estupro coletivo no Rio terá nova perícia', 55, 'http://g1.globo.com/rio-de-janeiro/noticia/2016/06/casa-onde-aconteceu-estupro-coletivo-no-rio-tera-nova-pericia.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Delator diz que pagou US$ 4,5 milhões em caixa 2 para campanha de Dilma', 199, 'http://oglobo.globo.com/brasil/delator-diz-que-pagou-us-45-milhoes-em-caixa-2-para-campanha-de-dilma-19466700', 4);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Mega-Sena pode pagar R$ 2,2 milhões nesta quinta-feira', 15, 'http://g1.globo.com/loterias/noticia/2016/06/mega-sena-pode-pagar-r-22-milhoes-nesta-quinta-feira.html', 5);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Safra de grãos deve ficar 6,5% menor em 2016, estima IBGE', 03, 'http://g1.globo.com/economia/agronegocios/noticia/2016/06/safra-de-graos-deve-ficar-65-menor-em-2016-estima-ibge.html', 6);

INSERT INTO `classificador`.`noticia` (`titulo`, `numero_de_comentarios`, `url`, `categoria_id`) VALUES ('Funeral de Muhammad Ali começará com oração muçulmana', 08, 'http://g1.globo.com/mundo/noticia/2016/06/dois-dias-de-adeus-universal-a-muhammad-ali.html', 1);

