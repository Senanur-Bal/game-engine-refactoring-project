# Design Patterns - Phase 1

---

## Factory Method Pattern

### 📌 Nedir?
Factory Method, nesne oluşturma işlemini alt sınıflara veya ayrı bir factory sınıfına devrederek nesne yaratımını merkezileştiren bir tasarım örüntüsüdür.

---

### 📍 Nerede kullanıldı?

GameObjectFactory sınıfında PLAYER, ENEMY ve ITEM nesnelerinin oluşturulmasında kullanıldı.

---

### ❗ Önceki Problem

GameObject sınıfı içinde if-else ile nesne oluşturuluyordu. Bu yapı:
- SRP (Single Responsibility Principle) ihlal ediyordu
- Yeni nesne türü eklemeyi zorlaştırıyordu
- Kodun bakımı ve okunabilirliğini düşürüyordu

---

### 🏗 Neden kullanıldı?

Nesne oluşturma sorumluluğunu ayrı bir sınıfa taşıyarak:
- Kodun daha modüler hale gelmesi
- Açık/Kapalı Prensibi’nin (OCP) sağlanması
- Sistem genişletilebilirliğinin artırılması hedeflendi

---

### 🎯 Ne kazandım?

- ✔ Nesne oluşturma merkezi hale getirildi
- ✔ GameObject sınıfı sadeleşti
- ✔ SRP ihlali azaltıldı
- ✔ OCP’ye daha uygun hale getirildi
- ✔ Yeni nesne türü eklemek kolaylaştı
- ✔ Kod daha okunabilir ve bakımı kolay hale geldi

---

### 📌 Sonuç

Factory Method pattern kullanılarak nesne oluşturma süreci merkezi hale getirilmiş ve sistem daha genişletilebilir bir yapıya kavuşmuştur.