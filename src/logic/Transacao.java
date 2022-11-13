package logic;

import java.text.*;
import java.util.Date;

public class Transacao {
    private Conta destino;
    private String tipoTransacao;
    private boolean envio_Recebe; //ENVIO true, RECEBE false
    String data; 
    private double valor;

    public Transacao(double valor, String tipoTransacao, boolean envio_Recebe) {
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.envio_Recebe = envio_Recebe;
        data = getDateTime();
    }
    public Transacao(Conta destino, double valor, String tipoTransacao, boolean envio_Recebe) {
        this.destino = destino;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.envio_Recebe = envio_Recebe;
        data = getDateTime();
    }

    public Conta getDestino() {
        return destino;
    }
    public double getValor() {
        return valor;
    }
    public String getData() {
        return data;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public boolean getEnvio_Recebe() {
        return envio_Recebe;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

   


}
