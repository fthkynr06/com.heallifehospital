package com.heallifehospital.utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CSVGenerator {

    public static void main(String[] args) {
        int sayiMiktari = 1000; // Oluşturulacak sayı miktarı
        int baslangicDegeri = 100000001; // İlk sayının değeri
        int minBasamakSayisi = 9; // Minimum basamak sayısı
        String dosyaAdi = "sayilar.csv"; // Oluşturulacak CSV dosyasının adı

        Set<Integer> sayilar = new HashSet<>();

        Random random = new Random();
        while (sayilar.size() < sayiMiktari) {
            int sayi = random.nextInt(900000000) + baslangicDegeri; // 8 basamaktan büyük rastgele sayı oluşturma
            if (String.valueOf(sayi).length() >= minBasamakSayisi) {
                sayilar.add(sayi);
            }
        }

        try (FileWriter writer = new FileWriter(dosyaAdi)) {
            writer.write("Sayılar\n"); // Başlık satırı

            for (int sayi : sayilar) {
                writer.write(sayi + "\n");
            }

            System.out.println("CSV dosyası oluşturuldu: " + dosyaAdi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

