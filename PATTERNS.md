# Design Patterns - Phase 2

---

## Phase 2 - Decorator Pattern

### Amaç
Nesnelere çalışma zamanında (runtime) yeni davranış eklemek. Inheritance yerine composition kullanarak daha esnek ve genişletilebilir bir yapı oluşturmak.

---

### Açıklama
Decorator Pattern, bir GameComponent nesnesini sararak (wrap ederek) onun davranışını genişleten bir yapıdır. Bu projede GameObjectDecorator abstract sınıfı üzerinden DamageBoostDecorator gibi somut decorator’lar kullanılarak oyun nesnelerine dinamik özellikler eklenmiştir.

Bu yapı sayesinde temel sınıflar değiştirilmeden yeni özellikler sisteme dahil edilebilmiştir.

---

### Neden Kullanıldı?
- Inheritance yerine daha esnek yapı sağlar  
- Runtime’da davranış eklenebilir  
- Open/Closed Principle’a uygundur (mevcut kod değiştirilmez, genişletilir)  
- Kod tekrarını ve karmaşık if-else yapılarını azaltır  

---

## Phase 2 - Adapter Pattern

### Amaç
Uyumsuz sistemleri birbirine uyarlamak.

---

### Açıklama
Projede bulunan LegacyEnemy sınıfı, mevcut GameComponent mimarisine doğrudan uyumlu değildir. Bu nedenle EnemyAdapter sınıfı kullanılarak legacy yapı yeni sisteme adapte edilmiştir.

Bu sayede eski kod yapısı değiştirilmeden sisteme entegre edilmiştir.

---

### Neden Kullanıldı?
- Legacy kodu değiştirmeden kullanmak  
- Eski ve yeni sistem arasında uyumluluk sağlamak  
- Geriye dönük uyumluluk (backward compatibility)  
- Sistem mimarisini bozmadan genişletilebilirlik sağlamak  

---

## Sonuç
Factory, Decorator ve Adapter pattern’leri birlikte kullanılarak esnek, genişletilebilir ve sürdürülebilir bir oyun motoru mimarisi oluşturulmuştur. Sistem, Structural Design Patterns ile modernize edilmiştir.