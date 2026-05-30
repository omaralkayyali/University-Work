// عمر الكيالي   - 202411008
// بشر الطباع  - 202310936

/*
   📚 تقرير مقارنة كفاءة وسلوك تراكيب البيانات المستخدمة في المشروع
   
   
   1. القائمة غير المرتبة (Unsorted List) - تم تطبيقها باستخدام Linked List مخصصة:
      - السلوك: تقوم بتخزين الكتب في النظام بناءً على ترتيب إدخالها تلقائياً.
      - الكفاءة الزمنية (Time Complexity):
        * الإضافة (Insertion): تستغرق O(n) لأننا نقوم بالمرور عبر العقد للوصول إلى نهاية القائمة وإضافة الكتاب الجديد.
        * البحث والحذف (Search & Delete): تستغرق O(n) في الحالة الأسوأ، لأننا مضطرون للمرور على العقد عقدة تلو الأخرى
          بشكل متسلسل للتحقق من رقم الكتاب (Book ID).

   2. القائمة المرتبة (Sorted List) - تم تطبيقها باستخدام مصفوفة مؤقتة + خوارزمية فرز الفقاعات (Bubble Sort):
      - السلوك: تعرض الكتب مرتبة إما حسب الرقم التعريفي أو العنوان بناءً على طلب المستخدم.
      - الكفاءة الزمنية (Time Complexity):
        * وقت الفرز: يستغرق O(n^2) بسبب وجود الدورات المتداخلة (Nested Loops) في خوارزمية Bubble Sort.
        * الميزة السلوكية: هذه الطريقة تحافظ على الترتيب الأصلي للكتب في وحدة التخزين الأساسية (Linked List) دون أي تعديل،
          حيث يتم نسخ البيانات إلى مصفوفة مؤقتة لفرزها وطباعتها ثم التخلص من المصفوفة فوراً.

   3. المكدس (Stack) - تم تطبيقه لدعم عملية التراجع (Undo):
      - السلوك: يعتمد على مبدأ "آخر من يدخل، أول من يخرج" (LIFO). ويستخدم لتخزين الحالة السابقة للكتب قبل حذفها أو تعديلها.
      - الكفاءة الزمنية (Time Complexity):
        * عمليتي الدفع والسحب (Push & Pop): تستغرق O(1) فقط، مما يضمن تسجيل العمليات واستعادتها بشكل فوري ومباشر
          دون الحاجة لأي عمليات بحث أو مرور داخل الذاكرة.

   4. الطابور (Queue) - تم تطبيقه لإدارة خط انتظار الطلاب:
      - السلوك: يعتمد على مبدأ "أول من يدخل، أول من يخرج" (FIFO). ويستخدم لجدولة الطلاب المنتظرين لاستعارة الكتب بشكل عادل.
      - الكفاءة الزمنية (Time Complexity):
        * عمليتي الإضافة والإزالة (Enqueue & Dequeue): تستغرق O(1) لأننا نعتمد على مؤشرين (front و rear) للوصول المباشر
          لبداية ونهاية الطابور مما يجعله مثالياً لإدارة الطوابير.
*/




import java.util.Scanner;

// فئة الكتاب
class Book {
    int id;
    String title;
    String author;
    int quantity;

    public Book(int id, String title, String author, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
}

// عقدة القائمة المتصلة للكتب
class BookNode {
    Book data;
    BookNode next;

    public BookNode(Book data) {
        this.data = data;
        this.next = null;
    }
}

// القائمة غير المرتبة لإدارة الكتب
class BookList {
    BookNode head;

    // إضافة كتاب في نهاية القائمة
    public void add(Book b) {
        BookNode newNode = new BookNode(b);
        if (head == null) {
            head = newNode;
            return;
        }
        BookNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // البحث عن كتاب عن طريق الرقم
    public Book find(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.data.id == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // حذف كتاب
    public boolean remove(int id) {
        if (head == null) return false;

        if (head.data.id == id) {
            head = head.next;
            return true;
        }

        BookNode current = head;
        BookNode prev = null;
        while (current != null && current.data.id != id) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            return true;
        }
        return false;
    }

    // طباعة الكتب الحالية
    public void printList() {
        if (head == null) {
            System.out.println("No books in the system.");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.data.id + ", Title: " + temp.data.title + ", Author: " + temp.data.author + ", Qty: " + temp.data.quantity);
            temp = temp.next;
        }
    }
}

// عقدة المكدس للتراجع عن الحذف أو التعديل
class UndoNode {
    String type; // "DELETE" or "UPDATE"
    int id;
    String oldTitle;
    String oldAuthor;
    int oldQty;
    UndoNode next;

    public UndoNode(String type, Book b) {
        this.type = type;
        this.id = b.id;
        this.oldTitle = b.title;
        this.oldAuthor = b.author;
        this.oldQty = b.quantity;
    }
}

// المكدس (Stack)
class MyStack {
    UndoNode top;

    public void push(String type, Book b) {
        UndoNode newNode = new UndoNode(type, b);
        newNode.next = top;
        top = newNode;
    }

    public UndoNode pop() {
        if (top == null) return null;
        UndoNode temp = top;
        top = top.next;
        return temp;
    }
}

// عقدة الطابور للطلاب
class QueueNode {
    String name;
    QueueNode next;

    public QueueNode(String name) {
        this.name = name;
        this.next = null;
    }
}

// الطابور (Queue)
class StudentQueue {
    QueueNode front, rear;

    public void enqueue(String name) {
        QueueNode newNode = new QueueNode(name);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public String dequeue() {
        if (front == null) return null;
        String name = front.name;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return name;
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        QueueNode temp = front;
        int count = 1;
        while (temp != null) {
            System.out.println(count + ". " + temp.name);
            temp = temp.next;
            count++;
        }
    }
}

// البرنامج الرئيسي
public class LibrarySystem {
    static BookList list = new BookList();
    static MyStack stack = new MyStack();
    static StudentQueue queue = new StudentQueue();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // كتب افتراضية عشان ما تبلش الفحص من الصفر قدام الدكتور
        list.add(new Book(102, "Data Structures", "Author A", 5));
        list.add(new Book(101, "Java Basics", "Author B", 3));
        list.add(new Book(103, "Computer Networks", "Author C", 2));

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Display Unsorted Books");
            System.out.println("6. Sort Books by ID");
            System.out.println("7. Sort Books by Title");
            System.out.println("8. Add Student to Queue");
            System.out.println("9. Serve Next Student");
            System.out.println("10. Display Waiting Queue");
            System.out.println("11. Undo Last Action");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (list.find(id) != null) {
                    System.out.println("Error: ID already exists!");
                    continue;
                }
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                list.add(new Book(id, title, author, qty));
                System.out.println("Book added successfully.");

            } else if (choice == 2) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                Book b = list.find(id);
                if (b != null) {
                    stack.push("DELETE", b); // تخزين الحالة قبل الحذف
                    list.remove(id);
                    System.out.println("Book deleted.");
                } else {
                    System.out.println("Book not found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                Book b = list.find(id);
                if (b != null) {
                    System.out.println("Found -> ID: " + b.id + ", Title: " + b.title + ", Author: " + b.author + ", Qty: " + b.quantity);
                } else {
                    System.out.println("Book not found.");
                }

            } else if (choice == 4) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                Book b = list.find(id);
                if (b != null) {
                    stack.push("UPDATE", b); // تخزين الحالة قبل التعديل
                    System.out.print("Enter New Title: ");
                    b.title = sc.nextLine();
                    System.out.print("Enter New Author: ");
                    b.author = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    b.quantity = sc.nextInt();
                    System.out.println("Book updated.");
                } else {
                    System.out.println("Book not found.");
                }

            } else if (choice == 5) {
                list.printList();

            } else if (choice == 6) {
                bubbleSort(true); // ترتيب حسب الرقم

            } else if (choice == 7) {
                bubbleSort(false); // ترتيب حسب العنوان

            } else if (choice == 8) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                queue.enqueue(name);
                System.out.println("Student added to queue.");

            } else if (choice == 9) {
                String name = queue.dequeue();
                if (name != null) {
                    System.out.println("Serving student: " + name);
                } else {
                    System.out.println("No students in queue.");
                }

            } else if (choice == 10) {
                queue.printQueue();

            } else if (choice == 11) {
                handleUndo();

            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

    // دالة الفرز باستخدام Bubble Sort العادي على مصفوفة مؤقتة بدون تعديل القائمة الأصلية
    public static void bubbleSort(boolean sortById) {
        if (list.head == null) {
            System.out.println("No books to sort.");
            return;
        }

        // عَدّ العناصر لعمل مصفوفة
        int count = 0;
        BookNode temp = list.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        Book[] arr = new Book[count];
        temp = list.head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.data;
            temp = temp.next;
        }

        // خوارزمية فرز الفقاعات
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                boolean swap = false;
                if (sortById) {
                    if (arr[j].id > arr[j + 1].id) swap = true;
                } else {
                    if (arr[j].title.toLowerCase().compareTo(arr[j + 1].title.toLowerCase()) > 0) swap = true;
                }

                if (swap) {
                    Book hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                }
            }
        }

        // طباعة المصفوفة المفرزة
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + arr[i].id + ", Title: " + arr[i].title + ", Author: " + arr[i].author + ", Qty: " + arr[i].quantity);
        }
    }

    // دالة التراجع
    public static void handleUndo() {
        UndoNode lastAction = stack.pop();
        if (lastAction == null) {
            System.out.println("No actions to undo.");
            return;
        }

        if (lastAction.type.equals("DELETE")) {
            Book restoredBook = new Book(lastAction.id, lastAction.oldTitle, lastAction.oldAuthor, lastAction.oldQty);
            list.add(restoredBook);
            System.out.println("Undo Done: Restored deleted book -> " + lastAction.oldTitle);
        } else if (lastAction.type.equals("UPDATE")) {
            Book b = list.find(lastAction.id);
            if (b != null) {
                b.title = lastAction.oldTitle;
                b.author = lastAction.oldAuthor;
                b.quantity = lastAction.oldQty;
                System.out.println("Undo Done: Restored original update details.");
            }
        }
    }
}

