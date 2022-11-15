/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;

/**
 *
 * @author Asus
 */

// 
class BangunRuang
{
    double phi = 3.14, v;
    
    public double tampilHasil()
    {
        return v;
    }
}

class Kubus extends BangunRuang
{
    double s;
    
    public void tampilVol(double s)
    {
        this.s = s;
        v = s * s * s;
        
        
    }
 
}

class Balok extends BangunRuang
{
    double p, l, t;
     
    public void tampilVol(double p, double l, double t)
    {
        this.p = p;
        this.l = l;
        this.t = t;
        v = p * l * t;
        
       
    }
}

class Tabung extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v = phi * r * r * r;
        
       
    }
}

class Kerucut extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v =(phi * r * r * r) * 1/3;
        
       
    }
}

class Limas extends BangunRuang
{
    double la, t;
    
    public void tampilVol(double la, double t)
    {
        this.la = la;
        this.t = t;
        v =(la * t)* 1/3;
        
        
    }
}

class Prisma extends BangunRuang
{
    double la, t;
    
    public void tampilVol(double la, double t)
    {
        this.la = la;
        this.t = t;
        v = la * t;
        
    }
}

class Bola extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v =(phi * r * r * r)* 4/3;   
    }
}

public class Tugas6 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        Limas limas = new Limas();
        Prisma prisma = new Prisma();
        Bola bola = new Bola();
        
        
        kubus.tampilVol(10);
        balok.tampilVol(10, 10, 10);
        tabung.tampilVol(10);
        kerucut.tampilVol(10);
        limas.tampilVol(10, 10);
        prisma.tampilVol(10, 10);
        bola.tampilVol(10);
        System.out.println("Volume Kubus = " + kubus.tampilHasil());
        System.out.println("Volume Balok = " + balok.tampilHasil());
        System.out.println("Volume Tabung = " + tabung.tampilHasil());
        System.out.println("Volume Kerucut = " + kerucut.tampilHasil());
        System.out.println("Volume Limas = " + limas.tampilHasil());
        System.out.println("Volume Prisma = " + prisma.tampilHasil());
        System.out.println("Volume Bola = " + bola.tampilHasil());
        
       
    }
}
