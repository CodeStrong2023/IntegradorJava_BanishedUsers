
package opcion2mejorada;

/*
    Versión mejorada de la opcion n°2 del menú. Utilizando
    operaciones matematicas con formulas astronomicas

    Referencias: https://la-liturgia.blogspot.com/2020/03/el-calculo-de-la-fecha-de-la-pascua-la.html
                 https://www.youtube.com/watch?v=0ZImiMLtQg0&t=548s&ab_channel=Programaci%C3%B3nMiltoniana
*/

public class Calendariolunar {
    int dia;
    int mes;
    int año = 2023; // Año fijo

    int Metonico;
    int Epacta;
    int Epactaconcreta;
    int total;

    void algoritmo() {
        Metonico = (año + 1) % 19; // Formula para calcular el ciclo metónico (el 19 es número áureo astronómico)

        Epacta = ((Metonico - 1) * 11) % 30; // Formula para calcular la Epacta (edad de la luna al comenzar el año)

        if (mes == 1 || mes == 3) {
            Epactaconcreta = (90) + dia; // La luna comienza el año con 90 días de edad, y luego se suma el número de días en el mes para
                                         // obtener la edad de la luna en la fecha específica.
        }

        if (mes == 2) {
            Epactaconcreta = (1) + dia; // En febrero, la luna comienza el año con solo 1 día de edad, y se suma el número de días en el mes.
        }

        if (mes >= 4 && mes <= 12) {
            Epactaconcreta = (mes - 3) + dia; // En estos meses, la edad de la luna al comenzar el año se calcula tomando el número de 
                                              // meses desde marzo (mes - 3) y luego se suma el número de días en el mes.
        }

        total = (Epacta + Epactaconcreta);
        if (total >= 30) {
            total = total % 30; // Si el total es mayor o igual a 30, se toma el módulo 30 para obtener un valor entre 0 y 29, que se 
                                // utiliza para determinar la fase lunar en esa fecha.
        }
    }
}

