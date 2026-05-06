📄 PROBLEMS ANALYSIS (FAZ 0)
## 1. GOD CLASS PROBLEMİ

GameObject sınıfı, oyuncu, düşman ve nesne gibi birden fazla nesne türünü yönetmektedir.
Bu durum Tek Sorumluluk Prensibi’ni (SRP) ihlal eder çünkü bir sınıf birden fazla farklı sorumluluğu üstlenmektedir.

## 2. TİP BAZLI KOŞUL KULLANIMI (IF-ELSE ZİNCİRİ)

Tüm davranışlar "type" değişkenine bağlı if-else blokları ile kontrol edilmektedir.
Bu yapı, yeni bir tür eklendiğinde mevcut kodun değiştirilmesini gerektirir ve bakımı zorlaştırır.

## 3. AÇIK/KAPALI PRENSİBİ İHLALİ

Yeni bir oyun nesnesi türü eklemek için mevcut kodun değiştirilmesi gerekir.
Bu durum sistemin genişletilebilirliğini azaltır ve hata riskini artırır.

## 4. SIKI BAĞLILIK (TIGHT COUPLING)

GameEngine (veya ana yapı) doğrudan GameObject sınıfına bağımlıdır.
Bu durum sistemi esnek olmaktan çıkarır ve değişiklik yapmayı zorlaştırır.

## 5. ZAYIF ÖLÇEKLENEBİLİRLİK

Nesne türü arttıkça if-else blokları da artar.
Bu durum kodun okunabilirliğini düşürür ve tekrar eden kod yapısına yol açar.

🤖 YAPAY ZEKA ANALİZİ
## Kullanılan Prompt

"Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri bu sorunları çözebilir? Her sorun için kısa bir açıklama yaz."

## AI TESPİTLERİ

Yapay zeka aşağıdaki sorunları tespit etmiştir:

God Class problemi
Aşırı if-else kullanımı
SOLID prensiplerinin ihlali
Sınıflar arası sıkı bağımlılık
Genişletilebilirlik ve bakım zorluğu
## YAPAY ZEKANIN ÖNERDİĞİ TASARIM ÖRÜNTÜLERİ
Factory Method (nesne oluşturmayı yönetmek için)
Strategy Pattern (davranışları ayırmak için)
Observer Pattern (ileride event tabanlı yapı için)
🔍 KARŞILAŞTIRMA (BENİM ANALİZİM VS AI)
## BENZERLİKLER
Her iki analiz de God Class problemini tespit etmiştir.
İki analiz de if-else yapısının sorunlu olduğunu belirtmiştir.
Genişletilebilirlik ve bakım zorluğu ortak olarak vurgulanmıştır.
## FARKLILIKLAR
AI, SOLID prensiplerine daha net şekilde referans vermiştir.
AI daha fazla tasarım örüntüsü önermiştir.
Benim analizim daha çok pratik yazılım sorunlarına odaklanmıştır.
## SONUÇ

Her iki analiz birbiriyle uyumludur. Bu sistem bilinçli olarak problemli tasarlanmıştır ve sonraki aşamalarda tasarım örüntüleri ile iyileştirilecektir.