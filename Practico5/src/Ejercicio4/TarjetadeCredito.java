/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author heber
 */
public class TarjetadeCredito {
  private String numero;
  private String vencimiento; 
  private Banco banco;
  private Cliente cliente;
  
  public TarjetadeCredito(String numero, String vencimiento, Banco banco){
      this.numero=numero;
      this.vencimiento=vencimiento;
      this.banco = banco;
  }
  public void mostrarBanco(){
      if(banco!=null){
          System.out.println("\nTitular: "+cliente.getNombre()+
                            "\n Banco: "+banco.getNombre()+
                            "\nN° de tarjeta: "+numero+
                            "\nVencimiento: "+vencimiento);
      }
  }
  
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente!= null && cliente.getTarjeta()!=this)
        cliente.setTarjeta(this);
    }

    public Cliente getCliente() {
        return cliente;
    }
  
}
