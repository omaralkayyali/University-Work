# ⚙️ الدرس الثاني: خصائص التنسيق الشهيرة في CSS

[cite_start]يوضح هذا الدرس أبرز الخصائص البرمجية المستخدمة في تنسيق عناصر الويب بناءً على المحتوى التدريبي:

### 1. الخلفيات (CSS Background)
[cite_start]تُستخدم للتحكم في تأثيرات خلفية العناصر ومنها:
* [cite_start]`background-color`: لتحديد لون الخلفية (مثال: `darkblue`).
* [cite_start]`background-image`: لتعيين صورة كخلفية باستخدام المسار (مثال: `url('java.png')`).
* [cite_start]`background-repeat`: للتحكم في تكرار الصورة الخلفية.
* [cite_start]`background-position`: لتحديد مكان الصورة داخل الخلفية.

### 2. تنسيق النصوص (Text Formatting)
* [cite_start]**الألوان واالمحاذاة:** نستخدم `color` لتغيير لون النص، و `text-align` للمحاذاة (يمين `right`، يسار `left`، منتصف `center`، أو ضبط ممتد `justify`).
* [cite_start]**زخرفة النصوص (`text-decoration`):** تستخدم لإضافة خطوط للنص أو إزالتها ومن قيمها الشهيرة:
  * [cite_start]`overline`: خط فوق النص.
  * [cite_start]`line-through`: خط يشطب النص.
  * [cite_start]`underline`: خط تحت النص.
* [cite_start]**تحويل حالة الأحرف (`text-transform`):** (خاص باللغة الإنجليزية) وتحتوي على:
  * [cite_start]`uppercase`: أحرف كبيرة كاملة.
  * [cite_start]`lowercase`: أحرف صغيرة كاملة.
  * [cite_start]`capitalize`: الحرف الأول من كل كلمة كبير.

### 3. الخطوط والروابط والقوائم
* [cite_start]`font-size`: لتحديد حجم الخط إما بقيم مطلقة أو نسبية (مثل: `30px` أو `14px`).
* [cite_start]**تنسيق الروابط (`<a>`):** تتيح لك CSS التحكم في حالات الرابط الأربعة:
  * [cite_start]`a:link`: حالة الرابط الطبيعية قبل الزيارة.
  * [cite_start]`a:visited`: بعد أن قمت بزيارة الرابط.
  * [cite_start]`a:hover`: عند تمرير مؤشر الفأرة فوق الرابط دون ضغط.
  * [cite_start]`a:active`: لحظة النقر الفعلية على الرابط.
* [cite_start]**القوائم (`CSS List`):** يمكنك التحكم في شكل علامات القوائم المرتبة وغير المرتبة باستخدام `list-style-type` أو وضع صورة مخصصة كعلامة للقائمة باستخدام `list-style-image`.

### 4. الحدود والهوامش (Borders & Margins)
* [cite_start]**الحدود (`Border`):** تحدد إطار العنصر عبر ثلاث قيم: `border-style` (شكل الحد)، `border-width` (سمكه)، و `border-color` (لونه).
* [cite_start]**الهوامش الخارجية (`Margin`):** تحدد المساحة الفارغة خارج حدود العنصر لفصله عن العناصر الأخرى ويمكن تحديدها لكل اتجاه بشكل منفصل:
  * [cite_start]`margin-top` 
  * [cite_start]`margin-bottom` 
  * [cite_start]`margin-right` 
  * [cite_start]`margin-left`