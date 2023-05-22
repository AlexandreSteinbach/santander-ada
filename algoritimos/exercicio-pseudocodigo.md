INICIO principal
  VAR opcao_selecionada: string;
  VAR valor: inteiro;
  VAR saldo: inteiro;
  VAR encerra_programa: boolean;

  DEFINIR encerrar_programa -> falso;

  ENQUANTO encerrar_programa IGUAL_A falso;
    CHAMAR mostrar_menu -> opcao_selecionada
    SE oppcao_selecionada IGUAL_A a
      MOSTRAR "Seu saldo é:", saldo;
    OU_SE opcao_selecionada IGUAL_A b
      MOSTRAR "Digite o valor a depositar: "
      esperar_digitacao -> valor
      SOMAR valor, saldo -> saldo
      MOSTRAR "Deposito efetuado";
    OU_SE opcao_selecionada IGUAL_A c
      MOSTRAR "Digite o valor a retirar: "
      esoerar_digitacao
      SE valor > saldo
        MOSTRAR "Saque não permitido, saldo insuficiente"
      SENAO
        SUBTRAIR valor, saldo -> saldo;
        FIM SE
        MOSTRAR "Saque efetuado"
    OU_SE opcao_selecionada IGUAL_A d
      DEFINIR Verdadeiro -> encerrar_programa
    SENAO
      MOSTRAR "Opção invalida, tente novamente"
    FIM SE
  FIM ENQUANTO
FINAL
