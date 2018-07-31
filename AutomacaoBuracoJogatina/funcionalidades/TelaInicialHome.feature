#language: pt
#encoding: iso-8859-1
@tag
Funcionalidade: Interface da Tela Inicial Home
  I want to use this template for my feature file

  Contexto: 
    ##Dado Dispositivo possui acesso a internet
    Dado Aplicativo est� carregado

  @tag1
  Cenario: Valida elementos textuais da interface da tela Home em ingl�s
    Dado A l�ngua padr�o do dispositivo � ingl�s
    Quando Fechar a tela de an�ncio "mainLayout"
    ##E O sistema carrega a tela inicial Home "mainScreenLayoutRoot"
    Entao Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMoreGames" como "+JOGOS"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonSingleplayer" como "JOGAR AGORA!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMultiplayer" como "MULTIPLAYER"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewPlayersOnline" como "% jogadores online"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewButtonVIPTitle" como "Dispute o Ranking!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewVipDetails" como "Gr�tis por 7 dias, ap�s R$�9,99 / semana"

  @tag2
  Cenario: Valida elementos textuais da tela Home em portugu�s
    Dado A l�ngua padr�o do dispositivo � portugu�s
    Quando Fechar a tela de an�ncio "mainLayout"
    ##E O sistema carrega a tela inicial Home "mainScreenLayoutRoot"
    Entao Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMoreGames" como "+GAMES"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonSingleplayer" como "PLAY NOW!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/buttonMultiplayer" como "MULTIPLAYER"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewPlayersOnline" como "% players online"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewButtonVIPTitle" como "Join the Ranking!"
    E Sistema exibe a label do elemento "com.jogatina.buraco:id/textViewVipDetails" como "Free trial for 7 days, then R$9.99 / week"

  @tag3
  Cenario: Valida demais elementos da tela Home
    Quando Fechar a tela de an�ncio "mainLayout"
    ##E O sistema carrega a tela inicial Home
    ##Bot�o +JOGOS
    Entao Sistema exibe elemento "com.jogatina.buraco:id/buttonMoreGames"
    ##Imagem Buraco Logo
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewLogo"
    ##Imagem Jogatina Logo
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewByJogatina"
    ##Bot�o Jogar Agora
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonSingleplayer"
    ##Bot�o Multiplayer
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonMultiplayer"
    ##Imagem VIP Badge
    E Sistema exibe elemento "com.jogatina.buraco:id/imageViewVipBadge"
    ##Bot�o Dispute o Ranking
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonVIP"
    ##�cone Convidar Amigos
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonInviteFriends"
    ##�cone Conquistas
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonAchievements"
    ##�cone Prefer�ncias
    E Sistema exibe elemento "com.jogatina.buraco:id/buttonSettings"
    ##Campo Propaganda
    E Sistema exibe elemento "com.jogatina.buraco:id/ad_container"
