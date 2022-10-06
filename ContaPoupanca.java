package br.com.E1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ContaPoupanca extends Conta{

  @Override
  public void imprimeSaldo() {
    System.out.println("### Extrato da Conta ###");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");

    Date date = new Date();
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Data: " + sdf.format(date));
  }
  
}