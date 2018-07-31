#language: pt
#encoding: iso-8859-1
@tag
Funcionalidade: Interface da Tela Inicial Home
  I want to use this template for my feature file

  Contexto: 
    ##Dado Dispositivo possui acesso a internet
    Dado Aplicativo está carregado

  @tag1
  Cenario: Valida elementos textuais da interface da tela Home em inglês
    Dado A língua padrão do dispositivo é inglês
    Quando Fechar a tela de anúncio "mainLayout"
    ##E O sistema carrega a tela inicial Home "mainScreenLayoutRoot"
    Entao Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMoreGames" como "+JOGOS"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonSingleplayer" como "JOGAR AGORA!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMultiplayer" como "MULTIPLAYER"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewPlayersOnline" como "% jogadores online"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewButtonVIPTitle" como "Dispute o Ranking!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewVipDetails" como "Grátis por 7 dias, após R$ 9,99 / semana"

  @tag2
  Cenario: Valida elementos textuais da tela Home em português
    Dado A língua padrão do dispositivo é português
    Quando Fechar a tela de anúncio "mainLayout"
    ##E O sistema carrega a tela inicial Home "mainScreenLayoutRoot"
    Entao Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMoreGames" como "+GAMES"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonSingleplayer" como "PLAY NOW!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMultiplayer" como "MULTIPLAYER"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewPlayersOnline" como "% players online"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewButtonVIPTitle" como "Join the Ranking!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewVipDetails" como "Free trial for 7 days, then R$9.99 / week"

  @tag3
  Cenario: Valida demais elementos da tela Home
    Quando Fechar a tela de anúncio "mainLayout"
    ##E O sistema carrega a tela inicial Home
    ##Botão +JOGOS
    Entao Sistema exibe elemento "com.jogatina.buraco:id/buttonMoreGames"
    ##Imagem Buraco Logo
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewLogo"
    ##Imagem Jogatina Logo
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewByJogatina"
    ##Botão Jogar Agora
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonSingleplayer"
    ##Botão Multiplayer
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonMultiplayer"
    ##Imagem VIP Badge
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewVipBadge"
    ##Botão Dispute o Ranking
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonVIP"
    ##Ícone Convidar Amigos
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonInviteFriends"
    ##Ícone Conquistas
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonAchievements"
    ##Ícone Preferências
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonSettings"
    ##Campo Propaganda
    E Sistema exibe elemento "com.jogatina.buraco:id/ad_container"
