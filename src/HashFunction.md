Документация метода Objects.hash()
---

Генерирует хэш-код для последовательности введенных значений. 
Хэш код генерируется как если бы введенные значения были помещены в массив, и массив был хэширован через вызов
метода Arrays.hashCode(Object[]).
Этот метод полезен для реализации Object.hashCode() на объектах содержащих несколько полей. 
Например, если объект имеет три поля: x, y, и z, можно было бы написать:  

    @Override public int hashCode() {
    return Objects.hash(x, y, z);
  

Хэш функции
---
A hash function is any function that can be used to map data of arbitrary size to fixed-size values. 
The values returned by a hash function are called hash values, hash codes, digests, or simply hashes. 
The values are usually used to index a fixed-size table called a hash table. Use of a hash function to index a 
hash table is called hashing or scatter storage addressing.
Hash functions and their associated hash tables are used in data storage and retrieval
applications to access data in a small and nearly constant time per retrieval, and require an amount of storage 
space only fractionally greater than the total space required for the data or records themselves. 
Hashing is a computationally and storage space efficient form of data access which avoids the non-linear 
access time of ordered and unordered lists and structured trees, and the often exponential storage requirements 
of direct access of state spaces of large or variable-length keys.
Use of hash functions relies on statistical properties of key and function interaction:
worst case behavior is intolerably bad with a vanishingly small probability, and average case behavior can be
nearly optimal (minimal collisions).[1]
Hash functions are related to (and often confused with) checksums, check digits, fingerprints, 
lossy compression, randomization functions, error-correcting codes, and ciphers. Although the concepts overlap
to some extent, each one has its own uses and requirements and is designed and optimized differently.
The hash functions differ from the concepts numbered mainly in terms of data integrity. 

Хэш функция это любая функция, которая может быть использована для сопоставления данных произвольного размера
со значениями фиксированной длины. Значения возвращаемые через хэш-функцию называются хэш значениями, хэш кодами,
дайджестами, или просто хэшами. Значения обычно используются для индексирования таблицы фиксированного размера, 
называемой хэш таблицей. Использование хэш функции для индексирования хэш таблицы называется хэширование или 
адресация распределенного хранилища. 
Хэш функции и связанные с ними хэш таблицы используются для хранения данных и поиска приложений для доступа 
к данным в меленьких и близких 


