# language: pt

@Regressivo
Funcionalidade: Buscar as caracteristicas dos personagens

  @Caracteristicas
  Cenario: Verificar a busca das caracteristicas dos personagens da marvel
    Dado que informo o path da busca das caracteristicas
    Quando desejo visualizar as caracteristicas dos personagens comicos da marvel
    Entao devera ser exibido status de sucesso com as caracteristicas

  @Caracteristicas
  Cenario: Verificar a busca das caracteristicas dos personagens da marvel quando informo o path errado
    Dado que informo o path incorreto da busca das caracteristicas
    Quando nao informo o query param da apikey
    Entao devera ser exibido status de conflito