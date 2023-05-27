# :triangular_flag_on_post: REDIS
![](/images/Redis.png)

**Redis, bir açık kaynaklı, hafıza tabanlı (in-memory) bir veri yapısı sunucusudur. İlk olarak anahtar-değer çiftlerini depolamak için kullanılan Redis, zamanla birçok farklı veri yapısı ve işlevi destekleyen bir veritabanı çözümü haline gelmiştir.**

**Redis'in temel kullanım alanları şunlardır:**

1. **Önbellekleme (Caching): Redis, hızlı ve verimli bir şekilde verileri önbelleğe almak için kullanılır. Önbellekleme, tekrarlayan sorguların yanıtlarını önbellekte saklayarak uygulama performansını artırır. Redis, yüksek hızlı hafıza tabanlı depolama özelliği sayesinde bu amaçla oldukça etkilidir.**
2. **Veritabanı: Redis, veri yapısı olarak anahtar-değer tabanlı olduğu için basit veritabanı işlevleri için kullanılabilir. İşlemci hızıyla sınırlı olmayan hafıza tabanlı yapısı, veriye anında erişim sağlar. Özellikle performans gerektiren kullanım durumlarında tercih edilebilir.**
3. **Mesaj Sırası (Message Queue): Redis, yayın/abone (publish/subscribe) modeliyle mesaj sırası (message queue) uygulamaları için kullanılabilir. Birden fazla yayıncının mesaj gönderdiği ve bir veya daha fazla abonenin bu mesajları alarak işlediği bir iletişim mekanizması sağlar.**
4. **Oturum Yönetimi: Redis, kullanıcı oturumlarını ve oturum verilerini hızlı bir şekilde saklamak ve yönetmek için kullanılabilir. Kullanıcı kimlik doğrulaması ve yetkilendirme gibi işlemler için oturum yönetimi önemli bir rol oynar, ve Redis bu konuda etkili bir çözüm sunar.**

**Spring framework ile Redis kullanmanın bazı avantajları şunlardır:**

1. **Yüksek Performans: Redis'in hafıza tabanlı yapısı, veriye anında erişim sağlar ve yüksek performans sunar. Spring ile Redis'i entegre etmek, uygulamanın veritabanı erişimi için hızlı ve verimli bir çözüm sunar.**
2. **Önbellekleme Desteği: Spring ile Redis'i birlikte kullanarak, uygulamanın performansını artırmak için önbellekleme yapabilirsiniz. Sık kullanılan verileri Redis önbelleğinde tutarak, veritabanı erişimi gerektiren işlemleri azaltabilir ve daha hızlı yanıtlar elde edebilirsiniz.**
3. **Oturum Yönetimi: Spring Session kütüphanesi ve Redis kombinasyonuyla, oturum yönetimini Redis üzerinde depolayabilirsiniz. Bu sayede oturum verilerini paylaşabilir ve yüksek ölçeklenebilirlik elde edebilirsiniz**

![](/images/7-cache.png)

![](/images/8-cache.png)



### :pushpin: localhost:8001/redis-stack/browser

![](/images/9-cache.png)
