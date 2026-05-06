# AI Log - Phase 1 (Creational Patterns)

---

## AI’a ne sordum? (Prompt)

"Bu kodda Factory Method pattern nasıl uygulanabilir? GameObject sınıfındaki if-else ile nesne oluşturma yapısını nasıl refactor edebilirim? Basit ve anlaşılır bir örnek verir misin?"

---

## AI ne yanıtladı? (Özet)

AI, GameObject sınıfının nesne oluşturma sorumluluğunu kendi içinde tutmasının SRP (Single Responsibility Principle) ihlali olduğunu belirtti.

Bu sorunu çözmek için Factory Method pattern kullanılmasını önerdi:
- GameObjectFactory adında ayrı bir sınıf oluşturulmalı
- Nesne oluşturma işlemi bu sınıfa taşınmalı
- if-else zincirleri GameObject içinden kaldırılmalı
- Böylece kod daha genişletilebilir ve bakımı kolay hale gelir

AI ayrıca bu yapının Open/Closed Principle (OCP) ile uyumlu olduğunu belirtti.

---

## Ben ne uyguladım? (Implementation)

- GameObject sınıfındaki if-else tabanlı nesne oluşturma mantığını kaldırdım
- GameObjectFactory sınıfı oluşturdum
- PLAYER, ENEMY ve ITEM nesne oluşturma işlemlerini Factory içine taşıdım
- Main sınıfını Factory üzerinden nesne oluşturacak şekilde güncelledim

---

## Neden aynı / neden farklı?

### Benzerlikler:
- AI ile aynı şekilde Factory Method pattern uyguladım
- Nesne oluşturma sorumluluğunu merkezi bir yapıya taşıdım
- SRP ve OCP prensipleri sağlandı

### Farklılıklar:
- AI genel bir çözüm verdi, ben bunu kendi proje yapımına uyarladım
- Kod yapısını GameObject mimarisine göre düzenledim
- Main akışını proje yapısına uygun şekilde sadeleştirdim

---

## Sonuç

Factory Method pattern kullanılarak GameObject içindeki nesne oluşturma sorumluluğu ayrıştırıldı.  
Sistem daha esnek, genişletilebilir ve bakımı kolay bir yapıya dönüştürüldü.