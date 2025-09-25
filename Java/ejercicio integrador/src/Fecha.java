public class Fecha {

    int dia;
    int mes;
    int año;

    Fecha(int d, int m, int a) {

        dia = d;
        mes = m;
        año = a;

    }

    public static Fecha hoy(){

        return new Fecha(25,9,2025);

    }

    public int distanciaEnAnios(Fecha fecha) {

        int distancia = Math.abs(fecha.año-this.año);

        if (fecha.año < this.año) {
            if (fecha.mes == this.mes) {
                if (fecha.dia > this.dia) {
                    distancia -= 1;
                }
            } else if (fecha.mes > this.mes) {
                distancia -= 1;
            }
        } else if (fecha.año > this.año){
            if (this.mes == fecha.mes) {
                if (fecha.dia < this.dia) {
                    distancia -= 1;
                }
            } else if (fecha.mes < this.mes) {
                distancia -= 1;
            }
        } else {
            distancia = 0;
        }
        return distancia;
    }
}
