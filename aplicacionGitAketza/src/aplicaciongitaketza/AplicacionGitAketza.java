/*
Autor:Aketza
16/02/2021
 */
package aplicaciongitaketza;

public class AplicacionGitAketza {



    private static void main(String[] args) {
        int day = 13, month = 9, year = 2021;
        String stDat = diaNacimiento_ZELLER(day, month, year);

    }

    private static String diaNacimiento_ZELLER(int day, int month, int year) {
        String[] arrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return arrayWeek[d];
    }

}
