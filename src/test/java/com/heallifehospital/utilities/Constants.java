package com.heallifehospital.utilities;

import java.sql.Timestamp;
import java.util.List;

public class Constants {

    public static int WAIT_TIME_15 = 15;
    public static int WAIT_TIME_10 = 10;
    public static int WAIT_TIME_30 = 30;
    public static int DEFAULT_WAIT_TIME = 20;
    public static String urunCodu = "10003330";
    public static String recipientName= "NttData";
    public static String recipientSurname= "Test Team";
    public static String recipientPhone="5065960977";
    public static String recipientAddress="Menekse sokak No:170";
    public static String kkName="Test Automation";
    public static String kkNumber="4603450000000000";
    public static String kkExp="05/25";
    public static String kkCVC="000";
    public static String smsCodeText="283126";
    public static String IL = "ANKARA";
    public static String ILCE = "ÇANKAYA";
    public static String FATURA_ADRESI = "KAVAK YELLERİ SOKAK NO:";
    public static String VERGI_DAIRESI = "ÇANKAYA";
    public static String TCKN = "";
    public static String E_POSTA_ADRESI = "";
    public static String CEP_TELEFONU = "5555555555";






    // --- ADDRESS CONSTANTS ---
    public static String AD = "Test";
    public static String SOYAD = "Account";
    public static String AD_SOYAD = "Test Account";
    public static String CEP_NO = "5529578095";
    public static String ADRES = "Atatürk Cd. Sevgi Sk. No:50 Daire:3 ";
    public static String ADRES_BASLIGI = "Ev";
    public static String ADRES_BASLIGI_YENI = "Ofis";
    public static String AD_YENI = "Test";
    public static String SOYAD_YENI = "Account";
    public static String CEP_NO_YENI = "5529578090";
    public static String ADRES_YENI = "Cumhuriyet Cd. Saygı Sk. No:40 Daire:6 ";
    public static String VERGI_NUMARASI = "7220060643";
    public static String VERGI_NUMARASI_YENI = "1234567890";
    public static String FATURA_UNVANI = "TEST OTOMASYON SAN.TİC.LTD.ŞTİ.";
    public static String RANDOM_MARKA = "RANDOM_MARKA";
    public static String RANDOM_IL_KODU = "RANDOM_IL";
    public static String RANDOM_ILCE_KODU = "RANDOM_ILCE";
    public static String RANDOM_MAHALLE_KODU = "RANDOM_MAHALLE";
    public static String RANDOM_RENK = "RANDOM_RENK";
    public static String RANDOM_DERINLIK = "RANDOM_DERINLIK";
    public static String RANDOM_YUKSEKLIK = "RANDOM_YUKSEKLIK";
    public static String RANDOM_SATICI = "RANDOM_SATICI";
    public static String RANDOM_FIYAT = "RANDOM_FIYAT";
    public static String PDP_URUN_ADI = "PDP_URUN_ADI";
    public static final ThreadLocal<String> PDP_URUN_KODU = new ThreadLocal<>();
    public static double PDP_URUN_FIYATI = 0.0;
    public static double PDP_3_AL_2_ODE_URUN_FIYATI = 0.0;
    public static String INDIRIMLI_URUN_SAYISI_PLP = "INDIRIMLI_URUN_SAYISI_PLP";
    public static String PDP_MAGAZA_ADI = "PDP_MAGAZA_ADI";
    public static String UCRETSIZ_KARGO_URUN_SAYISI_PLP = "UCRETSIZ_KARGO_URUN_SAYISI_PLP";
    public static String UC_AL_IKI_ODE_URUN_SAYISI_PLP = "UC_AL_IKI_ODE_URUN_SAYISI_PLP";
    public static String SIPARIS_NO = "SIPARIS_NO";
    public static String PDP_SATICI_ADI = "PDP_SATICI_ADI";
    public static String URUN_ARAMA_MARKA_ADI = "Minar Mobilya";
    public static String URUN_ARAMA_KATEGORI_ADI = "Kombi";
    public static String URUN_ARAMA_URUN_ADI = "Eldiven";
    public static String URUN_ARAMA_URUN_KODU = "1000316304";
    public static String PDP_DIGER_SATICI_ADI = "PDP_DIGER_SATICI_ADI";
    public static String PDP_FARKLI_SATICI_ADI = "PDP_FARKLI_SATICI_ADI";
    public static boolean isEmailSelected;
    public static boolean isSmsSelected;
    public static boolean isPhoneSelected;
    public static String KAYITLI_OLMAYAN_CEP_NO = "5442640001";
    public static String KAYITLI_OLMAYAN_EMAIL = "kayitliolmayanemail123@koctas.com.tr";
    public static String YANLIS_EMAIL_FORMAT = "testaccountkoctas.com.tr";
    public static String YANLIS_SIFRE = "Ma123456";
    public static String AFADA_TESLIM_URUN = "AFAD'A TESLİM EDİLEBİLİR ÜRÜN";
    public static String COKLU_SATICILI_URUN = "1000714641";
    public static String MAGAZA_TESLIM_URUN_COKLU_SATICI = "5000079664";
    public static String KOCTAS_VE_SATICISI_OLAN_URUN = "1000635984";
    public static String KOCTASIN_SATMADIGI_URUN = "5000000001";
    public static String SATICI_URUNU = "1000045451";
    public static String SORU_CEVAPLI_URUN = "1000045451";
    public static String UCTEN_FAZLA_SORU_CEVAPLI_URUN = "1000045451";
    public static String MAGAZA_KODU = "MAGAZA_KODU";
    public static int PDP_LIKE_SAYISI = 0;
    public static int PDP_DISLIKE_SAYISI = 0;
    public static ThreadLocal<List<String>> SEPET_URUN_LISTESI = new ThreadLocal<>();
    public static ThreadLocal<List<String>> SEPET_URUN_LISTESI_LINKLERI = new ThreadLocal<>();
    public static Timestamp TEST_BASLANGIC_SAATI;
    public static Timestamp TEST_BITIS_SAATI;


}