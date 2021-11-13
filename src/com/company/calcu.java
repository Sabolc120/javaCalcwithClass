package com.company;

import java.util.Random;
import java.util.Scanner;
public class calcu{
    public int _elsoszam;
    public int _masodikszam;
    public char _operátor;
    public  calcu(int elsoszam, int masodikszam, char operátor){
        _elsoszam = elsoszam;
        _masodikszam = masodikszam;
        _operátor = operátor;
    }
    public void bekeres() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add meg az első számot: ");
            _elsoszam = scanner.nextInt();
            System.out.println("Az elsőszám a következő: " + _elsoszam);
            System.out.println("Add meg a második számot: ");
            _masodikszam = scanner.nextInt();
            System.out.println("A második szám a következő: " + _masodikszam);
            System.out.println("Add meg az operátort: (+, -, /, %)");
            _operátor = scanner.next().charAt(0);
            System.out.println("Az operátor a következő: " + _operátor);
        }
        catch(Exception exception){
            System.out.println("Nem megfelelő bevitel.");
        }
    }
    public void calcu(){
        if(_operátor == '+'){
            System.out.println("Összeadás eredménye: ");
            System.out.println(_elsoszam + _masodikszam);
        }
        if(_operátor == '-'){
            System.out.println("Kivonás eredménye: ");
            System.out.println(_elsoszam - _masodikszam);
        }
        if(_operátor == '*'){
            System.out.println("Szorzás eredménye: ");
            System.out.println(_elsoszam * _masodikszam);
        }
        if(_operátor == '/'){
            System.out.println("Osztás eredménye: ");
            System.out.println(_elsoszam / _masodikszam);
        }
        if(_operátor == '%'){
            System.out.println("Maradékos osztás eredménye: ");
            System.out.println(_elsoszam % _masodikszam);
        }
    }
}