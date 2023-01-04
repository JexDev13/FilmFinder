package Logic;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;



/*
 * @author JEREMY
 */
public class Fecha {
    
    public String hora, minutos, segundos, ampm;
    public int diaSemana, diaMes, mes, anio, diaAniadido;
    public String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};
    public String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    public Calendar calendario;
    public Date fechaHoraActual,fechaAux;

    public Fecha() {
        calendario = new GregorianCalendar();
        fechaHoraActual = new Date();
        this.diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        this.diaMes = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH);
        this.anio = calendario.get(Calendar.YEAR);
        this.ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";//METODOS PARA RELOJ
        if (this.ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);
            this.hora = h > 9 ? "" + h : "0" + h;
        } else {
            this.hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        this.minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        this.segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        this.diaAniadido = Calendar.DATE;
    }

    public String getDia() {
        return this.dias[this.diaSemana - 1];
    }

    public String fechaRegistro() {
        int fixMes = this.mes + 1;
        return this.diaMes + "/" + fixMes + "/" + this.anio;
    }

    public String fechaDevolucion(int tiempo, String operacion) {
        if(operacion.equalsIgnoreCase("nueva")){calendario = new GregorianCalendar();}
        if(operacion.equalsIgnoreCase("plazo")){calendario.set(anio, mes, diaMes);}
        calendario.add(this.diaAniadido, tiempo);
        this.mes = (calendario.get(Calendar.MONTH)) + 1;
        this.diaMes = calendario.get(Calendar.DATE);
        this.anio = calendario.get(Calendar.YEAR);
        return this.diaMes + "/" + mes + "/" + this.anio;
    }

    public void fechaAuxiliar(String tokenFecha){
        StringTokenizer valor = new StringTokenizer(tokenFecha,"/");
        this.diaMes=Integer.parseInt(valor.nextToken());
        this.mes=Integer.parseInt(valor.nextToken())-1;
        this.anio=Integer.parseInt(valor.nextToken());
    }
    
    public long diferenciaFechaDias(){
        calendario.set(anio, mes, diaMes);
        fechaAux=calendario.getTime();
        long diferencia = fechaAux.getTime() - fechaHoraActual.getTime();
        return (long) Math.floor(diferencia / (1000 * 60 * 60 * 24));
    }

    @Override
    public String toString() {
        return this.diaMes + " de " + this.meses[this.mes] + " de " + this.anio;
    }
}
