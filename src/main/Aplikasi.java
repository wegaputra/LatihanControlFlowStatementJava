package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;

public class Aplikasi {
    public static void main(String[] args) {
        
        System.out.println("Test Case nilaiYangDibayarkan");
        Pembayaran pembayaran = new Pembayaran();
        
        int nilaiYangDibayarkan;
        
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 2
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 3
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        System.out.println("Test Case gajiYangDibayarkan");
        Karyawan karyawan = new Karyawan();
        
        int gajiYangDibayarkan;
        
        //test case 1
        gajiYangDibayarkan = karyawan.hitungGaji(6000000, 0.1, 6000000);
        System.out.println(gajiYangDibayarkan);
        
        //test case 2
        gajiYangDibayarkan = karyawan.hitungGaji(4000000, 0.1, 3000000);
        System.out.println(gajiYangDibayarkan);
        
        //test case 3
        gajiYangDibayarkan = karyawan.hitungGaji(500000, 0.1, 1000000);
        System.out.println(gajiYangDibayarkan);
        
        System.out.println("Test Case PPHYangHarusDibayarkan");
        int PPHYangHarusDibayarkan;
        
        PPHYangHarusDibayarkan = karyawan.hitungPPH(6000000, 0.1, 6000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        //test case 2
        PPHYangHarusDibayarkan = karyawan.hitungPPH(4000000, 0.1, 3000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        //test case 3
        PPHYangHarusDibayarkan = karyawan.hitungPPH(500000, 0.1, 1000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        System.out.println("Test Case nilaiTagihanPembayaranSetelahDenda");
        Customer customer = new Customer();
        int nilaiTagihanPembayaranSetelahDenda;
        
        //test case 1
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        //test case 2
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        System.out.println("Test Case jenisTumpahan");
        Expert expert = new Expert();
        boolean jenisTumpahan;
        
        //test case 1
        jenisTumpahan = expert.isAceticAcid(true, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 2
        jenisTumpahan = expert.isAceticAcid(true, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 3
        jenisTumpahan = expert.isAceticAcid(true, 7, true);
        System.out.println(jenisTumpahan);
        
        //test case 4
        jenisTumpahan = expert.isAceticAcid(true, 5, false);
        System.out.println(jenisTumpahan);
        
        //test case 5
        jenisTumpahan = expert.isAceticAcid(true, 6, false);
        System.out.println(jenisTumpahan);
        
        //test case 6
        jenisTumpahan = expert.isAceticAcid(true, 7, false);
        System.out.println(jenisTumpahan);
        
        //test case 7
        jenisTumpahan = expert.isAceticAcid(false, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 8
        jenisTumpahan = expert.isAceticAcid(false, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 9
        jenisTumpahan = expert.isAceticAcid(false, 7, true);
        System.out.println(jenisTumpahan);
        
        
        System.out.println("Test Case statusAlarmWarning");
        Alarm alarm = new Alarm();
        boolean statusAlarmWarning;
        
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 2
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 3
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 4
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 5
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 6
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 7
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 8
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, false);
        System.out.println(statusAlarmWarning);
        
    }
    
}
