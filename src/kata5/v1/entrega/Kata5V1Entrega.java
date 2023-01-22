/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata5.v1.entrega;

/**
 *
 * @author aleja
 */
public class Kata5V1Entrega {

    public static void main(String[] args) {
        String path = "email.txt" ;
        MailListReader mlr = MailListReader.of(path);
        List<String> lista = mlr.read();
        MailTableApp mailTableApp = new MailTableApp();
        for (String mail : lista) {
            mailTableApp.insert(mail);
        }
    }
}