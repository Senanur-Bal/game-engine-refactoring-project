# Phase 3 - AI Pair Programming Log

## 1. Genel Bilgi ve Süreç
Bu faz kapsamında yapay zekâ ile yaklaşık **30-45 dakika süren bir pair programming süreci** yürütülmüştür. Amaç, Phase 3 kapsamında yer alan behavioral pattern’lerin (Observer ve Strategy) doğru şekilde uygulanması, structural pattern’lerle entegrasyonun kontrol edilmesi ve projenin genel olarak teslim edilebilir hale getirilmesidir.

Bu süreç boyunca AI, hem tasarım desenlerinin doğru anlaşılması hem de proje yapısının düzenlenmesi konusunda aktif olarak kullanılmıştır.

---

## 2. Süreçte Tartışılan ve Geliştirilen Konular

### Observer Pattern
- Player sınıfındaki health değişimlerinin nasıl takip edileceği detaylı şekilde tartışıldı.
- HealthUI ve GameLogger sınıflarının Player ile ilişkisi incelendi ve veri akışının nasıl sağlandığı tartışıldı.
- Sistem içerisinde değişimlerin ilgili sınıflara aktarılması mantığı değerlendirildi.
- Observer pattern yaklaşımının temel fikri (bağımlılıkların azaltılması ve veri akışının yönetilmesi) açıklanarak proje yapısı ile ilişkilendirildi.

---

### Strategy Pattern
- Enemy sınıfının saldırı davranışını runtime’da değiştirebilmesi için yapı tasarlandı.
- MeleeAttack ve RangedAttack sınıflarının ayrı stratejiler olarak kullanımı doğrulandı.
- Saldırı davranışının değiştirilebilir olması fikri açıklandı.
- Strategy pattern’in Open/Closed Principle ile ilişkisi değerlendirildi, katkısı tartışıldı.

---

### Structural Pattern Entegrasyonu
- Decorator Pattern ile GameObject’e dinamik özellik ekleme mantığı incelendi.
- DamageBoostDecorator kullanımının saldırı gücünü nasıl artırdığı açıklandı.
- Adapter Pattern ile LegacyEnemy sınıfının mevcut sisteme uyumu sağlandı.
- Eski sistemin değiştirilmeden yeni sisteme entegre edilmesi prensibi doğrulandı.

---

### Proje ve Git Süreci
- Git add, commit ve push sıralaması kontrol edildi ve hatasız hale getirildi.
- Branch yapısı (phase-3) üzerinde çalışma düzenlendi.
- README dosyasının ödev formatına uygun hale getirilmesi sağlandı.
- UML diyagramının doğru klasöre eklenmesi ve GitHub’a gönderilmesi sağlandı.

---

## 3. AI Olmadan Bu Faz Ne Kadar Sürerdi?

Eğer bu süreç AI desteği olmadan yapılmış olsaydı:

- Tasarım desenlerinin doğru uygulanması: 1.5 - 2 saat  
- UML ve README düzenleme: 1 - 1.5 saat  
- Git hatalarının çözülmesi ve yapılandırma: 30 - 60 dakika  
- Test ve düzeltme süreci: yaklaşık 1 saat  

Toplamda bu fazın **3 ila 5 saat arasında** sürebileceği öngörülmektedir.

AI kullanımı ile bu süreç yaklaşık **30-45 dakika içinde** tamamlanmış ve hata oranı azaltılmıştır.

---

## 4. AI’nın Yanılttığı veya Dikkat Gerektiren Noktalar

- UML dosya ismi konusunda farklı öneriler verilmiştir (phase3-UML.png / uml.png gibi).
- Git klasör yapısı konusunda başlangıçta bazı yanlış yönlendirmeler olmuştur.
- cd komutu ve repo klasör adı konusunda netleştirme gerekmiştir.
- Bazı Git adımlarında (add/commit/push) sıralama başlangıçta tekrar kontrol edilmiştir.
- Dosya yolları (özellikle UML görselinin bulunduğu klasör) ilk etapta tam net olmadığı için manuel olarak File Explorer üzerinden doğrulama yapılması gerekmiştir.

---

## 5. Sonuç ve Değerlendirme

Bu fazda AI, özellikle:
- Tasarım desenlerinin doğru uygulanması
- Proje mimarisinin düzenlenmesi
- Dokümantasyonun (README ve UML) ödev formatına uygun hale getirilmesi
- Git sürecinin doğru yönetilmesi

konularında büyük katkı sağlamıştır.

Bununla birlikte, bazı dosya isimlendirme ve yol hatalarında manuel kontrol yapılması gerektiği görülmüştür. Bu durum, AI kullanımının tamamen bağımsız değil, doğrulama ile birlikte kullanılması gerektiğini göstermektedir.

Genel olarak AI, geliştirme sürecinde hızlandırıcı ve destekleyici bir araç olarak kullanılmıştır ve tasarım kararlarının doğrulanmasında yardımcı olmuştur.