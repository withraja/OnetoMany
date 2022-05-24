Tugas ini dibuat untuk SYNRGY Academy Batch 4
BackEnd Developer JAVA
=============================================

Saya membuat dua buah class, yaitu Book dan Chapter sehingga membentuk dua table di database dengan keterangan sebagai berikut:

Table Book memiliki field:
1. id (Long)
2. title (String)
3. author (string)
4. year (timeStamp)
5. is_deleted (Boolean)

Table Chapter memiliki field:
1. id (Long)
2. name (String)
3. content (String)
4. book_id (Long)
5. is_deleted (Boolean)

Relasi antara table Book dan Chapter adalah One-to-Many
Table Book dan table Chapter bisa saling mengakses
Tabel ini dibuat di PostgreSQL menggunakan SpringBoot Framework


=============================================

Lalu saya melakukan

1. Insert book dengan Java (title=harryPotter, author=jk. rowling, year=2005, chapter [(name=magic broom, content=magic broom),  (name=magic wound, content=magic wound)]
   Insert (title= diary, author= oneself, year=2022)
2. GetAll books
3. Get a book title, book author, where chapter name=magic wound

=============================================

1. Menampilkan seluruh author, title, year, content, dan name dari buku beserta chapternya
2. Tampilkan jumlah buku berdasarkan author
3. Soft delete chapter
4. Soft delete book